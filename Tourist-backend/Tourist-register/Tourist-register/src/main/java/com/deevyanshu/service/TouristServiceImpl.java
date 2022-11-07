package com.deevyanshu.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deevyanshu.entity.Tourist;
import com.deevyanshu.repository.TouristRepository;

@Service
public class TouristServiceImpl implements TouristService{
	
	@Autowired
	private TouristRepository touristRepository;

	@Override
	public Tourist registerTourist(Tourist tourist) {
		// TODO Auto-generated method stub
		return touristRepository.save(tourist);
	}

}
