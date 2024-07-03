package com.org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.example.custom_exception.UserNotFoundException;
import com.org.example.dto.ErrorResponse;
import com.org.example.entity.User;
import com.org.example.service.UserService;
@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<?> registerUser(@RequestBody User user) {
		User createdUser =userService.create(user);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}
		
	@GetMapping("/all")	
	public ResponseEntity<?> getAllUsers() {
		try {
			return new ResponseEntity<>(userService.fetchAll(),HttpStatus.OK);
		}catch (Exception e) {
			ErrorResponse errRes=new ErrorResponse("user fetching failed",e.getMessage());

			return new ResponseEntity<>(errRes,HttpStatus.BAD_REQUEST);	
		}
	}
		
	@GetMapping("/getUser/{id}")
	public ResponseEntity<?> getUserById(@PathVariable Integer id){
		try {
			return ResponseEntity.ok(userService.fetchById(id));	
	}catch (Exception e) {
		ErrorResponse errRes=new ErrorResponse("Not Found",e.getMessage());

		return new ResponseEntity<>(errRes,HttpStatus.BAD_REQUEST);		
	}
	}
	@PutMapping("/update/{userId}")
	public ResponseEntity<?> updateUserById(@PathVariable("userId")Integer id,@RequestBody User updatedUser){
		try {
			User existingUser= userService.fetchById(id);
			return ResponseEntity.ok(userService.update( updatedUser,existingUser));
		}catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponse("User Updation failed",e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable Integer id){
		try {
			User existingUser=userService.fetchById(id);
			return ResponseEntity.ok(userService.delete(existingUser));
		}catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponse("User deletion failed",e.getMessage()),HttpStatus.BAD_REQUEST);
		}
		
	}
	@GetMapping("/getByName/{name}")
	public ResponseEntity<?> getUserByUserName(@PathVariable String name){
		try {
			ResponseEntity res=null;
			User foundUser =userService.fetchUserByUserName(name);
			if(foundUser != null) {
				res.ok(foundUser);
			}else {
				throw new UserNotFoundException("Invalid username:");	
			}
		return res;
		}catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponse("fetching user by username failed.",e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
}
