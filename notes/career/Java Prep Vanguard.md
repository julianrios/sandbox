1 hour technical interview with basic Java and OOP questions and 1 hour behavioral interview  

### Give me a situation when ... 

### What is the difference between a deep copy and a shallow copy?  

### Explain the difference between, high cohesion and loose coupling (or some variation of that)  

### In java are objects passed by value or by reference?  
Java is always pass-by-value. Unfortunately, when we pass the value of an object, we are passing the reference to it.

### What is the difference between an abstract class and an interface?  
Abstract Class:

 - Abstract classes have a default constructor and it is called whenever the concrete subclass is instantiated.
- Contains Abstract methods as well as Non-Abstract methods.
- The class which extends the Abstract class shouldn’t require implementing all the methods, only Abstract methods need to be implemented in the concrete sub-class.
- Abstract Class contains instance variables.
    
Interface:

- Doesn’t have any constructor and couldn’t be instantiated.
- Abstract method alone should be declared.
- Classes which implement the interface should provide the implementation for all the methods.
- The interface contains only constants.    

### What is Polymorphism? 
Polymorphism means many forms.
- Compile time polymorphism (Method overloading) implement multiple methods within the same class that use the same name but a different set of parameters.  
- Dynamic Polymorphism (Method overriding) a subclass can override a method of its superclass. That enables the developer of the subclass to customize or completely replace the behavior of that method. At compile time the compiler knows which method to link to the call with the @Override annotation.

### What is the difference between loose coupling and tight cohesion? Case Study is to give them an insight into your design and implementation skills - at a very high level.  

### What is a pointer?  

### What is garbage collection?  
A process collecting or gaining the memory back which has been allocated to the objects, which is not in use at the moment in any part of our program.
A process to get rid of objects which are not being used.

### Define what an interface is  
An interface is a template which has only method declarations and not the method implementation.

### What does .equals do/mean

### What is garbage collection

### How do you concatenate strings  

### Steps on how to connect to a server using Java?  

### What is a stack and how would you use one?

### How would you tell if two strings are permutations?  
