/**
 * generated by Xtext 2.16.0
 */
package org.xtext.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Date;
import java.util.UUID;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.dialogflowConfig.AbstractWord;
import org.xtext.dialogflowConfig.Entity;
import org.xtext.dialogflowConfig.InputContext;
import org.xtext.dialogflowConfig.OutputContext;
import org.xtext.dialogflowConfig.Parameter;
import org.xtext.dialogflowConfig.TrainingPhrase;
import org.xtext.dialogflowConfig.impl.AgentImpl;
import org.xtext.dialogflowConfig.impl.EntityTypeImpl;
import org.xtext.dialogflowConfig.impl.IntentImpl;
import org.xtext.dialogflowConfig.impl.TextImpl;
import org.xtext.dialogflowConfig.impl.TokenImpl;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DialogflowConfigGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final AgentImpl Agent = ((AgentImpl[])Conversions.unwrapArray(Iterables.<AgentImpl>filter(resource.getContents(), AgentImpl.class), AgentImpl.class))[0];
    final Iterable<IntentImpl> intents = Iterables.<IntentImpl>filter(Agent.getElements(), IntentImpl.class);
    final Iterable<EntityTypeImpl> entityTypes = Iterables.<EntityTypeImpl>filter(Agent.getElements(), EntityTypeImpl.class);
    for (final IntentImpl intent : intents) {
      {
        this.generateIntentFile(fsa, intent);
        this.generateIntentUsersaysFile(fsa, intent);
      }
    }
    for (final EntityTypeImpl entityType : entityTypes) {
      {
        this.generateEntityFile(fsa, entityType);
        this.generateEntityUsersaysFile(fsa, entityType);
      }
    }
  }
  
  protected void generateEntityUsersaysFile(final IFileSystemAccess2 fsa, final EntityTypeImpl entityType) {
    if ((entityType.isDynamic() || entityType.isBuiltIn())) {
      return;
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entities/");
    String _name = entityType.getName();
    _builder.append(_name);
    _builder.append("_entries_en.json");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("[");
    _builder_1.newLine();
    {
      EList<Entity> _values = entityType.getValues();
      for(final Entity entity : _values) {
        _builder_1.append("\t");
        {
          Entity _get = entityType.getValues().get(0);
          boolean _notEquals = (!Objects.equal(entity, _get));
          if (_notEquals) {
            _builder_1.append(",");
          }
        }
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("{");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("\t");
        _builder_1.append("\"value\": \"");
        String _name_1 = entity.getName();
        _builder_1.append(_name_1, "\t\t");
        _builder_1.append("\",");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("\t");
        _builder_1.append("\"synonyms\": [");
        _builder_1.newLine();
        {
          EList<String> _synonyms = entity.getSynonyms();
          for(final String synonym : _synonyms) {
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            {
              String _get_1 = entity.getSynonyms().get(0);
              boolean _notEquals_1 = (!Objects.equal(synonym, _get_1));
              if (_notEquals_1) {
                _builder_1.append(",");
              }
            }
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("\"");
            _builder_1.append(synonym, "\t\t\t");
            _builder_1.append("\"");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("\t");
        _builder_1.append("\t");
        _builder_1.append("]");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
      }
    }
    _builder_1.append("]");
    _builder_1.newLine();
    fsa.generateFile(_builder.toString(), _builder_1);
  }
  
  protected void generateEntityFile(final IFileSystemAccess2 fsa, final EntityTypeImpl entityType) {
    if ((entityType.isDynamic() || entityType.isBuiltIn())) {
      return;
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entities/");
    String _name = entityType.getName();
    _builder.append(_name);
    _builder.append(".json");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("{");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("\"id\": \"");
    UUID _randomUUID = UUID.randomUUID();
    _builder_1.append(_randomUUID, "    ");
    _builder_1.append("\",");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("    ");
    _builder_1.append("\"name\": \"");
    String _name_1 = entityType.getName();
    _builder_1.append(_name_1, "    ");
    _builder_1.append("\",");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append("\"isOverridable\": ");
    boolean _isIsOverridable = entityType.isIsOverridable();
    _builder_1.append(_isIsOverridable, "\t");
    _builder_1.append(",");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append("\"isEnum\": ");
    boolean _isIsEnum = entityType.isIsEnum();
    _builder_1.append(_isIsEnum, "\t");
    _builder_1.append(",");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append("\"automatedExpansion\": ");
    boolean _isAutomatedExpansion = entityType.isAutomatedExpansion();
    _builder_1.append(_isAutomatedExpansion, "\t");
    _builder_1.append(",");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append("\"allowFuzzyExtraction\": ");
    boolean _isAllowFuzzyExtraction = entityType.isAllowFuzzyExtraction();
    _builder_1.append(_isAllowFuzzyExtraction, "\t");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("}");
    _builder_1.newLine();
    fsa.generateFile(_builder.toString(), _builder_1);
  }
  
  protected void generateIntentUsersaysFile(final IFileSystemAccess2 fsa, final IntentImpl intent) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("intents/");
    String _name = intent.getName();
    _builder.append(_name);
    _builder.append("_usersays_en.json");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("[");
    _builder_1.newLine();
    {
      EList<TrainingPhrase> _trainingPhrases = intent.getTrainingPhrases();
      for(final TrainingPhrase phrase : _trainingPhrases) {
        {
          TrainingPhrase _get = intent.getTrainingPhrases().get(0);
          boolean _notEquals = (!Objects.equal(phrase, _get));
          if (_notEquals) {
            _builder_1.append(",");
          }
        }
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("{");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("\"id\": \"");
        UUID _randomUUID = UUID.randomUUID();
        _builder_1.append(_randomUUID, "    ");
        _builder_1.append("\",");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("    ");
        _builder_1.append("\"data\": [");
        _builder_1.newLine();
        {
          EList<AbstractWord> _data = phrase.getData();
          for(final AbstractWord datum : _data) {
            _builder_1.append("    ");
            {
              AbstractWord _get_1 = phrase.getData().get(0);
              boolean _notEquals_1 = (!Objects.equal(datum, _get_1));
              if (_notEquals_1) {
                _builder_1.append(",");
              }
            }
            _builder_1.newLineIfNotEmpty();
            {
              if ((datum instanceof TokenImpl)) {
                _builder_1.append("    ");
                _builder_1.append("{");
                _builder_1.newLine();
                _builder_1.append("    ");
                _builder_1.append("  ");
                _builder_1.append("\"text\": \"");
                String _name_1 = ((TokenImpl)datum).getType().getName();
                _builder_1.append(_name_1, "      ");
                _builder_1.append("\",");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("    ");
                _builder_1.append("  ");
                _builder_1.append("\"alias\": \"");
                String _name_2 = ((TokenImpl)datum).getType().getName();
                _builder_1.append(_name_2, "      ");
                _builder_1.append("\",");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("    ");
                _builder_1.append("  ");
                _builder_1.append("\"meta\": \"@");
                {
                  boolean _isBuiltIn = ((TokenImpl)datum).getType().isBuiltIn();
                  if (_isBuiltIn) {
                    _builder_1.append("sys.");
                  }
                }
                String _name_3 = ((TokenImpl)datum).getType().getName();
                _builder_1.append(_name_3, "      ");
                _builder_1.append("\",");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("    ");
                _builder_1.append("  ");
                _builder_1.append("\"userDefined\": true");
                _builder_1.newLine();
                _builder_1.append("    ");
                _builder_1.append("}");
                _builder_1.newLine();
              } else {
                if ((datum instanceof TextImpl)) {
                  _builder_1.append("    ");
                  _builder_1.append("{");
                  _builder_1.newLine();
                  _builder_1.append("    ");
                  _builder_1.append("\"text\": \"");
                  String _text = ((TextImpl)datum).getText();
                  _builder_1.append(_text, "    ");
                  _builder_1.append("\",");
                  _builder_1.newLineIfNotEmpty();
                  _builder_1.append("    ");
                  _builder_1.append("\"userDefined\": false");
                  _builder_1.newLine();
                  _builder_1.append("    ");
                  _builder_1.append("}");
                  _builder_1.newLine();
                }
              }
            }
          }
        }
        _builder_1.append("    ");
        _builder_1.append("],");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("\"isTemplate\": false,");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("\"count\": 0,");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("\"updated\": ");
        long _time = new Date().getTime();
        long _divide = (_time / 1000);
        _builder_1.append(_divide, "    ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  \t");
        _builder_1.append("}");
        _builder_1.newLine();
      }
    }
    _builder_1.append("\t");
    _builder_1.append("]");
    _builder_1.newLine();
    fsa.generateFile(_builder.toString(), _builder_1);
  }
  
  protected void generateIntentFile(final IFileSystemAccess2 fsa, final IntentImpl intent) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("intents/");
    String _name = intent.getName();
    _builder.append(_name);
    _builder.append(".json");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("{");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"id\": \"");
    UUID _randomUUID = UUID.randomUUID();
    _builder_1.append(_randomUUID, "\t");
    _builder_1.append("\",");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t  ");
    _builder_1.append("\"name\": \"");
    String _name_1 = intent.getName();
    _builder_1.append(_name_1, "\t  ");
    _builder_1.append("\",");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t  ");
    _builder_1.append("\"auto\": true,");
    _builder_1.newLine();
    _builder_1.append("\t  ");
    _builder_1.append("\"contexts\": [");
    _builder_1.newLine();
    {
      EList<InputContext> _inputContexts = intent.getInputContexts();
      for(final InputContext context : _inputContexts) {
        _builder_1.append("\t  ");
        {
          InputContext _get = intent.getInputContexts().get(0);
          boolean _notEquals = (!Objects.equal(context, _get));
          if (_notEquals) {
            _builder_1.append(",");
          }
        }
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t  ");
        _builder_1.append("\"");
        String _name_2 = context.getType().getName();
        _builder_1.append(_name_2, "\t  ");
        _builder_1.append("\"");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.append("\t  ");
    _builder_1.append("],");
    _builder_1.newLine();
    _builder_1.append("\t  ");
    _builder_1.append("\"responses\": [");
    _builder_1.newLine();
    _builder_1.append("\t    ");
    _builder_1.append("{");
    _builder_1.newLine();
    _builder_1.append("\t      ");
    _builder_1.append("\"resetContexts\": false,");
    _builder_1.newLine();
    _builder_1.append("\t      ");
    _builder_1.append("\"affectedContexts\": [");
    _builder_1.newLine();
    {
      EList<OutputContext> _affectedContexts = intent.getAffectedContexts();
      for(final OutputContext context_1 : _affectedContexts) {
        _builder_1.append("\t        ");
        {
          OutputContext _get_1 = intent.getAffectedContexts().get(0);
          boolean _notEquals_1 = (!Objects.equal(context_1, _get_1));
          if (_notEquals_1) {
            _builder_1.append(",");
          }
        }
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t        ");
        _builder_1.append("        ");
        _builder_1.append("{");
        _builder_1.newLine();
        _builder_1.append("\t        ");
        _builder_1.append("          ");
        _builder_1.append("\"name\": \"");
        String _name_3 = context_1.getType().getName();
        _builder_1.append(_name_3, "\t                  ");
        _builder_1.append("\",");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t        ");
        _builder_1.append("          ");
        _builder_1.append("\"parameters\": {},");
        _builder_1.newLine();
        _builder_1.append("\t        ");
        _builder_1.append("          ");
        _builder_1.append("\"lifespan\": ");
        int _xifexpression = (int) 0;
        int _lifespan = context_1.getLifespan();
        boolean _greaterThan = (_lifespan > 0);
        if (_greaterThan) {
          _xifexpression = context_1.getLifespan();
        } else {
          _xifexpression = 5;
        }
        _builder_1.append(_xifexpression, "\t                  ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t        ");
        _builder_1.append("        ");
        _builder_1.append("}");
        _builder_1.newLine();
      }
    }
    _builder_1.append("\t      ");
    _builder_1.append("],");
    _builder_1.newLine();
    _builder_1.append("\t      ");
    _builder_1.append("\"parameters\": [");
    _builder_1.newLine();
    {
      EList<Parameter> _parameters = intent.getParameters();
      for(final Parameter param : _parameters) {
        _builder_1.append("\t        ");
        {
          Parameter _get_2 = intent.getParameters().get(0);
          boolean _notEquals_2 = (!Objects.equal(param, _get_2));
          if (_notEquals_2) {
            _builder_1.append(",");
          }
        }
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t        ");
        _builder_1.append("{");
        _builder_1.newLine();
        _builder_1.append("\t        ");
        _builder_1.append("  ");
        _builder_1.append("\"id\": \"");
        UUID _randomUUID_1 = UUID.randomUUID();
        _builder_1.append(_randomUUID_1, "\t          ");
        _builder_1.append("\",");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t        ");
        _builder_1.append("  ");
        _builder_1.append("\"required\": ");
        boolean _isRequired = param.isRequired();
        _builder_1.append(_isRequired, "\t          ");
        _builder_1.append(",");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t        ");
        _builder_1.append("  ");
        _builder_1.append("\"dataType\": \"@");
        {
          boolean _isBuiltIn = param.getType().isBuiltIn();
          if (_isBuiltIn) {
            _builder_1.append("sys.");
          }
        }
        String _name_4 = param.getType().getName();
        _builder_1.append(_name_4, "\t          ");
        _builder_1.append("\",");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t        ");
        _builder_1.append("  ");
        _builder_1.append("\"name\": \"");
        String _name_5 = param.getType().getName();
        _builder_1.append(_name_5, "\t          ");
        _builder_1.append("\",");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t        ");
        _builder_1.append("  ");
        _builder_1.append("\"value\": \"$");
        String _name_6 = param.getType().getName();
        _builder_1.append(_name_6, "\t          ");
        _builder_1.append("\",");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t        ");
        _builder_1.append("  ");
        _builder_1.append("\"isList\": ");
        boolean _isList = param.isList();
        _builder_1.append(_isList, "\t          ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t        ");
        _builder_1.append("}");
        _builder_1.newLine();
      }
    }
    _builder_1.append("\t      ");
    _builder_1.append("],");
    _builder_1.newLine();
    _builder_1.append("\t      ");
    _builder_1.append("\"messages\": [");
    _builder_1.newLine();
    _builder_1.append("\t      ");
    _builder_1.append("{");
    _builder_1.newLine();
    _builder_1.append("\t          ");
    _builder_1.append("\"type\": 0,");
    _builder_1.newLine();
    _builder_1.append("\t          ");
    _builder_1.append("\"lang\": \"en\",");
    _builder_1.newLine();
    _builder_1.append("\t          ");
    _builder_1.append("\"speech\": ");
    _builder_1.newLine();
    _builder_1.append("\t          ");
    _builder_1.append("[");
    _builder_1.newLine();
    {
      EList<String> _responses = intent.getResponses();
      for(final String response : _responses) {
        _builder_1.append("\t       ");
        {
          String _get_3 = intent.getResponses().get(0);
          boolean _notEquals_3 = (!Objects.equal(response, _get_3));
          if (_notEquals_3) {
            _builder_1.append(",");
          }
        }
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t       ");
        _builder_1.append(" \t");
        _builder_1.append("\"");
        _builder_1.append(response, "\t        \t");
        _builder_1.append("\"");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.append("\t      \t");
    _builder_1.append("]");
    _builder_1.newLine();
    _builder_1.append("\t      ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t      ");
    _builder_1.append("],");
    _builder_1.newLine();
    _builder_1.append("\t      ");
    _builder_1.append("\"defaultResponsePlatforms\": {},");
    _builder_1.newLine();
    _builder_1.append("\t      ");
    _builder_1.append("\"speech\": []");
    _builder_1.newLine();
    _builder_1.append("\t    ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t  ");
    _builder_1.append("],");
    _builder_1.newLine();
    _builder_1.append("\t  ");
    _builder_1.append("\"priority\": 500000,");
    _builder_1.newLine();
    _builder_1.append("\t  ");
    _builder_1.append("\"webhookUsed\": ");
    boolean _isWebHook = intent.isWebHook();
    _builder_1.append(_isWebHook, "\t  ");
    _builder_1.append(",");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t  ");
    _builder_1.append("\"webhookForSlotFilling\": ");
    boolean _isWebHookForSlotFilling = intent.isWebHookForSlotFilling();
    _builder_1.append(_isWebHookForSlotFilling, "\t  ");
    _builder_1.append(",");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t  ");
    _builder_1.append("\"lastUpdate\": ");
    long _time = new Date().getTime();
    long _divide = (_time / 1000);
    _builder_1.append(_divide, "\t  ");
    _builder_1.append(",");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t  ");
    _builder_1.append("\"fallbackIntent\": false,");
    _builder_1.newLine();
    _builder_1.append("\t  ");
    _builder_1.append("\"events\": []");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    fsa.generateFile(_builder.toString(), _builder_1);
  }
}
