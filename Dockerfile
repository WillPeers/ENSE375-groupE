FROM openjdk:8-jdk
RUN apt-get update
COPY RiskMeter /usr/src/ENSE375-groupE/RiskMeter
WORKDIR /usr/src/ENSE375-groupE/RiskMeter
RUN mvn package
