package com.example.ecommerceApi.dao;

import com.example.ecommerceApi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IproductRepo extends JpaRepository<Product,Integer> {
    List<Product> findByCategory(String category);
}
