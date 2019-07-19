package com.uuhnaut69.business.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uuhnaut69.business.Feign.FallbackFactory.StorageClientFallbackFactory;

@FeignClient(name = "storage-service", fallback = StorageClientFallbackFactory.class)
public interface StorageFeignClient {

	@GetMapping("/deduct")
	void deduct(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count);

}