package com.SpringJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringJPA.Dao.UsreRepository;
import com.SpringJPA.entities.User;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(Demo1Application.class, args);
	
	UsreRepository userRepo=context.getBean(UsreRepository.class);
	
	User user=new User();
	user.setId(12);
	user.setName("pratee");
	user.setCity("sambhajinagar");
	User user1=userRepo.save(user);
	System.out.println(user1);
	
	
	
	}

}
