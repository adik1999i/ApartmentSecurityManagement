package com.cg.aps.entities;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="GuardTraining")
public class GuardTrainingEntity extends BaseEntity{

	


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String name;
	private String mobileNo;
	private String status;
	private String timing;
	
	private Date date;
	
	@OneToMany(mappedBy = "guard")
	@JsonIgnore
	private Set<DeliveryEntity> deliverySet;

	@OneToMany(mappedBy = "guard")
	@JsonIgnore
	private Set<VisitorEntity> visitorSet;
	@OneToMany(mappedBy = "guard")
	@JsonIgnore
	private Set<SecurityEntity> alertSet;
	@OneToMany(mappedBy = "guard")
	@JsonIgnore
	private Set<GuardShiftEntity> guardShiftSet;

	@OneToOne(mappedBy = "guard")
	@JsonIgnore
	private GuardSalaryEntity salary;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<DeliveryEntity> getDeliverySet() {
		return deliverySet;
	}

	public void setDeliverySet(Set<DeliveryEntity> deliverySet) {
		this.deliverySet = deliverySet;
	}

	public Set<VisitorEntity> getVisitorSet() {
		return visitorSet;
	}

	public void setVisitorSet(Set<VisitorEntity> visitorSet) {
		this.visitorSet = visitorSet;
	}

	public Set<SecurityEntity> getAlertSet() {
		return alertSet;
	}

	public void setAlertSet(Set<SecurityEntity> alertSet) {
		this.alertSet = alertSet;
	}

	public Set<GuardShiftEntity> getGuardShiftSet() {
		return guardShiftSet;
	}

	public void setGuardShiftSet(Set<GuardShiftEntity> guardShiftSet) {
		this.guardShiftSet = guardShiftSet;
	}

	public GuardSalaryEntity getSalary() {
		return salary;
	}

	public void setSalary(GuardSalaryEntity salary) {
		this.salary = salary;
	}

	public GuardTrainingEntity(long id, String createdBy, String modifiedBy, LocalDateTime createdDateTime,
			LocalDateTime modifiedDateTime, long userId, String name, String mobileNo, String status, String timing,
			Date date, Set<DeliveryEntity> deliverySet, Set<VisitorEntity> visitorSet, Set<SecurityEntity> alertSet,
			Set<GuardShiftEntity> guardShiftSet, GuardSalaryEntity salary) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.userId = userId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.status = status;
		this.timing = timing;
		this.date = date;
		this.deliverySet = deliverySet;
		this.visitorSet = visitorSet;
		this.alertSet = alertSet;
		this.guardShiftSet = guardShiftSet;
		this.salary = salary;
	}

	public GuardTrainingEntity() {
		// TODO Auto-generated constructor stub
	}
	
}
