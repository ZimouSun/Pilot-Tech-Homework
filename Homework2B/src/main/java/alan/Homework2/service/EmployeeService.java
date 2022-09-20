package alan.Homework2.service;

import alan.Homework2.DAO.EmployeeRepository;
import alan.Homework2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repo;


    public Employee findEmployeeById(int id) {
        return repo.findEmployeeById(id);
    }
    public List<Employee> getAllEmployees(){
        return repo.getAllEmployees();
    }
    public void updateEmployee(int id,Employee temp) {
        repo.updateEmployee(id, temp);
    }

    public void addEmployee(Employee temp) {
        repo.addEmployee(temp);
    }
    public void deleteEmployeeById(int id) {
        repo.deleteEmployeeById(id);
    }
    public void deleteAllEmployee(){
        repo.deleteAllEmployees();
    }
}