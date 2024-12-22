FROM openjdk
WORKDIR /app
COPY LargestNumber.java .
RUN javac LargestNumber.java
CMD ["java", "LargestNumber"]