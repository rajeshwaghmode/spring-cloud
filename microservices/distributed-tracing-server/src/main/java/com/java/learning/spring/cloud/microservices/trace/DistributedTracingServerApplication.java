package com.java.learning.spring.cloud.microservices.trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class DistributedTracingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedTracingServerApplication.class, args);
	}
}
