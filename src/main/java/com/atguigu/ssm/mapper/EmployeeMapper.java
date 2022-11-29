package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {


    List<Employee> getAllEmp();

    void deleteEmpById(@Param("empId") Integer empId);
}
