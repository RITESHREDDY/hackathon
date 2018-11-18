package ritesh.sampleProject.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ritesh.sampleProject.models.Employee;

@Repository
public class EmployeeDAO {

	@Autowired 
	public JdbcTemplate jdbcTemplate;
	
	public int addEmployee(Employee employee) {
		
		return jdbcTemplate.update("insert into jdbctestdatabase.employee (employeeName,age) values (? , ?)",employee.getEmployeeName(),employee.getAge());                        
	}

	public List<Employee> getEmployee() {
		
		return (List<Employee>) jdbcTemplate.query("select * from jdbctestdatabase.employee", new EmployeeRowMapper()	);
	}

	public Employee getEmployeeById(int employeeId) {	
		
		return jdbcTemplate.queryForObject("select * from jdbctestdatabase.employee where employeeId = (?)", new Object[] { employeeId } , new EmployeeRowMapper()	);
	}

	public int deleteEmployeeById(int employeeId) {
		
		return jdbcTemplate.update("delete from jdbctestdatabase.employee where employeeId = (?)",new Object[] {employeeId});                        

	}

	public int loginEmployeeById(String employeeName, String employeePassword) {
		
		return jdbcTemplate.queryForObject("select count(1) from jdbctestdatabase.employee where employeeName = (?)", new Object[] { employeeName } , Integer.class);

	}
	
	

}
