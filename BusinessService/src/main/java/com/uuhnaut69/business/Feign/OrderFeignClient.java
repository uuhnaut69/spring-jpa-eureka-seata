package com.uuhnaut69.business.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uuhnaut69.business.Feign.FallbackFactory.OrderClientFallbackFacktory;

@FeignClient(name = "order-service", fallback = OrderClientFallbackFacktory.class)
public interface OrderFeignClient {

	@GetMapping("/create")
	void create(@RequestParam("userId") String userId, @RequestParam("commodityCode") String commodityCode,
			@RequestParam("count") Integer count);

}
