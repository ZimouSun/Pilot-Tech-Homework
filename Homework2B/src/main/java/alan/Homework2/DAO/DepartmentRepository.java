package alan.Homework2.DAO;

import alan.Homework2.model.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository {
    public Department findById(int id);
}