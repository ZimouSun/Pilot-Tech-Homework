package alan.Homework2.service;

import alan.Homework2.DAO.DepartmentRepository;
import alan.Homework2.model.Department;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentService {
    @Autowired
    DepartmentRepository repo;

    public Department findDepartmentById(int id) {
        return repo.findDepartmentById(id);
    }
    public List<Department> getAllDepartments(){
        return repo.getAllDepartments();
    }

    public void updateDepartment(int id, Department temp) {
        repo.updateDepartment(id,temp);
    }
    public void addDepartment(Department temp) {
        repo.addDepartment(temp);
    }
    public void deleteDepartmentById(int id) {
        repo.deleteDepartmentById(id);
    }
    public void deleteAllDepartment(){
        repo.deleteAllDepartments();
    }
}
