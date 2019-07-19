package com.uuhnaut69.order.Feign;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class AccountFallbackService implements AccountFeignClient {

	private final Throwable cause;

	public AccountFallbackService(Throwable cause) {
		this.cause = cause;
	}

	@Override
	public Boolean debit(String userId, BigDecimal money) {
		// TODO Auto-generated method stub
		return null;
	}

}
