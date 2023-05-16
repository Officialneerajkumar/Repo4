package com.example.Student.Management.System.service;

import com.example.Student.Management.System.dao.LaptopRepo;
import com.example.Student.Management.System.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepo laptopRepo;
    public void addLaptop(Laptop laptop) {
        Laptop lapy = null;
        lapy.setLaptopName(laptop.getLaptopName());
        lapy.setLaptopBrand(laptop.getLaptopBrand());
        lapy.setLaptopPrice(laptop.getLaptopPrice());
        lapy.getStudent().setStudentId(laptop.getStudent().getStudentId());
        laptopRepo.save(lapy);
    }

    public List<Laptop> getAllLaptop() {
        List<Laptop> lapys = laptopRepo.findAll();
        return lapys;
    }
}
