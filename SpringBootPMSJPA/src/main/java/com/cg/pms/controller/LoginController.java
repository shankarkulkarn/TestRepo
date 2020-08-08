package com.cg.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pms.exception.LoginException;
import com.cg.pms.service.LoginService;
/*
 * 
 */
@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@GetMapping("login/validate/{user}/{pass}")
	public ResponseEntity<String> validate(@PathVariable("user") String userName,
			@PathVariable("pass") String userPass) throws LoginException
	{
		  String role = loginService.validate(userName, userPass);
		  ResponseEntity<String>   re = new ResponseEntity<>(role,HttpStatus.OK);
		  return re ;
	}
	
}
