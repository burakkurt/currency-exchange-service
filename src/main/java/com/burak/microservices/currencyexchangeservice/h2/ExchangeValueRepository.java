package com.burak.microservices.currencyexchangeservice.h2;

import com.burak.microservices.currencyexchangeservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    public ExchangeValue findByFromAndTo(String from, String to);

}
