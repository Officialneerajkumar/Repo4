package com.example.OneToOneMapping.service;

import com.example.OneToOneMapping.dao.AddressRepo;
import com.example.OneToOneMapping.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;
    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Address getById(Long id) {
        List<Address> addressList = addressRepo.findAll();
        Address response = null;
        for(Address add : addressList){
            if(add.getId()==id) response=add;
        }
        return response;
    }

    public void createAddress(Address address) {
        addressRepo.save(address);
    }

    public void updateAddress(Long id, Address address) {
        List<Address> addressList = addressRepo.findAll();
        for(Address add : addressList){
            if(add.getId()==id){
                add.setId(address.getId());
                add.setCity(address.getCity());
                add.setState(address.getState());
                add.setZipcode(address.getZipcode());
                add.setStreet(address.getStreet());
            }
        }
    }

    public void deleteAddress(Long id) {
        List<Address> addressList = addressRepo.findAll();
        for(Address add : addressList){
            if(add.getId()==id){
                addressRepo.delete(add);
            }
        }
    }
}
