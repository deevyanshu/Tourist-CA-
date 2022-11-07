package com.deevyanshu.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deevyanshu.entity.Tourist;
import com.deevyanshu.repository.TouristRepository;

@Service
public class TouristServiceImpl implements TouristService{
	
	@Autowired
	private TouristRepository touristRepository;

	@Override
	public List<Tourist> getAllTourists() {
		// TODO Auto-generated method stub
		List<Tourist> list=touristRepository.findAll();
		Collections.sort(list,new Comparator<Tourist>() {

			@Override
			public int compare(Tourist o1, Tourist o2) {
				// TODO Auto-generated method stub
				return -(o1.getFirstName().compareTo(o2.getFirstName()));
			}
		});
		return list;
	}

}
