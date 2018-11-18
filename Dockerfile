FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD /build/libs/docker-compose-demo-0.0.1-SNAPSHOT.jar  docker-compose-demo.jar
ENTRYPOINT ["java","-jar","docker-compose-demo.jar"]