import java.util.List;

public interface EmployeeDAO {

     public List<Employee> getAllEmployees();
     public Employee getEmployee(int EmployeeId);
     public void addEmployee( Employee e);
     public void updateEmployee(Employee e);
     public void deleteEmployee(Employee e);


}
