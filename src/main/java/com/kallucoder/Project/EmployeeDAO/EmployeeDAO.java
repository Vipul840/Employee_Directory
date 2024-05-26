package com.kallucoder.Project.EmployeeDAO;
import java.util.*;
import com.kallucoder.Project.EmployeeTable.Employee;
import org.springframework.stereotype.Repository;


public interface EmployeeDAO {
public Employee save(Employee emp);
public int delete(int id);
public List<Employee> getAllList();
public Employee getList(int id);
}
