package com.java.learning.spring.cloud.microservices.currencyexchangeservice.repository;

import com.java.learning.spring.cloud.microservices.currencyexchangeservice.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByFromAndTo(String from, String to);
}
