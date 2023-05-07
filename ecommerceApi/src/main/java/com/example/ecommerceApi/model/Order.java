package com.example.ecommerceApi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
    private int productQuantity;
    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;
}
