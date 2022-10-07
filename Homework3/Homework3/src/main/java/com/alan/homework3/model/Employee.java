package com.alan.homework3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data // toString, EqualandHashCode, RequiredArgsConstructor, Getter, Setter
@Entity //
@Table(name = "Employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String job;
    private int manager;
    private Date hiredate;
    private double salary;
    private int deptid;


}
