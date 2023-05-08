FROM adoptopenjdk:8-jre-openj9 as builder
WORKDIR application
COPY target/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM adoptopenjdk:8-jre-openj9
WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
EXPOSE 8080 
ENTRYPOINT ["sh", "-c", "exec java ${JAVA_OPTS} org.springframework.boot.loader.JarLauncher"]
