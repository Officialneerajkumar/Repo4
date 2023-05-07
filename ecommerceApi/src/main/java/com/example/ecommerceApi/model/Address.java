package com.example.ecommerceApi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String addressName;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;
    @OneToOne()
    @JoinColumn(name = "fk_user_id")
    private User user;
}
