#FROM alpine:3.14
#RUN apt-get install sbt
#RUN ["/bin/sh", "-c", "sbt dist && unzip target/universal/scala-fitness-app-1.0.zip"]

FROM adoptopenjdk:11-jre AS builder
##WORKDIR ~/scalaProjects/scala_fitness_app
COPY ./scala-fitness-app-1.0 /scala-fitness-app-1.0
EXPOSE 9000
CMD ["/bin/sh", "-c", "scala-fitness-app-1.0/bin/scala-fitness-app && -Dplay.evolutions.db.default.autoApply=true"]