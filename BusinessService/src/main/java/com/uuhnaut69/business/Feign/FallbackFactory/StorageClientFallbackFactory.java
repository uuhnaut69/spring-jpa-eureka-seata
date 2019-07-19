package com.uuhnaut69.business.Feign.FallbackFactory;

import org.springframework.stereotype.Component;

import com.uuhnaut69.business.Feign.StorageFallbackService;

import feign.hystrix.FallbackFactory;

@Component
public class StorageClientFallbackFactory implements FallbackFactory<StorageFallbackService> {

	@Override
	public StorageFallbackService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new StorageFallbackService(cause);
	}

}
