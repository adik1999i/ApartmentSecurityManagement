package com.cg.aps.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



/**
 * @author Aravind
 *
 */
@Entity
@Table(name="GuardSalary")


public class GuardSalaryEntity extends BaseEntity {

	
	@Id
	private long salaryId;
	private String amount;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey(name = "userId"),name = "userId")
	@JsonIgnore
	private GuardTrainingEntity guard;

	
	
	
	
	public long getSalaryId() {
		return salaryId;
	}





	public void setSalaryId(long salaryId) {
		this.salaryId = salaryId;
	}





	public String getAmount() {
		return amount;
	}





	public void setAmount(String amount) {
		this.amount = amount;
	}





	public GuardTrainingEntity getGuard() {
		return guard;
	}





	public void setGuard(GuardTrainingEntity guard) {
		this.guard = guard;
	}





	public GuardSalaryEntity(long id, String createdBy, String modifiedBy, LocalDateTime createdDateTime,
			LocalDateTime modifiedDateTime, long salaryId, String amount, GuardTrainingEntity guard) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.salaryId = salaryId;
		this.amount = amount;
		this.guard = guard;
	}





	public GuardSalaryEntity() {
		// TODO Auto-generated constructor stub
	}
		
}