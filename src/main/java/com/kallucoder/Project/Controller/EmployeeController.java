package com.kallucoder.Project.Controller;
import java.util.*;
import com.kallucoder.Project.EmployeeDAO.EmployeeDAO;
import com.kallucoder.Project.EmployeeTable.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class EmployeeController {
    EmployeeDAO employeeDAO;
@Autowired
public EmployeeController(EmployeeDAO employeeDAO) {
    this.employeeDAO = employeeDAO;
}
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeDAO.getList(id);
    }

    @GetMapping("/employees")
    public List<Employee> getList() {
        return employeeDAO.getAllList();
    }

    @PostMapping("/employees")
    public Employee PostEmployee(@RequestBody Employee emp){
        emp.setId(0);
        return employeeDAO.save(emp);
    }
    @PutMapping("/employees")
    public Employee UpdateEmployee(@RequestBody Employee emp){
        return employeeDAO.save(emp);
    }
    @DeleteMapping("/employees/{id}")
    public int DeleteEmployee(@PathVariable int id){
        return employeeDAO.delete(id);
    }
}