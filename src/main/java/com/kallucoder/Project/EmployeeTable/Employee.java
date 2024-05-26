package com.kallucoder.Project.EmployeeTable;

import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.Name;

import javax.annotation.processing.Generated;

@Table(name = "Employee")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    @Column(name = "Name")
    private String name;



    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
