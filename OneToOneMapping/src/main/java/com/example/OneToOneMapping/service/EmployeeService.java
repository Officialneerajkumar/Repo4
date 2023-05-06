package com.example.OneToOneMapping.service;

import com.example.OneToOneMapping.dao.EmployeeRepo;
import com.example.OneToOneMapping.model.Address;
import com.example.OneToOneMapping.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public Long addEmployee(Employee employee) {
        Employee savedEmp = employeeRepo.save(employee);
        return savedEmp.getId();
    }
    public List<Employee> getAllEmp() {
        return employeeRepo.findAll();
    }
    public Employee getById(Long empId) {
        List<Employee> empList = employeeRepo.findAll();
        Employee response = null;
        for(Employee emp : empList){
            if(emp.getId()==empId) response=emp;
        }
        return response;
    }
    public void updateEmp(Long empId,Employee newData) {
        List<Employee> empList = employeeRepo.findAll();
        for(Employee emp : empList){
            if(emp.getId()==empId){
                emp.setId(newData.getId());
                emp.setFirstName(newData.getFirstName());
                emp.setLastName(newData.getLastName());
            }
        }
    }
    public void deleteEmp(Long empId) {
        List<Employee> addressList = employeeRepo.findAll();
        for(Employee add : addressList){
            if(add.getId()==empId){
                employeeRepo.delete(add);
            }
        }
    }
}
