Inspiration from https://spring.io/guides/gs/spring-boot-docker/

### Build the image (from project root directory)
$ docker build -t sgenette/spring-boot-docker .

### Run the container
$ winpty docker run -it -p 8080:8080 sgenette/spring-boot-docker

### Invoke the REST service
http://localhost:8080/greeting?name=Simon