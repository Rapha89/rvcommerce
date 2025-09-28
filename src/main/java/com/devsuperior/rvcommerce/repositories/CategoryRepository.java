package com.devsuperior.rvcommerce.repositories;

import com.devsuperior.rvcommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
