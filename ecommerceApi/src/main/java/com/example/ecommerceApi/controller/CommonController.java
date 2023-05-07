package com.example.ecommerceApi.controller;

import com.example.ecommerceApi.model.Address;
import com.example.ecommerceApi.model.Order;
import com.example.ecommerceApi.model.Product;
import com.example.ecommerceApi.model.User;
import com.example.ecommerceApi.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ecommerceApi")
public class CommonController {
    @Autowired
    private CommonService service;
    @PostMapping("/create-user")
    public ResponseEntity<String> createUser(@RequestBody User user){
        int userId = service.createUsser(user);
        return new ResponseEntity<>("User created successfully with UserId --> "+userId,HttpStatus.CREATED);
    }
    @PostMapping("/create-product")
    public ResponseEntity<String> createProduct(@RequestBody Product product){
        int productId = service.createProduct(product);
        return new ResponseEntity<>("product created successfully with productId --> "+productId,HttpStatus.CREATED);
    }
    @PostMapping("/create-address")
    public ResponseEntity<String> createAddress(@RequestBody Address address){
        int addresId = service.createAddress(address);
        return new ResponseEntity<>("address created successfully with addresId --> "+addresId,HttpStatus.CREATED);
    }
    @PostMapping("/place-order")
    public ResponseEntity<String> placeOrder(@RequestBody Order order){
        int orderId = service.placeOrder(order);
        return new ResponseEntity<>("order has been placed successfully with orderId --> "+orderId,HttpStatus.CREATED);
    }
    @GetMapping("/get-order-by-id")
    public ResponseEntity<Order> getOrderById(@RequestParam int orderId){
        Order response = service.getOrderById(orderId);
        return new ResponseEntity<>(response,HttpStatus.FOUND);
    }
    @GetMapping("/get-user-by-id")
    public ResponseEntity<User> getUserById(@RequestParam int userId){
        User response = service.getUserById(userId);
        return new ResponseEntity<>(response,HttpStatus.FOUND);
    }
    @GetMapping("/get-all-products")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> productList = service.getAllProducts();
        return new ResponseEntity<>(productList,HttpStatus.FOUND);
    }
    @GetMapping("/get-product-by-category")
    public ResponseEntity<List<Product>> getProductByCategory(@RequestParam String category){
        List<Product> productList = service.getProductBycategory(category);
        return new ResponseEntity<>(productList,HttpStatus.FOUND);
    }
    @DeleteMapping("/delete-product-by-id")
    public ResponseEntity<String> deleteProductById(@RequestParam int productId){
        service.deleteProductById(productId);
        return new ResponseEntity<>("product has been deleted successfully !!",HttpStatus.OK);
    }
}
