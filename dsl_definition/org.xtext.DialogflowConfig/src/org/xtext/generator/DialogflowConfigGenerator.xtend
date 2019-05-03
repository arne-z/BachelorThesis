/*
 * generated by Xtext 2.16.0
 */
package org.xtext.generator

import java.util.Date
import java.util.UUID
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.dialogflowConfig.impl.AgentImpl
import org.xtext.dialogflowConfig.impl.EntityTypeImpl
import org.xtext.dialogflowConfig.impl.IntentImpl
import org.xtext.dialogflowConfig.impl.TextImpl
import org.xtext.dialogflowConfig.impl.customTokenImpl
import org.xtext.dialogflowConfig.impl.builtinTokenImpl
import org.xtext.dialogflowConfig.Parameter
import java.util.Map
import java.util.HashMap

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DialogflowConfigGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // .dfc file can only contain one Agent.
        val agent = resource.contents.filter(AgentImpl).get(0)

        val intents = agent.elements.filter(IntentImpl)
        val entityTypes = agent.elements.filter(EntityTypeImpl)

        generateAgentFile(fsa, agent)

        generatePackageFile(fsa, agent)

        for (intent : intents) {
            generateIntentFile(fsa, agent, intent)
            generateIntentUsersaysFile(fsa, agent, intent)
        }

        for (entityType : entityTypes) {
            generateEntityFile(fsa, entityType)
            generateEntityUsersaysFile(fsa, agent, entityType)
        }
    }

    protected def void generatePackageFile(IFileSystemAccess2 fsa, AgentImpl agent) {
        fsa.generateFile('''package.json''', '''
            {
              "version": �IF agent.version !== null ��agent.version��ELSE�"1.0.0"�ENDIF�
            }
        ''')
    }

    protected def void generateAgentFile(IFileSystemAccess2 fsa, AgentImpl agent) {
        fsa.generateFile(
            '''agent.json''',
            '''
                {
                  "description": "�IF agent.description !== null��agent.description��ENDIF�",
                  "language": "�agent.language�",
                  "disableInteractionLogs": �!agent.interactionLogs�,
                  "disableStackdriverLogs": �!agent.stackdriverLogs�,
                  �IF agent.webhook !== null�
                      "webhook": {
                          �IF agent.webhook.url !== null�
                              "url": "�agent.webhook.url�",
                          �ENDIF�
                          �IF !agent.webhook.headers.empty�
                              "headers": {
                                 �FOR header: agent.webhook.headers�
                                     �IF header != agent.webhook.headers.get(0)�,�ENDIF�
                                     "�header.key�": "�header.value�"    
                                 �ENDFOR�
                              },
                          �ENDIF�
                      "available": �agent.webhook.available�,
                      "useForDomains": false,
                      "cloudFunctionsEnabled": false,
                      "cloudFunctionsInitialized": false
                      },
                  �ENDIF�
                  "isPrivate": �agent.isPrivate�,
                  "customClassifierMode": �IF agent.hybridMatchMode�"use.after"�ELSE�"use.instead"�ENDIF�,
                  "mlMinConfidence": �IF agent.mlMinConfidence !== null� �agent.mlMinConfidence� �ELSE� 0.4 �ENDIF�,
                  "onePlatformApiVersion": "v2"
                }
            '''
        )
    }

    protected def void generateEntityUsersaysFile(IFileSystemAccess2 fsa, AgentImpl agent, EntityTypeImpl entityType) {
        if(entityType.dynamic) return;
        fsa.generateFile(
            '''entities/�entityType.name�_entries_�agent.language�.json''',
            '''
                [
                	�FOR entity : entityType.values�
                	    �IF entity != entityType.values.get(0)�,�ENDIF�
                	    {
                	    	"value": "�entity.name�",
                	    	"synonyms": [
                	    		�FOR synonym :entity.synonyms�
                	    		    �IF synonym != entity.synonyms.get(0)�,�ENDIF�
                	    		    "�synonym�"
                	    		�ENDFOR�
                	    	]
                	    }
                	�ENDFOR�
                ]
            '''
        )
    }

    protected def void generateEntityFile(IFileSystemAccess2 fsa, EntityTypeImpl entityType) {
        if(entityType.dynamic) return;
        fsa.generateFile(
            '''entities/�entityType.name�.json''',
            '''
                {
                    "id": "�UUID.randomUUID()�",
                    "name": "�entityType.name�",
                	"isOverridable": �entityType.isOverridable�,
                	"isEnum": �entityType.isEnum�,
                	"automatedExpansion": �entityType.automatedExpansion�,
                	"allowFuzzyExtraction": �entityType.allowFuzzyExtraction�
                }
            '''
        )
    }

    protected def void generateIntentUsersaysFile(IFileSystemAccess2 fsa, AgentImpl agent, IntentImpl intent) {
        if (!intent.trainingPhrases.empty) {
            fsa.generateFile(
                '''intents/�intent.name�_usersays_�agent.language�.json''',
                '''
                    [
                    �FOR phrase : intent.trainingPhrases�
                        �IF phrase != intent.trainingPhrases.get(0)�,�ENDIF�
                          {
                            "id": "�UUID.randomUUID()�",
                            "data": [
                            �FOR datum: phrase.data�
                                �IF datum != phrase.data.get(0)�,�ENDIF�
                                �IF datum instanceof customTokenImpl�
                                    {
                                      "text": "�datum.type.name�",
                                      "alias": "�datum.type.name�",
                                      "meta": "@�datum.type.name�",
                                      "userDefined": true
                                    }
                                �ELSEIF datum instanceof builtinTokenImpl�
                                    {
                                      "text": "�datum.type�",
                                      "alias": "�datum.type�",
                                      "meta": "@sys.�datum.type.toString().replace('_','-')�",
                                      "userDefined": true
                                    }
                                    
                                �ELSEIF datum instanceof TextImpl�
                                    {
                                    "text": "�datum.text�",
                                    "userDefined": false
                                    }
                                �ENDIF�
                            �ENDFOR�
                            ],
                            "isTemplate": false,
                            "count": 0,
                            "updated": �new Date().time/1000�
                          	}
                    	�ENDFOR�
                    	]
                '''
            )
        } else if (intent.file !== null) {
            fsa.generateFile(
                '''intents/�intent.name�_usersays_�agent.language�.json''',
                fsa.readTextFile(intent.file)
            )
        }
    }

    private static final class Param {
        String datatype;
        String name;
        String value;
    }

    protected def Param getParamTypeName(Parameter param) {
        var obj = new Param();
        if (param.builtInType !== null) {
            var temp = param.builtInType.toString().replace('_', '-');
            obj.datatype = '@sys.' + temp;
            obj.name = temp;
            obj.value = '$' + temp;
        } else {
            var temp = param.type.toString();
            obj.datatype = temp;
            obj.name = temp;
            obj.value = '$' + temp;
        }
        return obj;
    }

    protected def void generateIntentFile(IFileSystemAccess2 fsa, AgentImpl agent, IntentImpl intent) {
        fsa.generateFile(
            '''intents/�intent.name�.json''',
            '''
                {
                	"id": "�UUID.randomUUID()�",
                	  "name": "�intent.name�",
                	  "auto": �intent.disable_ml�,
                	  "contexts": [
                	  �FOR context : intent.inputContexts�
                	      �IF context != intent.inputContexts.get(0)�,�ENDIF�
                	      "�context.type.name�"
                	  �ENDFOR�
                	  ],
                	  "responses": [
                	    {
                	      "resetContexts": false,
                	      �IF intent.action !== null�
                	          "action": "�intent.action�",
                	      �ENDIF�
                	      "affectedContexts": [
                	        �FOR context : intent.affectedContexts�
                	            �IF context != intent.affectedContexts.get(0)�,�ENDIF�
                	                    {
                	                      "name": "�context.type.name�",
                	                      "parameters": {},
                	                      "lifespan": �if(context.lifespan > 0){context.lifespan}else{5}�
                	                    }
                	        �ENDFOR�
                	      ],
                	      "parameters": [
                	        �FOR param : intent.parameters�
                	            �IF param != intent.parameters.get(0)�,�ENDIF�
                	                {
                	                  "id": "�UUID.randomUUID()�",
                	                  "required": �param.required�,
                	                  "dataType": "�getParamTypeName(param).datatype�",
                	                  "name": "�getParamTypeName(param).name�",
                	                  "value": "�getParamTypeName(param).value�",
                	                  �FOR prompt: param.prompts�
                	                      "prompts": [
                	                                  {
                	                                    "lang": "�agent.language�",
                	                                    "value": "�prompt�"
                	                                  }
                	                      ],
                	                  �ENDFOR�
                	                  "isList": �param.list�
                	                }
                	        �ENDFOR�
                	      ],
                	      �IF !intent.responses.empty�
                	          "messages": [
                	              {
                	                  "type": 0,
                	                  "lang": "�agent.language�",
                	                  "speech": 
                	                  [
                	              �FOR response : intent.responses�
                	                  �IF response != intent.responses.get(0)�,�ENDIF�
                	                   	"�response�"
                	              �ENDFOR�
                	              ]
                	              }
                	          ],
                	      �ENDIF�
                	      "defaultResponsePlatforms": {},
                	      "speech": []
                	    }
                	  ],
                	  "priority": 500000,
                	  "webhookUsed": �intent.webHookFulfillment�,
                	  "webhookForSlotFilling": �intent.webHookForSlotFilling�,
                	  "lastUpdate": �new Date().time/1000�,
                	  "fallbackIntent": false,
                	  "events": [
                	   �FOR event : intent.events�
                	       �IF event != intent.events.get(0)�,�ENDIF�
                	               {
                	                 "name": "�event�"
                	               }
                	   �ENDFOR�
                	  ]
                }
            '''
        )
    }
}
