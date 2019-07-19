package com.uuhnaut69.business.Feign;

import org.springframework.stereotype.Component;

@Component
public class OrderFallbackService implements OrderFeignClient {

	private final Throwable cause;

	public OrderFallbackService(Throwable cause) {
		this.cause = cause;
	}

	@Override
	public void create(String userId, String commodityCode, Integer count) {
		// TODO Auto-generated method stub

	}

}
