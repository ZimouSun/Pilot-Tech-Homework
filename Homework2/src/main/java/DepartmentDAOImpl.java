import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOImpl implements DepartmentDAO{
    static List<Department> Departments;

    // instantiate
    static {
        Departments = new ArrayList<Department>();
        Departments.add(new Department(0,"St.Gabriel's", "171 Washington st, Brighton, MA"));
    }

    @Override
    public List<Department> getAllDepartments() {
        return Departments;
    }

    @Override
    public Department getDepartment(int departmentId) {
        return Departments.get(departmentId);
    }

    @Override
    public void addDepartment(Department d) {
        Departments.add(d);

    }

    @Override
    public void updateDepartment(Department d) {
        Departments.set(d.getDeptid(),d);

    }

    @Override
    public void deleteDepartment(Department d) {
        Departments.remove(d);

    }




}
