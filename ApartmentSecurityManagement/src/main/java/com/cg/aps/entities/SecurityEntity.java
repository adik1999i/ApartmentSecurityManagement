/**
 * 
 */
package com.cg.aps.entities;

import java.time.LocalDate;
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
 * @author Administrator
 *
 */
@Entity
@Table(name="Security")
public class SecurityEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer alertId;
	private String alertMessage;
	private String alertType;
	private LocalDate alertDate;
	
	 @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		@JoinColumn(foreignKey = @ForeignKey(name = "userId"),name = "userId")
		@JsonIgnore
		private GuardTrainingEntity guard;
	    
	    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		@JoinColumn(foreignKey = @ForeignKey(name = "flatNo"),name = "flatNo")
		@JsonIgnore
		private FlatEntity flat;

		public Integer getAlertId() {
			return alertId;
		}

		public void setAlertId(Integer alertId) {
			this.alertId = alertId;
		}

		public String getAlertMessage() {
			return alertMessage;
		}

		public void setAlertMessage(String alertMessage) {
			this.alertMessage = alertMessage;
		}

		public String getAlertType() {
			return alertType;
		}

		public void setAlertType(String alertType) {
			this.alertType = alertType;
		}

		public LocalDate getAlertDate() {
			return alertDate;
		}

		public void setAlertDate(LocalDate alertDate) {
			this.alertDate = alertDate;
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

		public SecurityEntity(long id, String createdBy, String modifiedBy, LocalDateTime createdDateTime,
				LocalDateTime modifiedDateTime, Integer alertId, String alertMessage, String alertType,
				LocalDate alertDate, GuardTrainingEntity guard, FlatEntity flat) {
			super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
			this.alertId = alertId;
			this.alertMessage = alertMessage;
			this.alertType = alertType;
			this.alertDate = alertDate;
			this.guard = guard;
			this.flat = flat;
		}
	    
	    public SecurityEntity() {
			// TODO Auto-generated constructor stub
		}
}
