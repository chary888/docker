FROM openjdk:17
EXPOSE 8080
ADD target/maisammathalli.jar maisammathalli.jar
ENTRYPOINT [ "java", "-jar","/maisammathalli.jar"]
