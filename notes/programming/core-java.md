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



