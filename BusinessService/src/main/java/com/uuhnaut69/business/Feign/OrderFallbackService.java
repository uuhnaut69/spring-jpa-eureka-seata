package com.uuhnaut69.business.Feign;

import org.springframework.stereotype.Component;

@Component
public class OrderFallbackService implements OrderFeignClient {

	@Override
	public void create(String userId, String commodityCode, Integer count) {
		// TODO Auto-generated method stub

	}

}
