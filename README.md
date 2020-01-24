This is a demo project for Spring Boot with Docker.
Inspiration from https://spring.io/guides/gs/spring-boot-docker/

### 1. Build the application
$ mvn clean package

### 2. Build the image (from project root directory)
$ docker build -t sgenette/spring-boot-docker .

### 3. Run the container
$ docker run -it --rm -p 5000:8080 sgenette/spring-boot-docker

### 4. Invoke the REST service
http://localhost:5000/greeting?name=Simon