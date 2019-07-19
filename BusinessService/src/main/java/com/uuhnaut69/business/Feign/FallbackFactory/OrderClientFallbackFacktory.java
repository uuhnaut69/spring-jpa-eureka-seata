package com.uuhnaut69.business.Feign.FallbackFactory;

import org.springframework.stereotype.Component;

import com.uuhnaut69.business.Feign.OrderFallbackService;
import com.uuhnaut69.business.Feign.OrderFeignClient;

import feign.hystrix.FallbackFactory;

@Component
public class OrderClientFallbackFacktory implements FallbackFactory<OrderFeignClient> {

	@Override
	public OrderFeignClient create(Throwable cause) {
		// TODO Auto-generated method stub
		return new OrderFallbackService(cause);
	}

}
