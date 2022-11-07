package com.deevyanshu.junit;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

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
	public void registerTest()
	{
		Tourist tourist=new Tourist(1007,"Andrew","Jackson","Male",28,"USA",10);
		Tourist tour=service.registerTourist(tourist);
		assertNotNull(repo.findById(tour.getId()));
		repo.deleteById(tour.getId());
	}
	
	

}
