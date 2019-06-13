One to Many - Course to Reviews
Many to One - Reviews to Course

### HTTP BASICS
Port 80 -> type of communication Http messaging 

Request Line --> Request method [uri] HTTP/[version] --> GET /xml HTTP/1.1
Headers [Header Name] : [Header Value] --> Host: httpbin.org

Request Body (optional, only for POST request, not Get requests)

Figure out how to implement HTTP/2 

Stateless
No record of previous interactions and each interaction is processed only with the information that comes with that particular interaction

A query string is a sequence of name and value pairs where the names and values are separated by an equal sign and the pairs are separated by one ampersand.

When using a query string in an uri you start it with a single question mark
https://www.google.com/maps?q=new+jersey

Post request transmit data in the request body and not in the URI like GET request

URI annd URL
URL is a URI that also contains information on how to locate a resource. 
URL contain protocol http:// and hostname httpbin.org and URI /xml

In the form tag you must specify the method attribute get or post and the action attribute the URI the form is going to.

### GET
Browser renders html
the form contains a method and action attributes giving the user a chance to provide information
after enter the information the user submits the form
this sets the browser into action using the action URL and the acction attribute the browser established a network connection to the host
Then begins to HTTP get request based on the form's method attribute
The form's data is put together as a query string using the name attributes as parameter names and the user provided values as the parameter values. In get request the browser appends the query string to the URI


### POST
Browser renders html
the form contains a method and action attributes and various named elements giving the user a chance to provide information
after enter the information the user submits the form
this sets the browser into action using the action URL and the acction attribute the browser established a network connection to the host
Then begins to HTTP post request based on the form's method attribute
The form's data is put together as a query string using the name attributes as parameter names and the user provided values as the parameter values.

### Intro to REST APIs
Application Programmming Interface - is code that makes it easier for systems outside of an application to interact with that application.

REST is another layer on top of HTTP(Hyper Text Transfer Protocol) foundation for all communication on the internet

Representational State Transfer

Stateless any request made to a website is like meeting that site the first time

All the work of remembering state is left to the client.

Our client will hold onto whatever information it needs like authentication keys or previous endpoints. The server forgets everything about the client. 

REST APIS
Nouns -> resources -> model in our app -> collections should be plural
Verbs -> actions that you will take on resouces represented by the type of request the client makes to the api -> read creat update delete -> done through endpoints
endpoints represent a single record or a collection of records

get is used for fetching either a collection of resources or a single resource

post is used to add a new resource to a collection

put is the http method or verb used when we want to update a record


