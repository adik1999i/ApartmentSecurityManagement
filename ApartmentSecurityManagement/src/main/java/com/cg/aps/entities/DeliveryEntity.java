/**
 * 
 */
package com.cg.aps.entities;

import java.time.LocalDateTime;
import java.util.Date;

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
 * @author Vishal Rana
 *
 */
@Entity
@Table(name = "Delivery")
public class DeliveryEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long deliveryId;
	private String personName;
	private String time;
	private Date date;
    private String status;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey(name = "userId"),name = "userId")
	@JsonIgnore
	private GuardTrainingEntity guard;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey(name = "flatNo"),name = "flatNo")
	@JsonIgnore
	private FlatEntity flat;

	
	public long getDeliveryId() {
		return deliveryId;
	}


	public void setDeliveryId(long deliveryId) {
		this.deliveryId = deliveryId;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public GuardTrainingEntity getGuard() {
		return guard;
	}


	public void setGuard(GuardTrainingEntity guard) {
		this.guard = guard;
	}


	public FlatEntity getFlat() {
		return flat;
	}


	public void setFlat(FlatEntity flat) {
		this.flat = flat;
	}


	public DeliveryEntity(long id, String createdBy, String modifiedBy, LocalDateTime createdDateTime,
			LocalDateTime modifiedDateTime, long deliveryId, String personName, String time, Date date, String status,
			GuardTrainingEntity guard, FlatEntity flat) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.deliveryId = deliveryId;
		this.personName = personName;
		this.time = time;
		this.date = date;
		this.status = status;
		this.guard = guard;
		this.flat = flat;
	}


	public DeliveryEntity() {
		// TODO Auto-generated constructor stub
	}
    
	
}
