FROM maven:3.6-jdk-11-slim AS build
WORKDIR /workspace
COPY pom.xml .
RUN mvn -e -B dependency:go-offline
COPY /src ./src
RUN mvn -e -B package

FROM openjdk:11-jre-slim
RUN addgroup --system spring && adduser --system spring --ingroup spring
USER spring:spring
ARG DEPENDENCY=/workspace/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","net.sgenette.springbootdocker.SpringBootDockerApplication"]