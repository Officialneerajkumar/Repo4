package com.example.OneToOneMapping.controller;

import com.example.OneToOneMapping.model.Address;
import com.example.OneToOneMapping.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/ems")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/get-all-address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("/get-address-by-Id")
    public Address getById(@RequestParam Long id){
        return addressService.getById(id);
    }
    @PostMapping("/create-address")
    public String createAdd(@RequestBody Address address){
        addressService.createAddress(address);
        return "Address created successfully !!";
    }
    @PutMapping("/update-Address")
    public String updateAddress(@RequestParam Long id,@RequestBody Address address){
        addressService.updateAddress(id,address);
        return "Address updated successfully !!";
    }
    @DeleteMapping("/delete-address")
    public String deleteAddress(@RequestParam Long id){
        addressService.deleteAddress(id);
        return "Address deleted successfully !!";
    }
}
