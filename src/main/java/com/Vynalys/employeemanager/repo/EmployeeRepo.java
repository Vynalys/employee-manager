package com.Vynalys.employeemanager.repo;

import com.Vynalys.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//Specify class with primary key type to access predefined functions (More info: Ctrl + click on jparepository)
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    //Spring creates function by itself to delete
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
