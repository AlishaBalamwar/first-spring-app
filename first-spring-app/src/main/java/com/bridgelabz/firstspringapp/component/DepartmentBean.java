package com.bridgelabz.firstspringapp.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {

    public String departmentName;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
     }

    public String getDepartmentName() {
        return departmentName;
    }
}


