package com.uuhnaut69.order.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uuhnaut69.order.Service.OrderService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/create")
	public Boolean create(String userId, String commodityCode, Integer count) {
		log.info("Create order");
		orderService.create(userId, commodityCode, count);
		return true;
	}

}
