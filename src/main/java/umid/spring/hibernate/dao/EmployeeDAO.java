package umid.spring.hibernate.dao;

import umid.spring.hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    public void deleteEmployee(int id);


}

