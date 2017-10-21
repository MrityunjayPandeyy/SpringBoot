package com.springboot.basic;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/alluser")
	public List<User> display(){
		return userService.getAllUser();
	}
	
	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable String id){
		return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/adduser")
	public String addUser(@RequestBody User user){
		userService.addUser(user);
		return "200ok";
	}

}
