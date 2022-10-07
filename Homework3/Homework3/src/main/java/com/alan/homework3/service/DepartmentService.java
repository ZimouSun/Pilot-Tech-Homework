package com.alan.homework3.service;


import com.alan.homework3.DAO.DepartmentRepository;
import com.alan.homework3.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository repo;



    public Department findDepartmentById(int id) {
        return repo.findById(id).orElse(null);
    }
    public List<Department> getAllDepartments(){
        return repo.findAll() ;
    }

    public void updateDepartment(Department temp) {
        Department exist = repo.findById(temp.getDeptid()).orElse(null);
        exist.setName(temp.getName());
        exist.setLoc(temp.getLoc());
        repo.save(exist);
    }
    public void addDepartment(Department temp) {
        repo.save(temp);
    }
    public void deleteDepartmentById(int id) {
        repo.deleteById(id);
    }

}
