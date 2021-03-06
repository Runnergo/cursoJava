package com.talibank.timebank;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/usersApi")
@CrossOrigin(origins = "http://localhost:8081",methods={RequestMethod.GET,RequestMethod.POST})
public class UserRESTController {
	
	@Autowired
	UserRepository repository;
	
	@GetMapping
	public User getUserById(@RequestParam("email") String email, Model model) {
		Optional<User> user = repository.findById(email);
		if (user.isPresent()) {
			return user.get();
		}
		return null;
	}
	
	@PostMapping(path="/users", consumes="application/json")
	public void insertBook(@RequestBody User user) {

		repository.save(user);
	}


}
