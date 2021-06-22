package EmployeeTrackingApplication.repositories;

import EmployeeTrackingApplication.models.Employee;
import EmployeeTrackingApplication.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
