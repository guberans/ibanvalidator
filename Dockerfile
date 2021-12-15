FROM junhanlin/ubuntu-git-java-maven
VOLUME /tmp

RUN git clone https://github.com/guberans/ibanvalidator.git
WORKDIR ibanvalidator
RUN mvn install

WORKDIR target
RUN mv *.jar app.jar

ENTRYPOINT ["java","-jar","/ibanvalidator/target/app.jar"]