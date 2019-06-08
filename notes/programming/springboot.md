# Spring Notes

### JPA - Java Persistance Api
JPA lets you do orm. 
ORM lets you map your entity classes to sql tables.
JPA handles the conversion of sql read queries to object instances.


### Custom JpaRepository methods
Creat method within property and use inside of controller or via service to controller
Just follow convention findByPropertyNameLessThan(variable);
```
return bookingRepository.findByPricePerNightLessThan(price);
```

### Swapping Databases is easy 
Swap the configurations in the application properties and add the dependency 
```
spring.datasource.url=jdbc:h2:file:./bookings.db
```

### MVC pattern overview
MVC offers architectural benefits over standard JavaScript — it helps you write better organized, and therefore more maintainable code. 

### Model
Model is where the application’s data objects are stored. The model doesn’t know anything about views and controllers. When a model changes, typically it will notify its observers that a change has occurred.

### View
View is what's presented to the users and how users interact with the app. The view is made with HTML, CSS, JavaScript and often templates. 

### Controller
The controller is the decision maker and the glue between the model and view. The controller updates the view when the model changes. It also adds event listeners to the view and updates the model when the user manipulates the view.

### MVC Summary
To summarize, the MVC pattern brings modularity to application developers and it enables:

Reusable and extendable code.
Separation of view logic from business logic.
Allow simultaneous work between developers who are responsible for different components (such as UI layer and core logic).
Easier to maintain.

### Try this

Controller does persistence
In this pattern, the controller holds a reference to both the model and a datastore and is responsible for keeping the model persisted. The controller responds to lifecycle events like Load, Save, Delete, and issues commands to the datastore to fetch or update the model.

Pros:

Easier to test, controller can be passed a mock datastore to write tests against.
The same model can be reused with multiple datastores just by constructing controllers with different datastores.
Cons:

Code can be more complex to maintain.

CommandLineRunner is a component that gets fired up when a spring application starts

@Conditional on property
will run depending on property in the applcations.properties file

## Spring Boot Back-End (API) Responsibilites
Business Logic
Persistence (CRUD)
Security (Authentication + Authorization)
User Input Validation
Communication Contracts (REST Endpoints)

Communicate via HTTP requests.
localhost:8080/endpoint
### Angular Front-End (Views/Routing/UI Logic)

### Pros and Cons
Pros:
Clear separation of concerns
Clean code and maintainabliity
Well suited for large apps or apps with complex client side interactions

Cons:
Build and deployment are more complex (2 apps instead of one)

### Angular Project Structure
e2e stands for end to end and refers to the end to end testing of your application. It contains scripts that we can use to simulate user actions and behaviour. *Selenium Testing!*

node_modules
All libraries and dependencies that you install using npm install are placed in this folder. It is similar to a pom.xml but this folder should not be included in source control.

When you move this project to a new machine delete this folder and run npm install

app
default folder that contains all our modules and components

assets
stores all our images, fonts, styles, and other static content

favicon.ico
the icon that our application will use when displayed in browsers

main.ts
Entry execution point (bootstrapping) of our application. Similar to main() method (bootstraps the root module -> app module)

karm-conf.js
configuration file for karma test runner. Used when running angular unit tests.

polyfill.ts
Few lines of code which can make your application coompatiable with various browsers like older browsers

angular.json
it contains configuration for the CLI workspace
-package manager
-global styles
-global js scripts
-app prefix
-ect

package.json
file that contains all the npm dependencies of our application. each time we add a new dependency, we mist also reference it in this file (--save)

### Questions
### What is ThymeLeaf?
It is a template engine that can serve the views of your web application in both online and offline scenarios.

### Why use ThymeLeaf?
It can be used without running the server side component of your web app. (Just open the templates in a web browser)
Used by devs and designers
Supports template logic(iterations, conditions, ect) and view composition

### How do we implement persistence?
Annotate our entities with @Entity and @Id

We need to create a repository interface that extends the JpaRepository interface(for relational databases)

### What are some MVC frameworks?
JavaScript MVC frameworks have been developed, such as backbone.js, ember.js, AngularJS, Sencha, Kendo UI, and more.

### When should I use Angular?
Application is complex and you want to test the client side.

### What is CrossOrigin?
Client and Backend are bundled together and one web server executes that deployable. Everything resides within the same domain. If you try to make a request from outside this request or controller it will get rejected. 

### Three commands to make Angular App

ng new appName
ng build
ng server

### Other useful commands
npm install package-name --save will save it to the package.json for others that build project

*Merge with Springboot notes* maybe make one note folder 
What is gradle
it is a build and dependency management tool similar to maven it uses groovy dsl instead of xml it makes the file less verbose readable and more scriptable


WEB allows us define endpoints using an annotation based system
JPA will allow us to use JPA-based repositories to interact with the data
H2 is a really fast embedded database that will start up when you start the application

ObjectMapper defines how JSON strings in the request body are deserialized from requests in POJOS or plain olfd java objects which we use to model our data

The ObjectWriter will define how we serialize our java objects into a JSON string in the response body

```
/*
    * This method will return a ObjectWriter. 
    * It will use the ObjectMapper to create a Default PrettyPrinter, 
    * which will output a JSON in Human Readable Format.
    * */
    public ObjectWriter objectWriter(ObjectMapper objectMapper) {
        return objectMapper.writerWithDefaultPrettyPrinter();
    }
```

The annotation, @EnableAutoConfiguration will intelligently configure beans that you are likely to need in your Spring application. The annotation, @ComponentScan,will enable automatic scanning for configuration classes to wire up in your Spring application context.

### Resource Modeling
A RESTful system is composed of resources. 
A resource is anything that has a URI.
Examples of resources in the room domain are reservation, amenity, and service requests. You can create, update, retrieve or delete a resource. These actions are mapped to the HTTP verbs POST, PUT, GET, and DELETE

Resources are grouped into domains. A domain is a cohesive set of resources. An example of a domain is a room. In the room domain, you will have resources such as Room Reservation, Amenities, and Service Request all of which have CRUD.

An API endpoint will be in the format slash, domain, slash, resource, slash, version. 

Getting a list of available rooms would return a collection. Getting a single resource by ID would retun a singleton. Versioning allows you to handle different versions of a resource. 

RestController is a convenience annotation that combines the controller annotation with the RequestBody annotation. The controller annotation is a specialization of the component annotation that marks a candidate for auto-detection through classpath scanning. HTTP requests are intercepted by the DispatcherServlet which looks for handler mappings and it's type, then routes request to the correct RestController method. A response body annotation indicates a method return value should be bound to the web response body. 