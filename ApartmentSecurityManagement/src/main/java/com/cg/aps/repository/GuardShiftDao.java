package com.cg.aps.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.GuardShiftEntity;

/**
 * @author HP
 *
 */
@Repository
public interface GuardShiftDao extends JpaRepository<GuardShiftEntity,Long>
{

	Optional<GuardShiftEntity> findByShiftId(long id);
}
	