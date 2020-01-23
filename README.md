Inspiration from https://spring.io/guides/gs/spring-boot-docker/

### Build the image (from project root directory)
$ docker build -t sgenette/spring-boot-docker .

### Run the container
$ docker run -it --rm -p 5000:8080 sgenette/spring-boot-docker

### Invoke the REST service
http://localhost:5000/greeting?name=Simon