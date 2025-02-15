FROM eclipse-temurin:17
COPY target/Devtask.jar Devtask.jar
CMD [ "java","-jar","Devtask.jar" ]