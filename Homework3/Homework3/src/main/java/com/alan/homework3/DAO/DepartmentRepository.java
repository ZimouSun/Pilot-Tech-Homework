package com.alan.homework3.DAO;


import com.alan.homework3.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {



}