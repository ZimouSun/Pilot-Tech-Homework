import alan.Homework2.DAO.EmployeeRepository;
import alan.Homework2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repo;

    public Employee getEmployeeById(int id) {
        return repo.findEmployeeById(id);
    }
}