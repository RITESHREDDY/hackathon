package ritesh.sampleProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ritesh.sampleProject.models.Employee;
import ritesh.sampleProject.services.EmployeeService;

@RestController
@RequestMapping(value = "api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public int addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public List<Employee> getEmplloyee()
	{
		return employeeService.getEmployee();
	}
	@RequestMapping(value = "/getEmployeeById", method = RequestMethod.GET)
	public Employee getEmplloyeeById(@RequestParam int employeeId)
	{
		return employeeService.getEmployeeById(employeeId);
	}
	@RequestMapping(value = "/deleteEmployeeById", method = RequestMethod.DELETE)
	public int deleteEmplloyeeById(@RequestParam int employeeId)
	{
		return employeeService.deleteEmployeeById(employeeId);
		//return employeeService.getEmployeeById(employeeId);
	}
	@RequestMapping(value = "/loginEmployeeById", method = RequestMethod.GET)
	public int loginEmplloyeeById(@RequestParam String employeeName, String employeePassword)
	{
		return employeeService.loginEmployeeById(employeeName,employeePassword);
		//return employeeService.getEmployeeById(employeeId);
	}
}
