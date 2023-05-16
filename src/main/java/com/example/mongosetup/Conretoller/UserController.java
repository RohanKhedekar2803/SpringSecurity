package com.example.mongosetup.Conretoller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongosetup.Entities.User;
import com.example.mongosetup.Repo.UserRepository;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserRepository userrepo;
	
	@PostMapping("/adduser")
	public ResponseEntity<?> adduser(@RequestBody User user) {
		User user1=userrepo.save(user);
		return new ResponseEntity<>(user1,HttpStatus.OK);
	}
	@GetMapping("/getusers")
	public ResponseEntity<?> getuser() {
		ArrayList<User> al=(ArrayList<User>) userrepo.findAll();
		return new ResponseEntity<>(al,HttpStatus.OK);
	}
	
	@GetMapping("/getusers/{mini}/{maxi}")
	public ResponseEntity<?> getdata(@PathVariable int mini,@PathVariable int maxi) {
		ArrayList<User> al=userrepo.findByAgeBetween(mini,maxi);
		return new ResponseEntity<>(al,HttpStatus.OK);
	}
	
}
