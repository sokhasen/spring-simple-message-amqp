# Getting Started
*********************************************************
> Demo simple project for Spring Boot with rabbitmq AMQP
********************************************************
##### Running Our Application
First, we start the RabbitMQ broker:

`docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management`

Then, we run the spring boot application by running SpringAmqApplication.java, executing the main() method:

`mvn spring-boot:run -Dstart-class=com.sokhasen.springamq.SpringAmqApplication`


##### Trigger Message to Application
````
POST http://localhost:9002/
Content-Type: application/json

{
    "name": "test",
    "email": "aaa.master@gmail.com",
    "dob": "1990-02-21"
}
