FROM maven:3.9.9-eclipse-temurin-17-alpine
# properties
ARG JAR_FILE=target/argo-wf.jar
ARG JAR_LIB_FILE=target/lib/
# change working directory # cd path-to-your-working-directory
WORKDIR /usr/bah-m/repos
# copy target/java-docker-app.jar path-to-your-working-directory/app.jar
COPY ${JAR_FILE} argo-wf.jar
# java -jar path-to-your-working-directory/app.jar
ENTRYPOINT ["java","-jar","argo-wf.jar"]