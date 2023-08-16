FROM openjdk:17
LABEL maintainer="java-guides.net"
COPY ./build/libs/project_fb-0.0.1-SNAPSHOT.jar /main/
WORKDIR /main
ENTRYPOINT ["java", "-jar", "project_fb-0.0.1-SNAPSHOT.jar"]