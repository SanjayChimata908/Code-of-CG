package com.example.demo.Service;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Model.User;

@Service
public class UserService {
	
	private List<User> Userlist;

	public UserService() {
		Userlist = new ArrayList<>();
		
		User user1 = new User(1, "sanjay", 25, "sanjay@gamil");
		User user2 = new User(2, "raju", 24, "venu@gamil");
		User user3 = new User(3, "venu", 34, "raju@gamil");
		User user4 = new User(4, "vinay", 31, "vinay@gamil");
		User user5 = new User(5, "santosh", 29, "santosh@gamil");
		
		Userlist.addAll(Arrays.asList(user1,user2,user3,user4,user5));
		
	}

	public Optional<User> getuser(Integer id) {
		
		Optional optional = Optional.empty();
		for (User user:Userlist) {
			if(id ==user.getId()) {
				optional = Optional.of(user);
				return optional;
			}
		}
		return optional;
		
	}

}
