package com.cg.aps.entities;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author HP
 *
 */
@Entity
@Table(name="GuardShift")


public class GuardShiftEntity extends BaseEntity
{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long shiftId;
	private String shiftTime;
	private Date shiftDate;
	

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey(name = "userId"),name = "userId")
	@JsonIgnore
	private GuardTrainingEntity guard;


	public long getShiftId() {
		return shiftId;
	}


	public void setShiftId(long shiftId) {
		this.shiftId = shiftId;
	}


	public String getShiftTime() {
		return shiftTime;
	}


	public void setShiftTime(String shiftTime) {
		this.shiftTime = shiftTime;
	}


	public Date getShiftDate() {
		return shiftDate;
	}


	public void setShiftDate(Date shiftDate) {
		this.shiftDate = shiftDate;
	}


	public GuardTrainingEntity getGuard() {
		return guard;
	}


	public void setGuard(GuardTrainingEntity guard) {
		this.guard = guard;
	}


	public GuardShiftEntity(long id, String createdBy, String modifiedBy, LocalDateTime createdDateTime,
			LocalDateTime modifiedDateTime, long shiftId, String shiftTime, Date shiftDate, GuardTrainingEntity guard) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.shiftId = shiftId;
		this.shiftTime = shiftTime;
		this.shiftDate = shiftDate;
		this.guard = guard;
	}

	public GuardShiftEntity() {
		// TODO Auto-generated constructor stub
	}

	
}
