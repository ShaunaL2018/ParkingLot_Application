package com.springboot.parkinglot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.parkinglot.entity.VehicleDTO;
import com.springboot.parkinglot.repository.VehicleRepository;
import com.springboot.parkinglot.service.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService {
	
	@Autowired
	//no need to create new Instance autowire takes care of this
	private VehicleRepository vehicleRepository;
	
//	public ParkingServiceImpl (VehicleRepository repository) {
//		this.vehicleRepository = repository;
//	}
	
	@Override
	public List<VehicleDTO> getAllVehicles() {		
		return vehicleRepository.findAll();
	}

	@Override
	public String park(VehicleDTO vehicleDTO) {
		if (vehicleDTO.getId() > 0 && vehicleDTO.getId() <=25) {
			vehicleRepository.save(vehicleDTO);
		} else {
			throw new RuntimeException("provide Vehicle ID 1 to 25");
		}
			
		return "Parked";
	}

	@Override
	public String unpark(Long id) {
		if (id > 0 && id <= 25) {
		vehicleRepository.deleteById(id);
		} else {
			throw new RuntimeException("provide Vehicle ID 1 to 25");
		}
		return "Vehicle Unparked";
	}

	@Override
	public String parkExample() {
		VehicleDTO vehicleDTO = new VehicleDTO();
		vehicleDTO.setId((long) 5);
		vehicleDTO.setOwnerName("Jane Peach");
		vehicleDTO.setVehicleNumber("OH0001233");
		if (vehicleDTO.getId() > 0 && vehicleDTO.getId() <=25) {
			vehicleRepository.save(vehicleDTO);
		} else {
			throw new RuntimeException("provide Vehicle ID 1 to 25");
		}
			
		return "Parked";
		
	}

}
