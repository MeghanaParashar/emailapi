package com.emaildao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
@Component
public class UserDao {
	
	@Autowired
	
	private JdbcTemplate jdbcTemplate;
	
	public UserDao()
	{
		
	}
	
	public int createTable()
	{
		String query = "create table if not exists user(id int primary key,"
				+ "to varchar(100),subject varchar(100),message varchar(100))";
		int update = this.jdbcTemplate.update(query);
		return update;
}
}
	

