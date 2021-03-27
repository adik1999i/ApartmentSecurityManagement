package com.cg.aps.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.aps.entities.GuardSalaryEntity;

/**
 * @author Aravind
 *
 */
public interface GuardSalaryDao extends JpaRepository<GuardSalaryEntity, Long> {
	 
 Optional<GuardSalaryEntity> findBySalaryId(long id);
}
