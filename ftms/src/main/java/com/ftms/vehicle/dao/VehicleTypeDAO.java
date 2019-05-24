package com.ftms.vehicle.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftms.vehicle.model.Vehicle;
import com.ftms.vehicle.model.VehicleType;

@Repository
public interface VehicleTypeDAO extends CrudRepository<VehicleType, Integer>{
	
	@Override
	List<VehicleType> findAll();
	
	
}
