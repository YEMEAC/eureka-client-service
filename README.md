# Eureka-client-service


This repository is part of a tripled of microservices to play with Eureka service discovery. In this trippled, this  microservice plays the role as eureka-instance registering itself in the service registry of eureka service, held in the repository eureka-service. It also plays the role as service for the microservice held in in the repository eureka-client-client.

To execute simply execute:

```
gradle bootRun
```

This service will be running on port: 8567. The next request will simulate a ping to the service

```
  http://localhost:8567/consume-service/ping
```
