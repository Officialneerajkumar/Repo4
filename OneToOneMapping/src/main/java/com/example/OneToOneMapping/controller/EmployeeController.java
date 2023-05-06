package com.example.OneToOneMapping.controller;

import com.example.OneToOneMapping.model.Employee;
import com.example.OneToOneMapping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/ems")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/add-employee")
    public String addEmp(@RequestBody Employee employee){
        Long empId = employeeService.addEmployee(employee);
        return "Employee added successfully with Id -> "+empId;
    }
    @GetMapping(value = "/get-all-emp")
    public List<Employee> getAllEmp(){
        return employeeService.getAllEmp();
    }
    @GetMapping(value = "/get-emp-by-Id")
    public Employee getById(@RequestParam Long empId){
        return employeeService.getById(empId);
    }
    @PutMapping(value = "/update-emp")
    public String updateEmp(@RequestParam Long empId,@RequestBody Employee newData){
        employeeService.updateEmp(empId,newData);
        return "Emp updated successfully !";
    }
    @DeleteMapping(value = "/delete-emp")
    public String deleteEmp(@RequestParam Long empId){
        employeeService.deleteEmp(empId);
        return "emp deleted successfully !!";
    }
}
