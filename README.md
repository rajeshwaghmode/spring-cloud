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
- Distributed tracing helps in identifying that slow component among in the ecosystem
- Spring Cloud Sleuth
  - It is used to generate the trace id, span id and add this information to the service calls in the headers and MDC, so that It can be used by tools like Zipkin and ELK etc. to store, index and process log files
  - it automatically integrated to the common communication channels like
    - requests made with the RestTemplate etc
    - requests that pass through a Netflix Zuul microproxy
    - HTTP headers received at Spring MVC controllers
    - requests over messaging technologies like Apache Kafka or RabbitMQ etc
- Zipkin 
  - Zipkin is a distributed tracing system 
  - It helps gather timing data needed to troubleshoot latency problems in service architectures 
  - Features include both the collection and lookup of this data

# Circuit Breaker
- Circuit Breaker is a design pattern
- Is a Service Fallback mechanism for 400 - 599 HTTP Status codes
- Hystrix is implementations of Circuit Breaker

# Spring Configuration Bootstrap vs Application Properties 
- Spring Cloud application features a bootstrap context that is the parent of the application context
- The bootstrap context is searching for a bootstrap.properties or a bootstrap.yaml file, whereas the application context is searching for an application.properties or an application.yaml file
- bootstrap.properties file have higher precedence and is loaded 
- And, of course, the configuration properties of the bootstrap context load before the configuration properties of the application context
- https://www.baeldung.com/spring-cloud-bootstrap-properties

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