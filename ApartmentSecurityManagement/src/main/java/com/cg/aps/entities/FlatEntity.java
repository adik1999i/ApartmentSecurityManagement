package com.cg.aps.entities;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Flat")
public class FlatEntity extends BaseEntity {

	
	
	@Id
	private String flatNo;
	private String ownerName;
	private String floorNo;
	private String flatType;
	
	@OneToMany(mappedBy = "flat")
	@JsonIgnore
	private Set<DeliveryEntity> deliverySet;
	
	@OneToMany(mappedBy = "flat")
	@JsonIgnore
	private Set<VisitorEntity> visitorSet;
	
	@OneToMany(mappedBy = "flat")
	@JsonIgnore
	private Set<VehicleEntity> vehicleSet;
	
	@OneToMany(mappedBy = "flat")
	@JsonIgnore
	private Set<SecurityEntity> alertSet;
	
	@OneToOne(mappedBy = "flat")
	@JsonIgnore
	private FlatRentEntity rent;
	
	
	


	public String getFlatNo() {
		return flatNo;
	}





	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}





	public String getOwnerName() {
		return ownerName;
	}





	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}





	public String getFloorNo() {
		return floorNo;
	}





	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}





	public String getFlatType() {
		return flatType;
	}





	public void setFlatType(String flatType) {
		this.flatType = flatType;
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





	public Set<VehicleEntity> getVehicleSet() {
		return vehicleSet;
	}





	public void setVehicleSet(Set<VehicleEntity> vehicleSet) {
		this.vehicleSet = vehicleSet;
	}





	public Set<SecurityEntity> getAlertSet() {
		return alertSet;
	}





	public void setAlertSet(Set<SecurityEntity> alertSet) {
		this.alertSet = alertSet;
	}





	public FlatRentEntity getRent() {
		return rent;
	}





	public void setRent(FlatRentEntity rent) {
		this.rent = rent;
	}





	public FlatEntity(long id, String createdBy, String modifiedBy, LocalDateTime createdDateTime,
			LocalDateTime modifiedDateTime, String flatNo, String ownerName, String floorNo, String flatType,
			Set<DeliveryEntity> deliverySet, Set<VisitorEntity> visitorSet, Set<VehicleEntity> vehicleSet,
			Set<SecurityEntity> alertSet, FlatRentEntity rent) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.flatNo = flatNo;
		this.ownerName = ownerName;
		this.floorNo = floorNo;
		this.flatType = flatType;
		this.deliverySet = deliverySet;
		this.visitorSet = visitorSet;
		this.vehicleSet = vehicleSet;
		this.alertSet = alertSet;
		this.rent = rent;
	}





	public FlatEntity() {
		
		// TODO Auto-generated constructor stub
	}
	
}
