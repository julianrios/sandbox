### Intro
Docker bundles your ap together with all the libraries and services it depends on into a package called a container.

Which can then be delivered as a single unit wherever it needs to go.

Kind of like a shipping container since they are all the same shape they can be all handle the same way no matter what they contain.

Just like the app architecture it can be bundle be bundled up into a container no whatever what it is composed of.

Docker is an essential DevOps tool prefer working systems over comprehensive documentation.

Docker enables this by standardizing how systems run making it possible to deploy complex apps without extensive documentation

REMEMBER THE GENERAL PURPOSE OF EACH COMMAND AND HOW IT WORKS NOT EVERY DETAIL

Docker files abstract away the installation of dependencies allowing you to easily package the app for running in test or production environments.

Docker Compose you can think of is a Docker file for multiple Docker containers.
Docker Swarm, which allows you to build, deploy, and monitor multiple Docker containers at once, either as a single service or as a set of services.

## VMs
Pros
Isolate software from hos OS
Sometimes faster than native hardware

Cons
Have to emulate all hardware and firmware
Images are big and hard to distribute

Docker Container
Pros
Faster startup time
Resource re-use dont need to wat for resources to free up
Native hardware access
Less redunancy

Cons
May not be faster than  a VM depending on the app.

The contents of Docker containers run directly on top of the host operating system, unlike a virtual machine where they run on top of a guest operating system. Eliminating that guest OS and emulated hardware makes Docker containers much more lightweight than virtual machines.

Docker packages apps into a single unit, called an image. When these images are run via Docker, they're called containers, where a single container is an instance of an image. It's possible to run many containers based on a single image.

The contents of a container are bundled together to form a singular unit that represents an app, service, or any piece of software.
Docker packages the program, services, and libraries you app depends on into an image along with you instructions on how to run it and the environment on where it should run in. 

All is taken by docker and run on the host machine as an image. An image is a mutable file that is a snapshot of a container. Created with the build command. And produce a container when started with the run command. Images can be stored in a docker registry which is like a Github for docker images. They can be retrieve later on the system you want to deploy them. They are designed to be composed of layers of other images since they are so large.

Docker uses three main components
The Docker dameon which is a process running on your host OS handles containers and images to and from registries. Docker registries which are servers dameons connect to to retrieve images they need. And the docker client which issues commands to the docker dameon. 
Docker for EMUs?














### What can Docker be used for:
Docker lets you run apps with little knowledge of how it works internally.
Deploy your app to dev, testing, staging, and production.
Sharing your apps with others immediately spin up the apps.
Pull the image and deploy it as a container very easily. Dockerfile -> Plain text file with some commands.

Version control for app dependencies.
Consistency between dev, testing, and production environments.
Deploying distributed apps to 1000s of machines.

### Terms
Dockerfile -- Dockerfiles define how an app should be built/packaged and deployed with Docker. They are simple text files with a number of reference commands defined in the Docker documentation.

Software Delivery Pipelines -- When an app is setup so that it’s easily sent through the process of build, test, and deployment. Often referred to as CI or CD 
(Continuous Integration or Continuous Delivery).

Dockerized App -- An app that has a Dockerfile made for it and can be built into a Docker image and run as a container.

Container -- You can think of a container for an app as a real-life shipping container for freight. An app container is also like a VM, but far more lightweight and with the same security and operational isolation from system resources.

Continuous Integration/Continuous Delivery -- The practice of deploying apps on every commit to certain source control branches and as soon as existing unit tests are ran and pass.

Node.js -- Node.js is a runtime for the JavaScript language, which allows us to write server-side web apps in JavaScript and deploy them outside of the browser.

OS - Operating System, think Windows, MacOS/OS X, Linux (Ubuntu, RedHat, etc.)

Emulation - When a system will replicate all the functionality of another system so that it’s transparent to the user what the underlying hardware is.

Virtual Machine - an emulation of a computer system.

Container - a lightweight isolated environment for an app or service to run.