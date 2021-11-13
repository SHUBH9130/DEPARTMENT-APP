package in.ashokit.service;

import java.util.List;

import in.ashokit.entities.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> getAllDepartment();

	public Department getDeptById(Integer departMentId);

	public void deleteDeptByID(Integer departMentId);

}
