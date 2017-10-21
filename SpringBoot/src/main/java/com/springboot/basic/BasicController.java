package com.springboot.basic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@RequestMapping("/alluser")
	public List<User> display(){
		return Arrays.asList(new User("Mrityunjay",26));
	}

}
