package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {
    PageInfo<Employee> getAllEmp(Integer pageNum);

    void deleteEmpById(Integer empId);
}
