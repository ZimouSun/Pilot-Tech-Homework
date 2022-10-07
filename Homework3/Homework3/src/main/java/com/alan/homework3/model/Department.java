package com.alan.homework3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity  // data the persists in the database
@Table(name ="department", schema = "course") //  @Table annotation allows you to specify the details
                            // of the table that will be used to persist the entity in the
                            // database
public class Department {
    @Id
    private int deptid;
    private String name;
    private String loc;


}
