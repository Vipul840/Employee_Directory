package com.kallucoder.Project.EmployeeDAO;

import com.kallucoder.Project.EmployeeTable.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImplementation implements EmployeeDAO{
    private EntityManager entityManager;
    @Autowired
    public EmployeeDAOImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
@Transactional
    @Override
    public Employee save(Employee emp) {
    return entityManager.merge(emp);

    }
@Transactional
    @Override
    public int delete(int id){
     Employee employee=entityManager.find(Employee.class,id);
        entityManager.remove(employee);
        return id;
    }

    @Override
    public List<Employee> getAllList() {
        TypedQuery<Employee> typedQuery=entityManager.createQuery("from Employee",Employee.class);
        return typedQuery.getResultList();
    }

    @Override
    public Employee getList(int id) {
        return entityManager.find(Employee.class,id);
    }
}
