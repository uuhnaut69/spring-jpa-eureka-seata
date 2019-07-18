package com.uuhnaut69.order.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uuhnaut69.order.Entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long> {

}