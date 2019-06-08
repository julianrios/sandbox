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