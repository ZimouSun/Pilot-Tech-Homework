package com.alan.homework3.service;

import com.alan.homework3.DAO.SalaryReportRepository;
import com.alan.homework3.model.SalaryReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryReportService {
    @Autowired
    SalaryReportRepository repo;

    public SalaryReport getSalaryReportById(String job, String department) {
        return repo.findByJobAndDepartment(job,department);
    }
    public List<SalaryReport> getSalaryReports(){
        return repo.findAll();
    }
}