package com.cg.aps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.aps.entities.GuardSalaryEntity;
import com.cg.aps.repository.GuardSalaryDao;
import com.cg.aps.service.GuardSalaryService;



/**
 * @author Aravind
 *
 */
@SpringBootTest
class GuardSalaryServiceTest {
	@MockBean
	GuardSalaryDao dao;
	@Autowired
	GuardSalaryService service;
	
	
	//test case for adding values 
	@Test
	public void testAddGuardSalary()
	{
		
		GuardSalaryEntity obj = new GuardSalaryEntity(1, "aravind", "aditya", LocalDateTime.now() , LocalDateTime.now(),"Aravind", 2000,"101","credited",Date.valueOf(LocalDate.now()));
		
		
		
		Mockito.when(dao.save(obj)).thenReturn(obj);
		assertEquals(obj,service.add(obj));
			
		
	}
	//test case for updating the existing values
	@Test 
	public void testUpdateGuardTraining()
	{
		
		GuardSalaryEntity obj = new GuardSalaryEntity(1, "aravind", "aditya", LocalDateTime.now() , LocalDateTime.now(),"Aravind", 2000,"101","credited",Date.valueOf(LocalDate.now()));
	
	   
	    Mockito.when(dao.save(obj)).thenReturn(obj);

	    assertEquals(obj,service.add(obj));
	    
	    obj.setName("harsh");
	    obj.setStatus("working");
	     
	      assertEquals(obj,service.update(obj));
	}
	
	//test case for deleting values 
	@Test
	public void testDeleteGuardSalary()
	{
		GuardSalaryEntity obj = new GuardSalaryEntity(1, "aravind", "aditya", LocalDateTime.now() , LocalDateTime.now(),"Aravind", 2000,"101","credited",Date.valueOf(LocalDate.now()));
	    service.delete(obj.getUserId());
	    verify(dao,times(1)).deleteById(obj.getUserId());
	}
	
	//test case for finding a value by it's name
	@Test
	public void testFindByName()
	{
		String name="aravind";
		GuardSalaryEntity obj = new GuardSalaryEntity(1, "aravind", "aditya", LocalDateTime.now() , LocalDateTime.now(),"Aravind", 2000,"101","credited",Date.valueOf(LocalDate.now()));
		GuardSalaryEntity obj1 = new GuardSalaryEntity(1, "anshul", "ambarish", LocalDateTime.now() , LocalDateTime.now(),"Aravind",2000,"102","received",Date.valueOf(LocalDate.now()));
		
	List<GuardSalaryEntity> list  = new ArrayList();
	list.add(obj);
	list.add(obj1);
	
		Mockito.when(dao.findByName(name)).thenReturn(list);
		assertEquals(2,service.findByName(name).size());
		
	}
	
	//test case for finding a value by Id
	@Test
	public void testFindByPk()
	{
		
		Optional<GuardSalaryEntity> obj =Optional.of(new GuardSalaryEntity(1, "aravind", "aditya", LocalDateTime.now() , LocalDateTime.now(),"Aravind", 2000,"101","credited",Date.valueOf(LocalDate.now())));
 
		Mockito.when(dao.findByUserId((int) obj.get().getUserId())).thenReturn(obj);
		Optional<GuardSalaryEntity> obj1 = service.findByPk(obj.get().getUserId());
		assertEquals(obj.get().getUserId(),obj1.get().getUserId());
		
	}
	//test case for searching any value
	@Test
	public void testSearch()
	{
		GuardSalaryEntity obj = new GuardSalaryEntity(1, "aravind", "aditya", LocalDateTime.now() , LocalDateTime.now(),"Aravind", 2000,"101","credited",Date.valueOf(LocalDate.now()));
		GuardSalaryEntity obj1 = new GuardSalaryEntity(1, "anshul", "ambarish", LocalDateTime.now() , LocalDateTime.now(),"Aravind",2000,"102","received",Date.valueOf(LocalDate.now()));
		
		List<GuardSalaryEntity> list1  = new ArrayList();
		list1.add(obj);
		list1.add(obj1);
		
		
		Mockito.when(dao.findAll()).thenReturn(list1);
		assertEquals(2,service.search().size());
	}
}
