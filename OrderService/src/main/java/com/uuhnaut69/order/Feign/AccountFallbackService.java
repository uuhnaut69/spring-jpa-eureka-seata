package com.uuhnaut69.order.Feign;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class AccountFallbackService implements AccountFeignClient {

	@Override
	public Boolean debit(String userId, BigDecimal money) {
		// TODO Auto-generated method stub
		return null;
	}

}
