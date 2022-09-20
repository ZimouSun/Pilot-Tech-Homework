package alan.Homework2.helper;

import alan.Homework2.DAO.DepartmentRepository;
import alan.Homework2.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentHelper {

    @Autowired
    DepartmentRepository repo;


    public DepartmentHelper() {
    }

    public List<Department> getAllDepartments()
    {
       return  repo.getAllDepartments();
    }
}
