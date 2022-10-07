package com.alan.homework3.DAO;

import com.alan.homework3.model.SRID;
import com.alan.homework3.model.SalaryReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryReportRepository extends JpaRepository<SalaryReport, SRID> {
    public SalaryReport findByJobAndDepartment(String job,String department);
}

