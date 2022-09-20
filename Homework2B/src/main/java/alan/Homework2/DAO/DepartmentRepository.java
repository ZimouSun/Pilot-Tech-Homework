package alan.Homework2.DAO;

import alan.Homework2.model.Department;
import alan.Homework2.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class DepartmentRepository {
    static List<Department> departments;
    static {
        departments = new ArrayList<Department>();
        departments.add(new Department(1));
        departments.add(new Department(2));
    }

    public List<Department> getAllDepartments(){
        return departments;
    }

    public Department findDepartmentById(int id){
        return departments.stream().filter(e -> id == e.getDeptid()).findFirst().orElse(null);
    }

    public void updateEmployee(int id, Employee temp){
        Department target = this.findDepartmentById(id);
        target.setName(temp.getName());
    }

    public void updateEmployee(Employee temp){
        Department target = departments.stream().filter(e -> temp.getId() == e.getDeptid()).findFirst().orElse(null);
        if(target != null){
            target.setName(temp.getName());
        }
    }

    public void newEmployee(Department temp){
        //temp should not exist already in employees -- sanity check
        int maxId = departments.stream().mapToInt(e -> e.getDeptid()).max().getAsInt();
        temp.setDeptid(maxId + 1);
        departments.add(temp);
    }

    public void deleteEmployeeById(int id){
        Iterator<Department> it = departments.iterator();
        while(it.hasNext()){
            Department temp = it.next();
            if(id == temp.getDeptid()){
                it.remove();
            }
        }
    }

    public void deleteAllEmployees(){
        //  employees = new ArrayList<>();
        departments.clear();
    }

}