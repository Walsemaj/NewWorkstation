Test Spring WebSocket
===========================
 
Creating a "hello world" application that sends messages back and forth, between a browser and the server. WebSocket is a very thin, lightweight layer above TCP. It makes it very suitable to use "subprotocols" to embed messages. In this guide we’ll dive in and use STOMP messaging with Spring to create an interactive web application.

    https://spring.io/guides/gs/messaging-stomp-websocket/

Start
1. mvn install
2. mvn spring-boot:run

Objective
1) Websocket Configuration
2) Request & Response / Topic
3) AJAX 
4) Json

Test
http://localhost:8080

Hierarchy
|_ WebSocketConfig.java Socket Configuration

Topic
|_ SubscriptionController.java / messageBroker.html 

Request&Response
|_ GreetingController.java / index.html 

~*~*~*

2016-03-22 12:59:15.286  INFO 2816 --- [MessageBroker-1] o.s.w.s.c.WebSocketMessageBrokerStats    : WebSocketSession[1 current WS(1)-HttpStream(0)-HttpPoll(0), 1 total, 0 closed abnormally (0 connect failure, 0 send limit, 0 transport error)], stompSubProtocol[processed CONNECT(1)-CONNECTED(1)-DISCONNECT(0)], stompBrokerRelay[null], inboundChannel[pool size = 6, active threads = 0, queued tasks = 0, completed tasks = 6], outboundChannelpool size = 8, active threads = 0, queued tasks = 0, completed tasks = 15], sockJsScheduler[pool size = 4, active threads = 1, queued tasks = 3, completed tasks = 64]

