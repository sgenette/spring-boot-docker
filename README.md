This is a demo project for Spring Boot with Docker.

Inspiration from:
* https://spring.io/guides/gs/spring-boot-docker
* https://spring.io/guides/topicals/spring-boot-docker
* https://www.baeldung.com/docker-layers-spring-boot
* https://www.docker.com/blog/intro-guide-to-dockerfile-best-practices

### 1. Build the Docker image
Use a multi-stage build to generate the Spring Boot artifact with Maven in a consistent way and by caching dependencies.

From project root directory:

`$ docker build -t sgenette/spring-boot-docker .`

### 2. Run the container
Create, start and delete (on exit) a container with the image built in the previous step.

`$ docker run -it --rm -p 5000:8080 sgenette/spring-boot-docker`

Alternatively, use docker-compose to start/stop the container.

`$ docker-compose up`\
`$ docker-compose down`

### 3. Invoke the REST service
http://localhost:5000/greeting?name=Simon