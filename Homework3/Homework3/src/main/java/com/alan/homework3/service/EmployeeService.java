package com.alan.homework3.service;


import com.alan.homework3.DAO.EmployeeRepository;
import com.alan.homework3.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repo;



    public Employee findEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }
    public List<Employee> getAllEmployees(){
        return repo.findAll();
    }
    public void updateEmployee(Employee temp) {
        Employee exist = repo.findById(temp.getId()).orElse(null);
        exist.setName(temp.getName());
        exist.setJob(temp.getJob());
        exist.setManager(temp.getManager());
        exist.setHiredate(temp.getHiredate());
        exist.setSalary(temp.getSalary());
        exist.setDeptid(temp.getDeptid());
        repo.save(exist);

    }
    public void addEmployee(Employee temp) {
        repo.save(temp);
    }
    public void deleteEmployeeById(int id) {
        repo.deleteById(id);
    }
}