package com.ftms.vehicle.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.ftms.common.model.AuditModel;

@Entity
@Table(name = "vehicle_type")
public class VehicleType extends AuditModel{
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private int vehicleTypeId;
	
	@Column(name="vehicleTypeName")
	private String vehicleTypeName;
	
	
	private boolean vehicleTypeStatus;

	
	public int getVehicleTypeId() {
		return vehicleTypeId;
	}


	public void setVehicleTypeId(int vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}


	public String getVehicleTypeName() {
		return vehicleTypeName;
	}


	public void setVehicleTypeName(String vehicleTypeName) {
		this.vehicleTypeName = vehicleTypeName;
	}


	public boolean isVehicleTypeStatus() {
		return vehicleTypeStatus;
	}


	public void setVehicleTypeStatus(boolean vehicleTypeStatus) {
		this.vehicleTypeStatus = vehicleTypeStatus;
	}

	
	
	
}
