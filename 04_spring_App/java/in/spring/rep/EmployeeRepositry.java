package in.spring.rep;

import org.springframework.data.repository.CrudRepository;

import in.spring.entity.*;

public interface EmployeeRepositry extends CrudRepository<EmployeeEntity,Integer>{

}
