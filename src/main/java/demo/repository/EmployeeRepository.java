package main.java.repository;
 
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import main.java.model.Employee;
 
@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
 
}