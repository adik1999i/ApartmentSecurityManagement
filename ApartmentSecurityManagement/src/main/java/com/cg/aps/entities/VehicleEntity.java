package com.cg.aps.entities;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Vehicle")
public class VehicleEntity extends BaseEntity {
	@Id
	private String vehicleNo;
	private String vehicleType;
	private String parkingNo;
	private String arrivalTime;
	private String departureTime;
	private Date date;
	
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey(name = "flatNo"),name = "flatNo")
	@JsonIgnore
	private FlatEntity flat;


	public String getVehicleNo() {
		return vehicleNo;
	}


	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getParkingNo() {
		return parkingNo;
	}


	public void setParkingNo(String parkingNo) {
		this.parkingNo = parkingNo;
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


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public FlatEntity getFlat() {
		return flat;
	}


	public void setFlat(FlatEntity flat) {
		this.flat = flat;
	}


	public VehicleEntity(long id, String createdBy, String modifiedBy, LocalDateTime createdDateTime,
			LocalDateTime modifiedDateTime, String vehicleNo, String vehicleType, String parkingNo, String arrivalTime,
			String departureTime, Date date, FlatEntity flat) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
		this.parkingNo = parkingNo;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.date = date;
		this.flat = flat;
	}
	
	
	
	/**
	 * @author Anshul Joshi
	 */
	


}
