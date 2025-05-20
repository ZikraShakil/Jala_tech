package com.magnus.magnusclone.service;

import com.magnus.magnusclone.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee create(Employee emp);
    List<Employee> getAll();
    Employee getById(Long id);
    Employee update(Long id, Employee emp);
    void delete(Long id);
}
