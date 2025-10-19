FROM openjdk:17

WORKDIR /app

COPY . /app

RUN javac Implementation.java

CMD ["java", "Implementation"]