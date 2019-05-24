package com.ftms.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftms.vehicle.model.Vehicle;
import com.ftms.vehicle.model.VehicleType;
import com.ftms.vehicle.service.VehicleService;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/vehicles")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	// Vehicle Starts Here
	@PostMapping("/addVehicle")
	public Vehicle addVehicle(@RequestBody Vehicle vehicle){
		return vehicleService.addVehicle(vehicle);
		
	}
	
	@GetMapping("/getVehicle")
	public List<Vehicle> getVehicles(){
		return vehicleService.getVehicles();
	}
	
	
	@GetMapping(value = "/getVehicle/{vehicleId}")
	public Vehicle getVehicle(@PathVariable("vehicleId") int vehicleId){
		return vehicleService.getVehicle(vehicleId);
	}
		
	@PutMapping(value = "/updateVehicle/{vehicleId}")
	public Vehicle updateVehicle(@PathVariable("vehicleId")int vehicleId, @RequestBody Vehicle vehicle){
		return vehicleService.updateVehicle(vehicleId,vehicle);
	}
	
	@DeleteMapping(value = "/deleteVehicle/{vehicleId}")
	public void deleteVehicle(@PathVariable("vehicleId") int vehicleId){
		vehicleService.deleteVehicle(vehicleId);
		
	}
	
	// Vehicle Type Starts Here
	@PostMapping("/addVehicleType")
	public VehicleType addVehicleType(@RequestBody VehicleType vehicleType){
		return vehicleService.addVehicleType(vehicleType);
		
	}
	
	@GetMapping("/getVehicleType")
	public List<VehicleType> getVehicleTypes(){
		return vehicleService.getVehicleTypes();
	}
	
	
	@GetMapping(value = "/getVehicleType/{vehicleTypeId}")
	public VehicleType getVehicleType(@PathVariable("vehicleTypeId") int vehicleTypeId){
		return vehicleService.getVehicleType(vehicleTypeId);
	}
		
	@PutMapping(value = "/updateVehicleType/{vehicleTypeId}")
	public VehicleType updateVehicleType(@PathVariable("vehicleTypeId")int vehicleTypeId, @RequestBody VehicleType vehicleType){
		return vehicleService.updateVehicleType(vehicleTypeId, vehicleType);
	}
	
	@DeleteMapping(value = "/deleteVehicleType/{vehicleTypeId}")
	public void deleteVehicleType(@PathVariable("vehicleTypeId") int vehicleTypeId){
		vehicleService.deleteVehicleType(vehicleTypeId);
		
	}
	
}
