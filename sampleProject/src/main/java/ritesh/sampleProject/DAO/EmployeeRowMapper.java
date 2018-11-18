package ritesh.sampleProject.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ritesh.sampleProject.models.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeName(rs.getString("EmployeeName"));
		employee.setEmployeeId(rs.getInt("EmployeeId"));
		employee.setAge(rs.getInt("age"));
		return employee;

	}


}
