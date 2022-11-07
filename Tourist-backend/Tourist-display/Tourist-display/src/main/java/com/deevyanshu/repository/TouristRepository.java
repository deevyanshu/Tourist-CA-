package com.deevyanshu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deevyanshu.entity.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Long>{

}
