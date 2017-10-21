package com.springboot.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> userList= new ArrayList<User>(Arrays.asList(
			new User("A1","A",24),
			new User("B1","B",25),				
			new User("C","C",26)
			
			));
	
	public List<User> getAllUser(){
		return userList;
	}

	public User getUser(String id) {
		
		return userList.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userList.add(user);
	}
}
