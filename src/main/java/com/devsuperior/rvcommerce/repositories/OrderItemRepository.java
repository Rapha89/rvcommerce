package com.devsuperior.rvcommerce.repositories;

import com.devsuperior.rvcommerce.entities.OrderItem;
import com.devsuperior.rvcommerce.entities.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {



}
