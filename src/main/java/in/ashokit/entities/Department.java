package in.ashokit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "dept_seq")
	@SequenceGenerator(name = "dept_seq",sequenceName = "dept_seq",initialValue = 1,allocationSize =1 )
	private Integer deptId;
	private String deptName;
	private String deptAddress;
	private String deptEmail;
	private String deptCellNo;
	
	
	public Department() {
	System.out.println("Department :: 0-arg Constructor");
	}


	public Department(Integer deptId, String deptName, String deptAddress, String deptEmail, String deptCellNo) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
		this.deptEmail = deptEmail;
		this.deptCellNo = deptCellNo;
	}


	public Integer getDeptId() {
		return deptId;
	}


	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getDeptAddress() {
		return deptAddress;
	}


	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}


	public String getDeptEmail() {
		return deptEmail;
	}


	public void setDeptEmail(String deptEmail) {
		this.deptEmail = deptEmail;
	}


	public String getDeptCellNo() {
		return deptCellNo;
	}


	public void setDeptCellNo(String deptCellNo) {
		this.deptCellNo = deptCellNo;
	}
	
	
	
}
