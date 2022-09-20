package alan.Homework2.controller;

import alan.Homework2.model.Department;
import alan.Homework2.model.Employee;
import alan.Homework2.service.DepartmentService;
import alan.Homework2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class EmployeeController {

    private EmployeeService service;

    @GetMapping(value = "/all")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    ;

    @GetMapping(value = "/get/{id}")
    public Employee getEmployee(@PathVariable("id") int EmployeeId) {
        return service.findEmployeeById(EmployeeId);
    }

    ;

    @PostMapping(value ="/new")
    public void addEmployee(@RequestBody Employee d) {
        service.addEmployee(d);
    }

    ;
    @PostMapping(value ="/update/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee d) {
        service.updateEmployee(id,d);
    }

    ;

    @DeleteMapping(value ="/delete/{id}")
    public void deleteEmployee(@PathVariable int id) {
        service.deleteEmployeeById(id);
    }

    @Autowired
    public void setService(EmployeeService service) {
        this.service = service;
    }

    ;
}
