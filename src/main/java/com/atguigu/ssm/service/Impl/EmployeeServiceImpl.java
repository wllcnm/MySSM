package com.atguigu.ssm.service.Impl;

import com.atguigu.ssm.mapper.EmployeeMapper;
import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public PageInfo<Employee> getAllEmp(Integer pageNum) {
        PageHelper.startPage(pageNum,4);
        List<Employee> allEmp = employeeMapper.getAllEmp();
        //返回pageInfo,需要传入两个参数:查询出来的list,和导航页
        //此时pageInfo.list就是我需要的list
        PageInfo<Employee> page=new PageInfo<>(allEmp,5);
        return page;
    }

    @Override
    public void deleteEmpById(Integer empId) {
        employeeMapper.deleteEmpById(empId);
    }
}
