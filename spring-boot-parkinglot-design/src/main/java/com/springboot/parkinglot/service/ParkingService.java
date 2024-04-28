package com.springboot.parkinglot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.parkinglot.entity.VehicleDTO;

@Service
public interface ParkingService {

	//retrieves all cars in database
	List<VehicleDTO> getAllVehicles();
	//adding car to database
	String park(VehicleDTO vehicleDTO);
	//deleting car from database
	String unpark(Long id);
	//testMethod
	String parkExample();
	
}
