import groovy.transform.Field
vars/dockerContents.groovy

@Field dockerFileText = "
FROM openjdk:8-jdk-alpine\nRUN apk add --no-cache curl zip bash\nRUN curl -s -o /tmp/veracode.zip https://repo1.maven.org/maven2/com/veracode/vosp/api/wrappers/vosp-api-wrappers-java/19.3.5.7/vosp-api-wrappers-java-19.3.5.7-dist.zip\nRUN cd /tmp && unzip -o veracode.zip VeracodeJavaAPI.jar && mv VeracodeJavaAPI.jar /
"