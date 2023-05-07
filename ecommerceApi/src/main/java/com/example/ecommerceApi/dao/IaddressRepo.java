package com.example.ecommerceApi.dao;

import com.example.ecommerceApi.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IaddressRepo extends JpaRepository<Address,Integer> {
}
