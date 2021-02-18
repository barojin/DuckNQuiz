The java files in 603hw1/src/school.assessment was written in accordance with instruction of hw1.
The java files in assessment2 was made to remove the reuse of the mark function and has a different structure of above one.
The public boolean mark(String ans) in interface Question have a duplication in concrete child classes since interface cannot have a body of the method.
Therefore I made the relationship like below figure for the resuabiltiy and maintaiabilty.

[Abstract: Quiz]   <-   [Interface: Question]
    ^                     ^              ^
    |                     |              |
  class:               class:         class:
 midterm             FillinQuestion   MultichoiceQuestion

How to run on mac:
in the path '603hw1/out/artifacts/'
command that 'java -jar 603hw1_jar' on the terminal.

PS.
The java files in duck was written based on the example in Head First: Design Patterns, ch1.


