package com.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.emaildao.UserDao;



@SpringBootApplication
public class ThisIsProjectForCreatingWebServicesApplication implements CommandLineRunner

{
	
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(ThisIsProjectForCreatingWebServicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.userDao.createTable());
		
	}

}
