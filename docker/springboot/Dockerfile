FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ENTRYPOINT ["java","-jar","/app/lib/spring-boot-todo-0.0.1-SNAPSHOT.jar"]