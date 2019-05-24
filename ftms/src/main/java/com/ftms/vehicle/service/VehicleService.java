package com.ftms.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ftms.vehicle.dao.VehicleDAO;
import com.ftms.vehicle.dao.VehicleTypeDAO;
import com.ftms.vehicle.model.Vehicle;
import com.ftms.vehicle.model.VehicleType;

@Component
public class VehicleService {
	
	@Autowired
	private VehicleDAO vehicleDAO;
	
	@Autowired
	private VehicleTypeDAO vehicleTypeDAO;
	
	// Vehicle Start Here
	public Vehicle addVehicle(Vehicle vehicle){
		vehicle.setVehicleType(getVehicleType(vehicle.getVehTypeId()));
		return vehicleDAO.save(vehicle);
	}
	
	
	public List<Vehicle> getVehicles(){
		return vehicleDAO.findAll();
	}
	
	public Vehicle getVehicle(int vehicleId){
		return vehicleDAO.findById(vehicleId).get();
	}
	
	public Vehicle updateVehicle(int vehicleId, Vehicle vehicle){
		vehicle.setVehicleId(vehicleId);
		return vehicleDAO.save(vehicle);
	}
	
	public void deleteVehicle(int vehicleId){
		vehicleDAO.deleteById(vehicleId);
	}
	
	
	// Vehicle Type Starts Here
	public VehicleType addVehicleType(VehicleType vehicleType){
		return vehicleTypeDAO.save(vehicleType);
	}
	
	
	public List<VehicleType> getVehicleTypes(){
		return vehicleTypeDAO.findAll();
	}
	
	public VehicleType getVehicleType(int vehicleTypeId){
		return vehicleTypeDAO.findById(vehicleTypeId).get();
	}
	
	public VehicleType updateVehicleType(int vehicleTypeId, VehicleType vehicleType){
		vehicleType.setVehicleTypeId(vehicleTypeId);
		return vehicleTypeDAO.save(vehicleType);
	}
	
	public void deleteVehicleType(int vehicleTypeId){
		vehicleTypeDAO.deleteById(vehicleTypeId);
	}
	
}
