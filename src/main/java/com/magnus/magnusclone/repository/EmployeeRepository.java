package com.magnus.magnusclone.repository;

import com.magnus.magnusclone.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
