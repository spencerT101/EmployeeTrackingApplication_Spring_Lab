package EmployeeTrackingApplication;

import EmployeeTrackingApplication.models.Department;
import EmployeeTrackingApplication.models.Employee;
import EmployeeTrackingApplication.models.Project;
import EmployeeTrackingApplication.repositories.DepartmentRepository;
import EmployeeTrackingApplication.repositories.EmployeeRepository;
import EmployeeTrackingApplication.repositories.ProjectRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackingApplicationTests {

	private Employee sally;
	private Department rnd;
	private Employee sky;
	private Project codeclancoin;

	@Autowired
	DepartmentRepository departmentRepository;


	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;



	@Before
	public void before(){
		rnd = new Department("RnD");
		sally = new Employee("Sally", 256, 5678, "sally@sally.com", rnd);
		sky = new Employee("Sky", 28, 4657, "sky@sky.com", rnd);
		codeclancoin = new Project("CCC", 183);
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee() {
//		rnd = new Department("RnD");
		departmentRepository.save(rnd);
//		sally = new Employee("Sally", 256, 5678, "sally@sally.com", rnd);
		employeeRepository.save(sally);
		employeeRepository.save(sky);
		codeclancoin.addEmployee(sky);
		projectRepository.save(codeclancoin);
	}
//	@Test
//	public void createDepartment(){
//		departmentRepository.save(rnd);
//
//	}
}
