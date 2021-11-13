package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
