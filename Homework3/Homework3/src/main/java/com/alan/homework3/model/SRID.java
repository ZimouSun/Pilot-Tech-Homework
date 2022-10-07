package com.alan.homework3.model;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable // to declare that a class will be embedded by other entities
public class SRID implements Serializable {
    public String job;
    public String department;
}
