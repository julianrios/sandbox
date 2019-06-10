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

All is taken by docker and run on the host machine as an image. An image is a mutable file that is a snapshot of a container. Created with the build command. And produce a container when started with the run command. Images can be stored in a docker registries which is like a Github for docker images. They can be retrieve later on the system you want to deploy them. They are designed to be composed of layers of other images since they are so large.

Docker uses three main components
The Docker dameon which is a process running on your host OS handles containers and images to and from registries. Docker registries which are servers dameons connect to to retrieve images they need. And the docker client which issues commands to the docker dameon. 

Two containers - One Angular front end that fetches data from a springboot backend.

Using dockers networking each containe can share the workload working with large amounts of data without the hassles of large scale deployments. Networking is one of Docker's most fundamental strengths. From exposing ports to sharing a network between containers.

docker pull imageName -> pulls image from docker registry
docker inspect imageName -> returns a json where you can see which port it exposes.
docker run -p -> creates a container for the image -p publishes a port 8080:80 ( my selected port:their selected port) --detach (runs in the background instead of on the terminal) imageName
when you run a container pass --network= to specify which networks you container can talk to (by default connects to the bridge network)
docker ps -> returns a list of docker processes running.
docker network ls -> to view docker networks
docker inspect network networkName-> details about the network and the containers running on it.
docker stop ContainerId -> stops the container process running
docker run -it (interactive terminal session)(interactive run on the container(-t with a shell to communicate)) --detach (to run other commands) --name=nameOfContainer(gives the container a name) imageToBeBasedOn

docker attach containerName -> attaches containerNames entry point

### Building Images Using Dockerfiles
Developers use configuration files to customize the tools they use every day. Likewise, Docker looks for a Dockerfile for instructions on how it should build an image. 

docker build -t(tag for the image) image-name:1.0(tag if one is not provide default of latest is used) directoryName or if current directory use a single .

docker run -p myport:theirport image-name:tag

The FROM instruction must always be the first instruction in the Dockerfile. As an argument, you provide a name and an optional tag for an image that should be used as the base for your Docker container. You wouldn't want to build a host OS for your app from scratch, so the FROM instruction lets you simply use an image for Linux or another OS as your basis.

The RUN instruction will execute a command of your choosing while building the image. The command will be run exactly as if you had typed it in a shell on the guest OS. You can use these commands to permanently update the contents of the image. RUN is useful for installing dependencies or running a script in the container at build time.

You should use the exec form if you want to be very precise about the arguments you pass to the executable.

RUN apt-get update -y (shell form)
RUN ["apt-get", "update", "-y"] (exec from)

The ENTRYPOINT instruction sets an executable to be run each time a container starts. If you're always going to want the container to run the same executable, whether that be Python, MongoDB, Redis, or whatever, you should set it here. The CMD instruction is a list of arguments that get passed to the ENTRYPOINT executable. (Or, if no ENTRYPOINT has been set, the first argument is treated as the executable to be run.)

The `WORKDIR` line specifies a new default directory within the image's file system. The COPY and ADD instructions allow you to copy files into your image's filesystem.

Before you can make a network connection to a service running on a container, you need to expose the port the service is running on. The EXPOSE instruction allows you to do that.

ENV lets you set environment variables that you can use later in your Dockerfile, and they'll also be set within the environment of your running container.

You may want to run your app as a different user with fewer privileges. The USER instruction makes this easy.

docker images -> returns a list of created images

docker rmi tagOfImage -> removes that image

docker ps -a -> shows all containers

docker rm name -> removes an image 

docker system prune -> command will remove all stopped containers, all dangling images, and all unused networks

Docker for EMUs?

One of the main reasons to move your app into a Docker image is to make it easy to share it with others. But you don't have to upload image files to Dropbox or publish them on a website. Registries provide a standardized way to share Docker images, kind of like Git repositories. With a Docker registry, you can upload images, and your users can download them and run them as containers with just a few simple commands.

docker login -> logs into docker hub

docker tag imageName julianrios/imageTag -> will create this tag name

docker push julianrios/imageTag -> pushes to hub

docker pull julianrios/imageName -> pulls the latest image

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

Port - A port is a property of a machine that you can access via networking protocols, and is used to transmit data around the machine itself and to other machines. For example, websites run by default on port 80 and port 443, and SSH runs on port 22.

Bridge Network - a single aggregate network from multiple communication networks or network segments, but in Docker land, this means we’re bridging together the Docker container with the Host OS.

Nginx - a popular web server/reverse proxy used for deploying websites and services on Linux machines.

Node.js: A JavaScript runtime for non-browser environments.
package.json: A file that defines a JavaScript packages settings (i.e. how to build it, how to start it, metadata, etc.)

Express: A JavaScript/Node.js web server framework, like Flask or Django for Python, or Sinatra or Ruby on Rails for Ruby.

NPM: Node.js Package Manager, the package manager for installing JavaScript/Node.js packages into your development or production environment.
