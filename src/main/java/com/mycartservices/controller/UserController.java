package com.mycartservices.controller;

import java.util.HashMap; 
import java.util.List;
import java.util.Map;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycartservices.exception.ResourceNotFoundException;
import com.mycartservices.model.AuthRequest;
import com.mycartservices.model.User;
import com.mycartservices.model.UserLogged;
import com.mycartservices.repository.UserRepository;
import com.mycartservices.util.JwtUtil;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@RestController
@RequestMapping("/ur")
@CrossOrigin
public class UserController {
	
	 @Autowired
	    private JwtUtil jwtUtil;
	    @Autowired
	    private AuthenticationManager authenticationManager;

	@Autowired
	private UserRepository userrepository;
	
	
	// for getting all users
	@GetMapping("/users")
	public List<User> getAllUser(){
		return this.userrepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long uid)
			throws ResourceNotFoundException {
		User user = this.userrepository.findById(uid)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + uid));
		return ResponseEntity.ok().body(user);
	}
	
	
	//for posting a user
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return this.userrepository.save(user);
	}
	
	//for editing user
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long uid,
			@Validated @RequestBody User userDetails) throws ResourceNotFoundException {
		User user = this.userrepository.findById(uid)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + uid));

		
		final User updatedUser = this.userrepository.save(userDetails);
		return ResponseEntity.ok(updatedUser);
	}
	
	// for Deleting User
	@DeleteMapping("/users/{id}")
	public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long uid)
			throws ResourceNotFoundException {
		User user = this.userrepository.findById(uid)
				.orElseThrow(() -> new ResourceNotFoundException("user not found for this id :: " + uid));

		this.userrepository.delete(user);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	@PostMapping("/authenticate")
    public UserLogged generateToken(@RequestBody AuthRequest authRequest) throws Exception {
    
		UserLogged userlogged=new UserLogged();;
		try {
        	
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPwd())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
		
			User user=userrepository.findByUserName(authRequest.getUserName());
        	userlogged.setToken(jwtUtil.generateToken(authRequest.getUserName()));
        	userlogged.setUserName(user.getUserName());
        	userlogged.setEmail(user.getaEmail());
        	userlogged.setFirstName(user.getFirstName());
        	userlogged.setLastName(user.getLastName());
        	userlogged.setPhone1(user.getPhone1());
        	userlogged.setPhone2(user.getPhone2());
        	userlogged.setRoleId(user.getRoleId());
        	userlogged.setUid(user.getUid());
        	return userlogged;
    }
	
}
