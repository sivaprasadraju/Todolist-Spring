FROM openjdk:8u131-jre-alpine

COPY build/libs/application*.jar /opt/todolist/

CMD java $JAVA_OPTS -jar /opt/todolist/application*.jar