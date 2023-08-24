package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Person;
import com.demo.service.VoterService;

@RestController
public class PersonController {
	
	@Autowired
	VoterService voterService;

	@PostMapping("/vote")
	public ResponseEntity<String> doVote(@RequestBody Person person){
		
		String res = voterService.doVote(person);
		
		ResponseEntity<String> response = new ResponseEntity<String>(res , HttpStatus.OK);
		
		return response;
		
	}

}
