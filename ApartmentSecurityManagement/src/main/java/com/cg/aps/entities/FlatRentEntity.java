package com.cg.aps.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="FlatRent")

public class FlatRentEntity extends BaseEntity {

	
	@Id
	@GeneratedValue
	private String flatId;
	private String renterName;
	private String amount;
	private String type;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey(name = "flatNo"),name = "flatNo")
	@JsonIgnore
	private FlatEntity flat;
	
	
	
	public String getFlatId() {
		return flatId;
	}



	public void setFlatId(String flatId) {
		this.flatId = flatId;
	}



	public String getRenterName() {
		return renterName;
	}



	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public FlatEntity getFlat() {
		return flat;
	}



	public void setFlat(FlatEntity flat) {
		this.flat = flat;
	}



	public FlatRentEntity(long id, String createdBy, String modifiedBy, LocalDateTime createdDateTime,
			LocalDateTime modifiedDateTime, String flatId, String renterName, String amount, String type,
			FlatEntity flat) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.flatId = flatId;
		this.renterName = renterName;
		this.amount = amount;
		this.type = type;
		this.flat = flat;
	}



	public FlatRentEntity() {
		// TODO Auto-generated constructor stub
	}

}
