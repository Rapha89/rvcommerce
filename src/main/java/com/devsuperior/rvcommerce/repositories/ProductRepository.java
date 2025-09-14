package com.devsuperior.rvcommerce.repositories;

import com.devsuperior.rvcommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
