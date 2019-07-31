package com.uuhnaut69.order.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uuhnaut69.order.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}