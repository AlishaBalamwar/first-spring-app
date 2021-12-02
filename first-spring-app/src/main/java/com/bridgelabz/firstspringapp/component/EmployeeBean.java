package com.bridgelabz.firstspringapp.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int empId;
    private String empName;

    @Autowired
    private DepartmentBean departmentBean;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    public  EmployeeBean(){}

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean){
        logger.trace("Autowiring using @Autowire annotation on constructor");
        this.departmentBean = departmentBean;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }

    @Autowired
    public void setDepartmentBean(DepartmentBean departmentBean) {
        logger.trace("Autowiring using @Autowire annotation on Setter");
        this.departmentBean = departmentBean;
    }

    public void showEmployeeDetails(){
        logger.debug("Employee id : {}", empId);
        logger.debug("Employee Name : {}", empName);
        departmentBean.setDepartmentName("Information Technology");
        logger.debug("Department : {}", departmentBean.getDepartmentName());
    }
}
