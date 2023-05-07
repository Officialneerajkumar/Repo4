package com.example.ecommerceApi.dao;

import com.example.ecommerceApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IuserRepo extends JpaRepository<User,Integer> {
}
