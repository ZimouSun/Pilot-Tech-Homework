import java.util.List;

public interface DepartmentDAO {
    public List<Department> getAllDepartments();
    public Department getDepartment( int departmentId);
    public void addDepartment ( Department d);
    public void updateDepartment( Department d);
    public void deleteDepartment( Department d);
}
