package com.uuhnaut69.order.Feign.FallbackFactory;

import org.springframework.stereotype.Component;

import com.uuhnaut69.order.Feign.AccountFallbackService;
import com.uuhnaut69.order.Feign.AccountFeignClient;

import feign.hystrix.FallbackFactory;

@Component
public class AccountClientFallbackFactory implements FallbackFactory<AccountFeignClient> {

	@Override
	public AccountFeignClient create(Throwable cause) {
		// TODO Auto-generated method stub
		return new AccountFallbackService(cause);
	}

}
