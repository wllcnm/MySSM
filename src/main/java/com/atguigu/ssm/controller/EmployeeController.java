package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public String GetAllEmp(@PathVariable("pageNum") Integer pageNum, Model model) {
        PageInfo<Employee> page = employeeService.getAllEmp(pageNum);
        model.addAttribute("page", page);
        return "employee_list";
    }

    @RequestMapping(value = "/employee/page/{pageNum}/{empId}", method = RequestMethod.DELETE)
    public String GetAllEmp(@PathVariable("empId") Integer empId,@PathVariable("pageNum") Integer pageNum) {
        employeeService.deleteEmpById(empId);
        return "redirect:/employee/page/"+pageNum;
    }

}
