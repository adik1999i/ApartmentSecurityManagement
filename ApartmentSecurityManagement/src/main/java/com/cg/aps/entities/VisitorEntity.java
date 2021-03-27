package com.cg.aps.entities;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author AMBARISH DATAR
 *
 */
@Entity
@Table(name="Visitor")
public class VisitorEntity extends BaseEntity{

	@Id
	@GeneratedValue
	private int visitorId;
	private String name;
	private Date date;
	private String arrivalTime;
	private String departureTime;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey(name = "flatNo"),name = "flatNo")
	@JsonIgnore
	private FlatEntity flat;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey(name = "userId"),name = "userId")
	@JsonIgnore
	private GuardTrainingEntity guard;
	
	


	public int getVisitorId() {
		return visitorId;
	}




	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




	public String getArrivalTime() {
		return arrivalTime;
	}




	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}




	public String getDepartureTime() {
		return departureTime;
	}




	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}




	public FlatEntity getFlat() {
		return flat;
	}




	public void setFlat(FlatEntity flat) {
		this.flat = flat;
	}




	public GuardTrainingEntity getGuard() {
		return guard;
	}




	public void setGuard(GuardTrainingEntity guard) {
		this.guard = guard;
	}




	public VisitorEntity(long id, String createdBy, String modifiedBy, LocalDateTime createdDateTime,
			LocalDateTime modifiedDateTime, int visitorId, String name, Date date, String arrivalTime,
			String departureTime, FlatEntity flat, GuardTrainingEntity guard) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.visitorId = visitorId;
		this.name = name;
		this.date = date;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.flat = flat;
		this.guard = guard;
	}




	public VisitorEntity() {
		// TODO Auto-generated constructor stub
	}
}
