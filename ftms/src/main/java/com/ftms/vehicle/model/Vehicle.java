package com.ftms.vehicle.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.ftms.common.model.AuditModel;

@Entity
@Table(name = "vehicle")
public class Vehicle extends AuditModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private int vehicleId;
	
	@Column(name="vehicleRegNo")
	private String vehicleRegNo;
	
	
	private boolean vehicleStatus;
	
	@Transient
	private int vehTypeId;
			
	@ManyToOne(fetch = FetchType.LAZY,cascade= CascadeType.ALL, optional = false)
	@JoinColumn(name = "vehicleTypeId", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private VehicleType vehicleType;
	
	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleRegNo() {
		return vehicleRegNo;
	}

	public void setVehicleRegNo(String vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}

	public boolean isVehicleStatus() {
		return vehicleStatus;
	}

	public void setVehicleStatus(boolean vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getVehTypeId() {
		return vehTypeId;
	}

	public void setVehTypeId(int vehTypeId) {
		this.vehTypeId = vehTypeId;
	}

		
	
}
