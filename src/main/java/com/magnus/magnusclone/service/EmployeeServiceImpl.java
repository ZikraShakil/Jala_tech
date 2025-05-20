package com.magnus.magnusclone.service;

import com.magnus.magnusclone.model.Employee;
import com.magnus.magnusclone.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee create(Employee emp) {
        return repo.save(emp);
    }

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Employee update(Long id, Employee emp) {
        Employee existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(emp.getName());
            existing.setEmail(emp.getEmail());
            existing.setRole(emp.getRole());
            return repo.save(existing);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
