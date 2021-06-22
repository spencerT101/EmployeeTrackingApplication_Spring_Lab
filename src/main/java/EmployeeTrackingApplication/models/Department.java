package EmployeeTrackingApplication.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


    @JsonIgnoreProperties({"department"})
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Employee> employees;




    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public Department(){
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
