package com.devsuperior.rvcommerce.controllers;

import com.devsuperior.rvcommerce.dto.ProductDTO;
import com.devsuperior.rvcommerce.entities.Product;
import com.devsuperior.rvcommerce.repositories.ProductRepository;
import com.devsuperior.rvcommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){
        return service.findById(id);
    }



}
