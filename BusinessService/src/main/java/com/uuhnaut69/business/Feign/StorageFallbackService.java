package com.uuhnaut69.business.Feign;

import org.springframework.stereotype.Component;

@Component
public class StorageFallbackService implements StorageFeignClient {


	@Override
	public void deduct(String commodityCode, Integer count) {
		// TODO Auto-generated method stub

	}

}
