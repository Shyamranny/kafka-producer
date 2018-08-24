# kafka-producer
This is a simple Kafka producer created using Spring Boot application. I have faced issues using the built in console application (kafka-console-producer) when I tried to send big json data. The console application is not accepting that big json. I don't know - may be I can change some environment settings to change it, but because of time constrains (yes always we have :)), I have created this simple application to resolve it. 

### Usage
Just open the Tester.java. Change the topic name in 'HELLOWORLD_TOPIC'. Replace the message. Right click and run the unit test ‘testSend’. The message will be sent to kafka topic. bootstrap servers can be added in application.yml file.
