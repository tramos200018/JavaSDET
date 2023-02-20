package com.example.restApis.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCart {
	
	ArrayList<User> users  = new ArrayList<>();

	@GetMapping("/viewAllUsers")
	public ArrayList<User> viewAllUsers() {
		
		return users;
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User u) {
		
		
		users.add(u);
		
		
		return "User added";
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteUser(@RequestBody User u) {
		for(int i = 0; i<users.size(); i++) {
			if(users.get(i).getFirstName().equals(u.getFirstName())) {
				users.remove(i);
			}
		}
			
		return "User removed";
	}
	
	@PutMapping("/updateUser/{id}")
	public String updateUser(@PathVariable Long id, @RequestBody User u) {
		for(int i = 0; i<users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				users.set(i, u);
			}
		}
			
		return "User updated";
	}
	
	
}
