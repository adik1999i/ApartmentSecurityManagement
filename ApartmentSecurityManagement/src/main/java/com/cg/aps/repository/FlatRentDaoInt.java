package com.cg.aps.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.FlatRentEntity;

	@Repository
	public interface FlatRentDaoInt extends JpaRepository<FlatRentEntity, String> {
		List<FlatRentEntity> findByRenterName(String name);
		Optional<FlatRentEntity> findByFlatId(String id);
	}
	
	

