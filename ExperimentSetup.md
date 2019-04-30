# Experiment Setup

## Questions

Do I need any approval from Uni-Potsdamm or HPI for my experiment?  
=> Looks like I do not.

---

## Recruiting

Current plan is to recruit from HPI Students. I am unlikely to have access to software professionals.
''comment Chris. I have a large network of professional programmers. We could tackle it in case you want to replicate the experiment.''

## Inclusion Criteria

No GPL is used, so no specific language experience is neccessary, but some general Programmming experience is likely needed for users to be familliar with writing code. Additionally experience with either Eclipse or VS-Code might be beneficial.

## Consent

Consent will ony be needed insofar as mandated by HPI / Uni-Potsdam rules. The experiment does not call for any additional care.
''comment Chris. It is a good practice however to ask for consent (simple one).''

## Procedure

### Basic Control Group / Experimental Group setup

Each participant is assigned to a group and carries out the tasks described below.
This is the default solution that I would use.

### Interrupted time-series

Sounds worthwhile for showing impact of introducing a tool but requires more time from participants.  

### Field Trial

Alternatively / additionaly the Tool could be field trialed in my BP-team to collect metrics from extended use. Expecially comparing out current code reviews (using diffs in the Agent Json) to later code reviews (using diffs in DSL code).
It might be worthwhile to collect additional feedback from team members after using the tool for development internally. Carries the risk of significant bias in favour of the tool when tested by Friends / Team members.
For the DSL it might be possible to explain external benefits (Git, Version History, Code Reviews), that can only be seen over long term use, and then quantify the cost / additional benefit of the tool through showing an increase / decrease of task completion time.
--- comment Chris. Plan to run a pilot study first.

## Demographic data

Is easy to collect, but I am unsure whether analysing it provides any benefit. 
''comment Chris. I believe demographic data is very important, e.g., age, gender, programming experience (years), programming languages.''

## Group Assignment

If interrupted time series is used, no group assignment need take place. Otherwise random asignment seems to be the most prudent choice.

## Training

If Groups are used, one group will need introduction to the Web interface, and the generated JSONs while the other group will need introduction to the DSL.
Both groups will be introduced to the testing console.
Some additional tools (git, node scripts for managing agent jsons) will be prepared, and likely a cheat-sheet with commands for these tools will be available (e.g. "node importAgent" and "git commit").

## Tasks

One possible setup would be for both teams to make edits to the agent according to some specific instructions, and then have another praticipant review the edits to the agent. This way a typical workflow from iterative work in a software development team is simulated.

More specifically, each participant will find a computer with all neccessary tools installed and opened. 

''comment Chris. You would need to compute the sample size (number of participants) necessary for the experiment to have higher probability of detecting a signifcant difference between the two conditions. This can be done by estimating the effect size that you expect to detect when comparing control group and treatment group. Look at how to perform a power analysis (e.g., https://www.youtube.com/watch?v=9LVD9oLg1A0)''

In the control group this means:  
#### Part one: Development  
 - Chrome with the dialogflow console opened and Agent allready created  
 - Chrome with the Actions on Google testing console opened  
 - Shell with the utility scripts available (exportAgent.js and node)  
 - Shell with git available to commit changes at the end of the task

For the Experimental group:  
#### Part one: Development    
 - Eclipse or VSCode window with DSL code of the existing Agent  
 - Shell with utility scripts available (importAgent.js and node)
 - Chrome with the Actions on Google testing console opened
 - Shell with git available to commit changes at the end of the task

For both groups:  
#### Part two: Review  
 - Chrome  with Github pull request for code review

## Outcome measurement

Multiple things can be measured:
Time to completion for part one of the task.
Time to completion for part two of the task.
Quality of the result (Fullfillment of the specifications described in the task).  
I am unsure if anything other than time can be measured from the code review. Maybe a rating by the reviewer about how confident he is in his review?
''comments Chris. Other interesting measurements: perceived difficulty, confidence, previous experience with similar task, coding skill. These all could be used to run a correlation analysis with the quality of the results.''

## Debrief

Explain to the participant what the study was investigating.
Explain why was the study important to conduct.
Explain how the participant’s data will be used to investigate the question.
Explain the correct solutions to the tasks.
Demo the DSL tool to those participants who did not get to use it themselves.
Provide contact information so that the participant can ask further questions if they want to know more about the research.

Ask Participants not to tell later participants about the solutions of the task.

Cake? Chocolate? Something like that.
