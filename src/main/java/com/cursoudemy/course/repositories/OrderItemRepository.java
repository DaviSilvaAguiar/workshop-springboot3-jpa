package com.cursoudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.course.entities.OrderItem;
import com.cursoudemy.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	

}
