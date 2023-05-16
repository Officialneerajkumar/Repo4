package com.example.Student.Management.System.controller;

import com.example.Student.Management.System.model.Laptop;
import com.example.Student.Management.System.model.Student;
import com.example.Student.Management.System.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping(name = "/add-laptop")
    public ResponseEntity<String> addLaptop(@RequestBody Laptop laptop){
        laptopService.addLaptop(laptop);
        return new ResponseEntity<>("Laptop added successfully !! ", HttpStatus.CREATED);
    }
    @GetMapping("/get-all-laptop")
    public ResponseEntity<List<Laptop>> getAllStudent(){
        List<Laptop> Laptops = laptopService.getAllLaptop();
        return new ResponseEntity<>(Laptops,HttpStatus.FOUND);
    }
}
