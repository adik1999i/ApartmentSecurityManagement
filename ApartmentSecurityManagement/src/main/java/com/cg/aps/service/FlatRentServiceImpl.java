package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.FlatRentEntity;
import com.cg.aps.repository.FlatRentDaoInt;



@Service("FlatRentService")
@Transactional
public class FlatRentServiceImpl implements FlatRentServiceInt{
	
	@Autowired
	FlatRentDaoInt dao;

	@Override
	public FlatRentEntity add(FlatRentEntity bean) {
		// TODO Auto-generated method stub
		return dao.save(bean);
	}

	@Override
	public FlatRentEntity update(FlatRentEntity bean) {
		// TODO Auto-generated method stub
		return dao.save(bean);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<FlatRentEntity> findByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByRenterName(name);
	}

	@Override
	public Optional<FlatRentEntity> findByPk(String id) {
		// TODO Auto-generated method stub
		return dao.findByFlatId(id);
	}

	@Override
	public List<FlatRentEntity> search(FlatRentEntity bean, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlatRentEntity> search() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	

}
