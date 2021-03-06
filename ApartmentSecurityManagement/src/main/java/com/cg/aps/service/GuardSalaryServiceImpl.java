package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.GuardSalaryEntity;
import com.cg.aps.repository.GuardSalaryDao;


/**
 * @author Aravind
 *
 */
@Service("GuardSalaryService")
@Transactional
public class GuardSalaryServiceImpl implements GuardSalaryService {
	
	@Autowired
	GuardSalaryDao dao;

	@Override
	public GuardSalaryEntity add(GuardSalaryEntity bean) {
		// TODO Auto-generated method stub
		return dao.save(bean);
	}

	@Override
	public GuardSalaryEntity update(GuardSalaryEntity bean) {
		return dao.save(bean);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	

	@Override
	public Optional<GuardSalaryEntity> findByPk(long id) {
		// TODO Auto-generated method stub
		return dao.findBySalaryId(id);
	}

	@Override
	public List<GuardSalaryEntity> search(GuardSalaryEntity bean, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GuardSalaryEntity> search() {
		// TODO Auto-generated method stub
		return dao.findAll();

}
}
