package com.deevyanshu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deevyanshu.entity.Tourist;
import com.deevyanshu.service.TouristService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/v1/tourist")
public class TouristController {
	
	@Autowired
	private TouristService touristService;
	
	@PostMapping("/register")
	public ResponseEntity<Tourist> registerTourist(@Valid @RequestBody Tourist tourist)
	{
		return new ResponseEntity<Tourist>(touristService.registerTourist(tourist),HttpStatus.CREATED);
	}

}
