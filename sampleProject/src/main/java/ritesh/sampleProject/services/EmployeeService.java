package ritesh.sampleProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ritesh.sampleProject.DAO.EmployeeDAO;
import ritesh.sampleProject.models.Employee;

@Service
public class EmployeeService {

	@Autowired 
	public EmployeeDAO employeeDAO;
	
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employee);
	}

	public List<Employee> getEmployee() {
	
		return employeeDAO.getEmployee();
	}
	public Employee getEmployeeById(int employeeId) {
		
		return employeeDAO.getEmployeeById(employeeId);
	}

	public int deleteEmployeeById(int employeeId) {
		
		return employeeDAO.deleteEmployeeById(employeeId);
			}

	public int loginEmployeeById(String employeeName, String employeePassword) {
		
		return employeeDAO.loginEmployeeById(employeeName,employeePassword);
	}
}
