package com.deevyanshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Tourist>> getAllTourists()
	{
		return new ResponseEntity<List<Tourist>>(touristService.getAllTourists(),HttpStatus.OK);
	}

}
