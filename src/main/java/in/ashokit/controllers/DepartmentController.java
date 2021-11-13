package in.ashokit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entities.Department;
import in.ashokit.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	//Saving the Department Details
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		
		return service.saveDepartment(department);
		
	}

	//Get All Departments
	@GetMapping("/departments")
	public List<Department> getAllDepartment(){
		
		return service.getAllDepartment();
	}
	
	
	//Get Department By Id
	@GetMapping("/departments/{id}")
	public Department getDeptById(@PathVariable("id") Integer departMentId) {
		
		return service.getDeptById(departMentId);
		
	}
	
	//Delete DeptBy ID
	@DeleteMapping("/departments/{id}")
	public String deleteDeptByID(@PathVariable("id") Integer departMentId) {
		service.deleteDeptByID(departMentId);
		return departMentId+" You are succesfully deleted the Dept";
	}
	
	
}//controller
