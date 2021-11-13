package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Department;
import in.ashokit.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepo repo;

	@Override
	public Department saveDepartment(Department department) {
		
		return repo.save(department);
	}

	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Department getDeptById(Integer departMentId) {
		// TODO Auto-generated method stub
		return repo.findById(departMentId).get();
	}

	@Override
	public void deleteDeptByID(Integer departMentId) {
		
		repo.deleteById(departMentId);
		
	}
	
}
