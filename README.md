# Spring Cloud

# Spring Cloud Config Server 
- Externalize configuration
- Audit Configuration changes
- Rollback Configuration

# Service Registry
- Service Registry is a design pattern
- Eureka is implementations of Service Registry
- Centralized registry which keeps details about every service
- Url http://localhost:8761/

# API Gateway 
- Address 
  - Routing 
  - Cross Cutting Concerns
- Available implementations
  - Zuul
  - Spring Cloud API Gateway

# Distributed Tracing
- Traces all HTTP calls among microservices
- Zipkin is a server fo Microservice Tracing in distributed cloud environment
- Sleuth is a service which collects trace details and send it to Zipkin

# Circuit Breaker
- Circuit Breaker is a design pattern
- Is a Service Fallback mechanism for 400 - 599 HTTP Status codes
- Hystrix is implementations of Circuit Breaker

# Important URL's
- API Gateway
  - http://localhost:8765
- Zipkin Server 
  - http://localhost:9411/zipkin/
- Currency Conversion Service 
  - http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
- Currency Exchange Service 
  - http://localhost:8765/currency-exchange/from/USD/to/INR
- Config Server 
  - http://localhost:8888/currency-exhange-service/default