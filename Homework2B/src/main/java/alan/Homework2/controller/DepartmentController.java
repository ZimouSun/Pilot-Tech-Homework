package alan.Homework2.controller;

import alan.Homework2.model.Department;
import alan.Homework2.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping(value = "/all")
    public List<Department> getAllDepartments() {

        return service.getAllDepartments();

    }

    ;

    @GetMapping(value = "/get/{id}")
    public Department getDepartment(@PathVariable("id") int departmentId) {
        return service.findDepartmentById(departmentId);
    }

    ;

    @PostMapping(value ="/new")
    public void addDepartment(@RequestBody Department d) {
        service.addDepartment(d);
    }

    ;
    @PostMapping(value ="/update/{id}")
    public void updateDepartment(@PathVariable int id, @RequestBody Department d) {
        service.updateDepartment(id,d);
    }

    ;

    @DeleteMapping(value ="/delete/{id}")
    public void deleteDepartment(@PathVariable int id) {
        service.deleteDepartmentById(id);
    }

    ;
}
