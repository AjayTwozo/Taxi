package org.moduleB;

import org.moduleA.Model;

public class Employee implements Model {

    private String name;
    private Long id;
    private String department;

    public Employee(String name, Long id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public Long id() {
        return id;
    }

    public String getDepartment() {
        return department;
    }
}
