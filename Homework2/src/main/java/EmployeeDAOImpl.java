import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    static List<Employee> Employees;

    static
    {
        Employees = new ArrayList<Employee>();
        Employees.add(new Employee(0,"Alan", "sde", 99, new Date(2022,1,1),  10000, 0));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return Employees;
    }

    @Override
    public Employee getEmployee(int EmployeeId) {
        return Employees.get(EmployeeId);
    }

    @Override
    public void addEmployee(Employee e) {
        Employees.add(e);
    }

    @Override
    public void updateEmployee(Employee e) {
        Employees.set(e.getId(),e);
    }

    @Override
    public void deleteEmployee(Employee e) {
        Employees.remove(e);

    }
}
