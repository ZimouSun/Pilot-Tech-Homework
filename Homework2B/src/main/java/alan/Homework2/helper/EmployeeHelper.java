package alan.Homework2.helper;

import alan.Homework2.DAO.DepartmentRepository;
import alan.Homework2.DAO.EmployeeRepository;
import alan.Homework2.model.Department;
import alan.Homework2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeHelper {


     EmployeeRepository repo;


    public EmployeeHelper() {
    }

    public List<Employee> getAllEmployees()
    {
        return  repo.getAllEmployees();
    }

    @Autowired

    public void setRepo(EmployeeRepository repo) {
        this.repo = repo;
    }
}
