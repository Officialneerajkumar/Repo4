package com.example.ecommerceApi.dao;

import com.example.ecommerceApi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IorderRepo extends JpaRepository<Order,Integer> {
}
