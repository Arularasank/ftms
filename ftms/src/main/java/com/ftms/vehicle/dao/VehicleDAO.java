package com.ftms.vehicle.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftms.vehicle.model.Vehicle;

@Repository
public interface VehicleDAO extends CrudRepository<Vehicle, Integer>{
	
	@Override
	List<Vehicle> findAll();
	
	
}
