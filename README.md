## OO Basics
Abstraction
Encapsulation
Polymorphism
Inheritance.

## OO Principles
Excapsulate what varies
Favor composition over inheritance
Program to interfaces, not implementations.

## Startegy Pattern
It defines a family of algorithms,
encapsulates each one,
and makes them interchangeable.
Strategy lets the algirhtms vary independently from clients that use it.
e.g. encapsulate the set of concrete classes in a group of interface class -> abstract class -> interface -> set of classes the specific class inherits the abstract class, implement the behavior by setting at runtime.

# DuckNQuiz.
The java files in src/duck/ was written based on the example in Head First Design Patterns: Building Extensible and Maintainable Object-Oriented Software 2nd Edition, ch1.

The java files in assessment2 package was made to remove the reuse of the mark function in assessment package.
The public boolean mark(String ans) in interface Question have a duplication in concrete child classes since interface cannot have a body of the method.
Therefore I made the abstract class before accessing the interface that are maintainable and extensible.

How to run on mac: in the path './603hw1/out/artifacts/' command that 'java -jar 603hw1_jar' on the terminal.

![Image of class diagram](https://github.com/barojin/DuckNQuiz/class_diagram.png)
