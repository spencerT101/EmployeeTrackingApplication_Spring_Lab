package EmployeeTrackingApplication;

import EmployeeTrackingApplication.models.Employee;
import EmployeeTrackingApplication.models.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee() {
//		Employee bob = new Employee("Bob", 150, 1234, "bob@bob.com");
		Employee sally = new Employee("Sally", 256, 5678, "sally@sally.com");
		employeeRepository.save(sally);

	}
}
