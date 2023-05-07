package com.example.ecommerceApi.service;

import com.example.ecommerceApi.dao.IaddressRepo;
import com.example.ecommerceApi.dao.IorderRepo;
import com.example.ecommerceApi.dao.IproductRepo;
import com.example.ecommerceApi.dao.IuserRepo;
import com.example.ecommerceApi.model.Address;
import com.example.ecommerceApi.model.Order;
import com.example.ecommerceApi.model.Product;
import com.example.ecommerceApi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonService {
    @Autowired
    private IuserRepo userRepo;
    @Autowired
    private IaddressRepo addressRepo;
    @Autowired
    private IproductRepo productRepo;
    @Autowired
    private IorderRepo orderRepo;
    public int createUsser(User user) {
        User savedUser = userRepo.save(user);
        return savedUser.getUserId();
    }
    public int createProduct(Product product) {
        Product savedProduct = productRepo.save(product);
        return savedProduct.getProductId();
    }

    public int createAddress(Address address) {
        Address savedAddress = addressRepo.save(address);
        return savedAddress.getAddressId();
    }

    public int placeOrder(Order order) {
        Order placedOrder = orderRepo.save(order);
        return placedOrder.getOrderId();
    }

    public Order getOrderById(int orderId) {
        Order response = null;
        List<Order> orderList = orderRepo.findAll();
        for(Order obj : orderList){
            if(obj.getOrderId()==orderId){
                response=obj;
            }
        }
        return response;
    }

    public User getUserById(int userId) {
        User response = null;
        List<User> userList = userRepo.findAll();
        for(User obj : userList){
            if(obj.getUserId()==userId){
                response=obj;
            }
        }
        return response;
    }
    public List<Product> getAllProducts() {
        List<Product> productList = productRepo.findAll();
        return productList;
    }

    public List<Product> getProductBycategory(String category) {
        List<Product> productList = productRepo.findByCategory(category);
        return productList;
    }

    public void deleteProductById(int productId) {
        productRepo.deleteById(productId);
    }
}
