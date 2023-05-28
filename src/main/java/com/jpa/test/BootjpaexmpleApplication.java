package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexmpleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexmpleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Ashesh Maharjan");
		user.setCity("Kathmandu");
		user.setStatus("I am a Java Programmer");
		
		User user1 = userRepository.save(user);
		System.out.println(user1);
		
	}

}
