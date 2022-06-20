package com.java.learning.spring.cloud.microservices.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder
                .routes()
                    .route(p -> p.path("/currency-conversion/**")
                            .uri("lb://currency-conversion-service/"))
                    .route(p -> p.path("/currency-conversion-feign/**")
                            .uri("lb://currency-conversion-service"))
                    .route(p -> p.path("/currency-exchange/**")
                            .uri("lb://currency-exchange-service"))
                .build();
    }
}
