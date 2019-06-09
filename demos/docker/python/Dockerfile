# Base Image
FROM ubuntu:latest

# Commands to run to install dependencies
RUN apt-get update -y
RUN apt-get install -y python3

# When you pass commands to the container, what should interpret them
ENTRYPOINT ["python3"]

# Commmand to run the container starts
CMD ["app.py"]

# Working directory
WORKDIR /app

# Copy apps from the local folder to the Docker container
COPY app.py app.py
COPY alternate.py alternate.py

# Make port available
EXPOSE 8080


