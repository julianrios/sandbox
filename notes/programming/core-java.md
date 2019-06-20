# Core Java
## What is Java
### Programming Language
* Syntax, Data Types, Control Flow, Object-Oriented

### Runtime Environment aka Java Standarnd Edition
* Configuration, Security, Threading, Input/Ouput

## Java Runtime Environment (JRE)
* Required to run Java apps
* End users usually require only the JRE
* The JRE provides what we need to display our code in any host environment. 

## Java Development Kit (JDK)
* Provides tools required to create Java apps 
* Developers normally require the JDK the JRE is included to run them
* *Feeding our source code into the JDK creates our application using abstraction to create byte-code -> byte code is platform independent -> can run in different host environments*

## Primitive Data Types
### Integer Types
byte, short, int, long 
### Floating Point Types
float, double 
### Character and Boolean Types
boolean, char
## Primitives
Are stored by value.

## Arrays
Provides an ordered collection of elements of a common type (allows to store values of common type).
### Benefits:
1. Easier access to any element using the index.
2. Easy to manipulate and store large data.
3. It can be used to implement other data structures like linked lists, stacks, queues, trees, graphs etc.
4. 2D arrays are used to represent matrices.

### Disadvantages:
1. Fixed size. Can not be increased or decrease once declared.
2. Since array is of fixed size, if we allocate more memory than requirement then the memory space will be wasted. And if we allocate less memory than requirement, then it will create problem.
3. Can store a single type of primitives only.
4. The elements of array are stored in consecutive memory locations. So insertions and deletions are very difficult and time consuming.

## For-each Loop
Executes a statment once for each member in the array.

## Encapsulation
### Access Modifiers 
[Resource Link ](https://medium.com/java-for-absolute-dummies/the-public-protected-package-and-private-of-java-418b2563de67)
* Control what information or data can be accessible by other classes. 
* public, private, protected, and package protected

#### Package Protected 
* The keyword package as the name implies is used to allow access only to classes in the same package with it. 
* Methods and field without an access modifier is automatically declared package protected.

## this 
* Refers to the current object. 
* Allows an object to pass itself as a reference. 
* Reduces ambiguity (issues that are not defined clearly)

## null
* Represents an uncreated object.
* Can be assigned to any reference variable.

## Constructor 
* Method that executes code during object creation to set the initial state
* Constructor chaining use the keyword this followed by the parameter list
* Can use access modifiers to control the visibility of our constructors
* * Limits what code can perform specific creations

## Order matters
* Field initialization, Initialization block, and Constructor


## Lambdas
Anonymous functions building blocks for a more declarative style of coding functional programming. It is basically syntactic sugar creating what was already available to us through creating inline anonymous classes. Legible and consise. A method outside of a class is called a function. When you have a unnamed anonymous function it is called a lambda. Lambdas can be used anywhere where SAMs (Single Abstract Methods) were used before they are now called functional interfaces. 

Expression type body a function that accepts two books and returns the value from the statement.

A consumer is a functional interface (new name for Single Abstract Methods) a consumer expects a parameter that takes one of its container's types. 

Method references can be used in place where lambdas are expected. 

```Collections.sort(books, Comparator.comparing(Book::getTitle));```

The class book has a method getTitle on it and it should use that. Use the getTitle method on each instace to get the value that will be used for the comparing command.

## Composing functions
Chaining Functions with andThen
The first method runs the results are passed to it just like a chain

```boldCleaner.andThen(Html::externalizeLinks)```
boldCleaner function runs then the results are passed to the method reference.

Compose allows you to prepend your function to the start of the function chain.

```sanitizer.compose(Markdown::render)``` 
takes the method reference first and passes it to the compose function. 

## Functional Interface
Consumers can save the day and help with the execute around method.

Unfortunately the `Consumer` functional interface doesn't throw an exception. So let's make our own!

## Optionals
Optional is intended to provide a limited mechanism for library method return types where there is a clear need to represent "no result" and where using null for that is overwhelmingly likely to cause errors." Unfortunately they get misused, let's clear that up through some common pitfall clean-ups.

Optionals are made to only really be used for return values. Don't really need to expose them to your api as long as however you are using it as what you are trying to use it for. Just take the optional as it comes out and do with it what you should. Treat it imperatively not declaritively. Don't make other people deal with it.

OOP is a software program with a bunch of distant programs working together.
A software program can be defined by how different objects interact with each other. Have their own their own charactersitcs and attributes and also their own behavior. Thinking about a project in an OOP way makes it easier to code by breaking it up into parts. The code used to create one object can be reused in another software prject that needs the same type of object. 

## Static vs Instance Methods
Static method do not require an instance to call where as a instance method requires the constructor to create an instance to use that method.

## Interfaces


## Overloading 
Methods have the same name but all take different types and number of arguments. Useful because not all not all data that a method can handle comes in the same type. 

Method Overloading means to have two or more methods with same name in the same class with different arguments. The benefit of method overloading is that it allows you to implement methods that support the same semantic operation but differ by argument number or type.


## Exceptions
Allows the program to handle errors or gracefully exit the program. 
Catching exceptions allows you to exit gracefully or customize the error.
