package com.zensar.springbootapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.springbootapp.entity.User;

/*
 * dispatcher-servlet.xml
 * 
 * <context:component-scan base-package="">
 * 
 * <bean class="">
 * 		<property name="prefix" value="">
 * <property name="suffix" value="">
 * </bean>
 * 
 */

// Spring MVC 1 WebApplication  2 Restful Application
@Controller
@RestController
public class HomeController {

	List<User> users = new ArrayList<>();

	public HomeController() {
		users.add(new User(1001, "Rohit", 31, "rohit.sharma@gmail.com"));
		users.add(new User(1003, "Virat", 32, "virat.kohli@gmail.com"));
		users.add(new User(1002, "KL", 28, "kl.rahul@gmail.com"));
	}

	// http://localhost:8080/users/1002

	@RequestMapping("/users/{userId}")
	public User getUser(@PathVariable("userId") int userId) {
		for (User user : users) {
			if (user.getUserId() == userId)
				return user;
		}
		return null;
	}

	// http://localhost:8080/users
	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return users;
	}

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}

}
