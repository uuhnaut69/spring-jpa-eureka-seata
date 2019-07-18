package com.uuhnaut69.order.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uuhnaut69.order.Entity.Order;
import com.uuhnaut69.order.Feign.AccountFeignClient;
import com.uuhnaut69.order.Repository.OrderDAO;

@Service
public class OrderService {

	@Autowired
	private AccountFeignClient accountFeignClient;

	@Autowired
	private OrderDAO orderDAO;

	@Transactional
	public void create(String userId, String commodityCode, Integer count) {

		BigDecimal orderMoney = new BigDecimal(count).multiply(new BigDecimal(5));

		Order order = new Order();
		order.setUserId(userId);
		order.setCommodityCode(commodityCode);
		order.setCount(count);
		order.setMoney(orderMoney);

		orderDAO.save(order);

		accountFeignClient.debit(userId, orderMoney);

	}

}