### Resource, Endpoint and Actions
A resource is a piece of data, which usually comes out of a database (but doesn't have to!). Resources are gathered together into collections. Resources are usually available at endpoints that point to either individual resources or collections of resources. Endpoints don't represent actions that you take on those resources, though. Actions are determined by the data provided to an endpoint and the HTTP method used to access the endpoint.

By combining endpoints and HTTP methods, we can build complete sentences with just HTTP and REST.

### URL vs URI, what's the difference?

URI stands for "Uniform Resource Identifier", the keyword being "Identifier". This can mean name, location, or both.

Example: /api/v1/games/1234

URL stands for "Uniform Resource Locator", the keyword being "Locator" so it provides full details to locate the resource.

Example: https://teamtreehouse.com/alenaholligan

The part that makes something a URL is the combination of the name and an access method, such as https://

URLs are URIs, but the opposite is not true. So saying URI is always technically accurate

### HTTP Headers
Accept specifies the file format the requester wants
Accept Language specifies the human readable language
Cache Control specifies if the response can be generated via a cache or a quick to access memomry bank of data or not.
Smarter client and APIs take advantage of the http spec to make transactions cleaner and more specific 


When using a third party api checkout its headers 

try to always specifiy version numbers for your api

Status code 
200-299 GOOD!
300-399 UNDERSTOOD located elsewhere mostly used to perform redirects to somewhere else.
400-499 ERROR typically generated by the client
500-599 Server End 

### Security
Making sure apis are ually available for clients with the use of caching
Cache is usually a service that runs in memory to hold recently requested results like a newly created record or a large data set.
This helps to prevent database calls and even costly calculations on your data.

For example you data is spread across multiple databases or tables and gathering up all the information and sorting it and presenting it to the user takes several seconds. 

Putting that final data into a cache means that subsquent look ups only take as long as required for your cache keu to find and return the right key.

Memcache is a popular cache.

The next step to a successful api is rate limiting -> each user is allowed a certain number of requests to your API in a given time period. Once a user exhaust their allotment they will have to wait untul the timer runs out to get more. This helps to prevent users from just flooding you with requests and also helps to prevent distributed denial of service or DDOS attacks. 

The final step is authentication there are several ways to do this. The most common way is API tokens when setting up an api account a user is given a token and a secret pair the user will pass those credentials when making a request the server. The allows the api server to verify the communication the server checks the credentials and verifies that they are active and proper users in the database. Users need to include thier token with every request because of the statelessness of HTTP. *Authentication happens with each request* The token and secret are usually included as keys in the JSON that the client will send but they can also be included in the authentication headers in the HTTP request.

Java SDK or Java SE Development Kit is made up many things application servers, debuggers, code samples, and documentation

JDK or Java Runtime environment is a subset of the SDK. This contains the Java SE API which are the libraries like the collections framework.

### Acronym Glossary
SDK - Software Development Kit - A grouping of tools that allow you to create software locally. Also some times referred to as devkits.
JDK - Java SE Development Kit - A set of tools specifically for developing Java SE Applications
Java SE - Standard Edition
JRE - Java Runtime Environment - A minimum set of tools that allow local Java programs to execute
Java SE API - Application Programming Interface - A set of libraries provided to build applications.
JCL - Java Class Library - A synonym for the Java SE API.
JVM - Java Virtual Machine - an abstract computing machine. A virtual machine that enables a computer to run Java programs as well as programs written in other languages that are also compiled to Java bytecode.
WORA - Write Once Run Anywhere - Java can be compiled into bytecode and run on any device that has a JVM.
JIT - Just In Time compilation - A final compilation step that converts bytecode to native machine code during runtime startup

Java code is converted into javabyte code that can run on any machine with a jvm. write once run anywhere. 
Compiled languages like C require you to take the source code and compile it for each environment.
Java bytecode is the instruction set of the Java virtual machine (JVM).

.iml files are used to ensure teams have the same setup

https://docs.oracle.com/javase/8/docs/api/java/util/logging/package-summary.html
There are four main target uses of the logs:

Problem diagnosis by end users and system administrators. This consists of simple logging of common problems that can be fixed or tracked locally, such as running out of resources, security failures, and simple configuration errors.
Problem diagnosis by field service engineers. The logging information used by field service engineers may be considerably more complex and verbose than that required by system administrators. Typically such information will require extra logging within particular subsystems.
Problem diagnosis by the development organization. When a problem occurs in the field, it may be necessary to return the captured logging information to the original development team for diagnosis. This logging information may be extremely detailed and fairly inscrutable. Such information might include detailed tracing on the internal execution of particular subsystems.
Problem diagnosis by developers. The Logging APIs may also be used to help debug an application under development. This may include logging information generated by the target application as well as logging information generated by lower-level libraries. Note however that while this use is perfectly reasonable, the logging APIs are not intended to replace the normal debugging and profiling tools that may already exist in the development environment.


The key elements of this package include:
Logger: The main entity on which applications make logging calls. A Logger object is used to log messages for a specific system or application component.
LogRecord: Used to pass logging requests between the logging framework and individual log handlers.
Handler: Exports LogRecord objects to a variety of destinations including memory, output streams, consoles, files, and sockets. A variety of Handler subclasses exist for this purpose. Additional Handlers may be developed by third parties and delivered on top of the core platform.
Level: Defines a set of standard logging levels that can be used to control logging output. Programs can be configured to output logging for some levels while ignoring output for others.
Filter: Provides fine-grained control over what gets logged, beyond the control provided by log levels. The logging APIs support a general-purpose filter mechanism that allows application code to attach arbitrary filters to control logging output.
Formatter: Provides support for formatting LogRecord objects. This package includes two formatters, SimpleFormatter and XMLFormatter, for formatting log records in plain text or XML respectively. As with Handlers, additional Formatters may be developed by third parties.

### Spring Framework
Server and client
The user communicates with server through a web browser. The web browser formats all user actions and sends them in a formatted request to the web server.
Upon receiving this request the web server formats a response to the browser. 

classpath one or more directories that contain all the java files associated with our project.
it is given to the java compiler while compiling and the jvm while running
The classpath is used for telling the Java Virtual Machine where to find your Java bytecode and libraries while running your application.

JAR (Java ARchive) file is a bundle of compiled Java Code bundle together like a zip file.
Allows you to write a bunch of java code and distribute it as a app or library. 
If someone want to use it all that is need is to include the classpath within the file 

## Gradle
v2.5.7-SNAPSHOT
MAJOR version when you make incompatible API changes,
MINOR version when you add functionality in a backwards-compatible manner, and
PATCH version when you make backwards-compatible bug fixes.
SNAPSHOT is the latest dev version

### Finding 3rd Party Libraries on Maven Central
You can browse the Maven Central repository at search.maven.org directly, but I find searching on this site to be a bit overwhelming and cumbersome.

Instead, I either go to mvnrepository.com to find my Gradle dependencies, or I Google "library-name Maven", and click the first link in the search results that links to mvnrepository.com. Usually, it's the one I'm looking for.

### Importing a Gradle Project into IntelliJ
If you've downloaded a Gradle project from Treehouse, Github, or another source, importing it into your IDE is usually as simple as choosing to import a project, selecting "Gradle Project", then choosing the build.gradle file. Such is the case for IntelliJ. Then, you can use your IDE (or the command line) to refresh dependencies to download all those third-party libraries. This allows developers (like you!) to distribute source code without having to pass around hefty JAR files. Among other advantages, it's a nice way to leave a smaller digital footprint.

The spring framework consists of many different components. A component is simply a set of related functionality that in the case of spring resides in a jar file of its own.

The core component contains lots of the gears that turn the spring engine. Most of the classes you won't directly use, even though it's all being used by other pieces of the spring framework. 

The beans component is the part of the spring framework that allows any Java object to be created and used in what's called the Servlet Container, which is the container of your entire running application on the web server.

The Context Component gives us a bunch of annotations that will leverage in configuring our application including, 
the Configuration Annotation which will apply to classes that application configuration code, 
the Controller Annotation which will be applied to a class that we write to handle requests to specific URIs, and 
the ComponentScan annotation, which will tell the spring framework to scan our Java classes for things like controllers.
SpEL stands for Spring Expression Language, and is a language that we'll put to use in our HTML templates that will allow us to iterate over, perform operations with, and format Java data for display.
AOP stands for Aspect-Oriented Programming, this component allows us to cleanly apply functionality to many, or all parts of our web application.
Such as adding a security check to verify that a user is logged-in before performing certain tasks like uploading new GIFs, or marking or unmarking GIFs as favorites

Spring web MVC -> Dispatcher Servlet 
Think of the Dispatcher Servlet as our application's usher, who is there to receive requests from the web server, and usher or dispatch them according to our configuration and code. When our code is done processing the request, the dispatcher servlet ushers the response to the door, handing it back to the web server to send it back to the client.


the web component, from which we'll get the ability to capture a request to a specific resource and take action accordingly.
For example in the MoneyThyme app a user can click on a profile which the URI we can capture and then respond with a page that shows them all of their accounts.


**Springboot allows use to create a stand alone runnable Spring application that has an embedded web server.**

Tomcat is the apache web server that can run java applications.

Deployment referes to the process of taking all of our compiled code and necessary libraries and launching our application in its target environment.

Localhost is the alias or hostname that maps to the IP address of your own local machine. 

## JavaBeans vs. Spring Beans
Spring beans typically adhere to the requirements of the JavaBean specification. Independent of Spring, a JavaBean is any object that meets the following requirements:

has a public, default constructor,
has fields that are accessed through public getters & setters, which follow the standard naming convention of getFieldName (or isFieldName for boolean fields) and setFieldName, and
implements java.io.Serializable.
In general, Spring beans follow this convention, except that Spring beans do not need to implement java.io.Serializable.

In general, Spring beans are any object constructed and managed by the Spring Framework. Spring beans are the objects eligible for injection with the @Autowired annotation, as you'll see later in the course.

@EnableAutoConfiguration in  the application configuration class this annotaion will auto-configure your Spring app upon deployment.

A controller is a java object whose job is to handle requests to certain URIs applying annotations to methods within this class indicate which URI each method should handle.

## Thymeleaf Templates and XML Compliance
Thymeleaf is a templating engine that allows you to write HTML while including placeholders for data that will come in the form of Java objects.
These place holders leverage the spring expression langauge to access the fields of your job objects from its getters and setters.

Within the controller use a request mapping and return the name of the html file to return a html template of the client side you want the user to see. 

**The process begins with the user making an HTTP request to our web server. Based on the request the server knows from the host name to hand the request to our application. In the app the dispatcher servlet receives the request and the URI is examined. From the URI the dispatcher servlet determines which controller and which of its methods is mapped to the URI requested by using the RequestMapping annotation. The mapped controller method is called which will perform any desired actions and gather data to be used in putting together a response to the original HTTP request. That data is feed to a Spring View Resolver. Because the app is configured to use Thymeleaf Spring will then pass our data to the proper Thymeleaf template, jam the data into the proper place holders, and produce a final HTML prodcut that will be handed back to the dispatchers servlet. The dispatcher servlet hands it back to the web server. With its HTML the web server creates an HTTP response with a status code of 200(okay) and it includes the HTML from our application in the response body. The entire response is then sent to the client in response to th original HTTP request**

Thymeleaf is based on XML processing, and as such can be used to do much more than create HTML files. But this also means that, by default, HTML templates must by XML-compliant. So, some of the syntax that passes as valid HTML5 won't work in Thymeleaf without custom configuration of the templating engine in Spring.

If you want to use HTML5-style syntax instead, you'll need to do the following:

Add a properties file at src/main/resources/application.properties
Add the following text at the top:
spring.thymeleaf.mode = LEGACYHTML5
In the dependencies block of build.gradle, add Neko HTML as a runtime dependency:
runtime 'net.sourceforge.nekohtml:nekohtml:1.9.22'
Now you should be able to use HTML5 instead of XML-compliant markup in your Thymeleaf templates. For example, instead of

<link rel="stylesheet" th:href="@{/app.css}"/>

You could omit the self-closing slash:

<link rel="stylesheet" th:href="@{/app.css}">

This can be a huge time saver in converting static HTML5 files from front-end designers into Thymeleaf templates.

Assets to a web project generally referred to the images, CSS, JavaScript, and videos, and fonts that are needed for pages to display in a browser.
Named static since they will not change after releasing the application.
assets -> static -> non-static?

### Modeling Data with POJOs
A POJO(plain old java object) is a java object whose class is coded for its natural functionality and not for the framework which it will be used in. That means the object is coded with fields, getters, setters, and methods that are useful to the object as it fits in with other classes of you application. Not becuase of how it fits in with the framework you've chose such as Spring.

The class we write to represent each object is referred to as a model because it serves as a model for the objects we'll create. 

Example:
Store gif data into gif objects, feed them into our thymeleaf templates, then use the spring expression language in those templates to access that data such as names and dates uploaded.  

Arrays.asList() -> allows you to pass through any number of objects alternative to creating a new arraylist and using the add method a bunch of times to add individual objects. 

@Autowired tells spring to assign a GifRepository object to this instance field private GifRepository gifRepository; 
As soon as its needed.
The GifRepository must be annotated with @Component or @Repository for spring to pick this up during its initial scan of our app being loaded. When the GifController needs a GifRepository class spring will create one or use one thats already been created. The process of this runtime creation of objects that is the injection using the autowired annotation. **This process without explicitly writing code to construct and assign objects is called dependency injection.**
Code that calls the GifRepository constructor and assigning the resulting object to the GifRepository field was never written. Instead spring wire our objects together with @Autowired





