package com.deevyanshu.junit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.deevyanshu.entity.Tourist;
import com.deevyanshu.repository.TouristRepository;
import com.deevyanshu.service.TouristServiceImpl;

@SpringBootTest
public class TouristTest {
	
	@Autowired
	private TouristServiceImpl service;
	
	@Autowired
	private TouristRepository repo;

	
	@Test
	public void getAllTest()
	{
		List<Tourist> list=service.getAllTourists();
		assertEquals(list.size(),repo.findAll().size());
		
	}
}
