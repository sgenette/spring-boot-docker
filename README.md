This is a demo project for Spring Boot with Docker.

Inspiration from https://spring.io/guides/gs/spring-boot-docker.\
More info at https://spring.io/guides/topicals/spring-boot-docker.

### 1. Build the application
The Dockerfile contained in this project assumes that the fat JAR is already built.\
`$ mvn clean package`

### 2. Build the Docker image
From project root directory:\
`$ docker build -t sgenette/spring-boot-docker .`

### 3. Run the container
Create, start and delete (on exit) a container with the image built in the previous step.\
`$ docker run -it --rm -p 5000:8080 sgenette/spring-boot-docker`

### 4. Invoke the REST service
http://localhost:5000/greeting?name=Simon