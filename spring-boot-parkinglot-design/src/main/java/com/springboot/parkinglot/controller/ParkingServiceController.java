package com.springboot.parkinglot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.parkinglot.entity.VehicleDTO;
import com.springboot.parkinglot.service.ParkingService;

@RestController
@RequestMapping("/parkingLot")
public class ParkingServiceController {
	
	@Autowired
	private ParkingService parkingService;
	
	@GetMapping("/parkingInfo")
	public List<VehicleDTO> getAllVehicles(){
		return parkingService.getAllVehicles();
	}
	
	@GetMapping("/test")  //this works
	public String testApp(){
		return "Hey Just Testing the App";
	}
	
	@PostMapping("/parkVehicle")
	public String park(@RequestBody VehicleDTO vehicleTDO){
		return parkingService.park(vehicleTDO);
	}
	
	@GetMapping("/parkExample") //this works - need to reconstruct as a ost 
	public String park(){
		
		String result = null;
		
		try {
			result = parkingService.parkExample();
		} catch (Exception e) {
			//return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.BAD_REQUEST);
		}
		
		//return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.OK);
		return result;
		
	}
	
	

}
