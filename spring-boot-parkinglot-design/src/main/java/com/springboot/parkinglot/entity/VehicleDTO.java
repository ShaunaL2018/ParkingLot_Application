package com.springboot.parkinglot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class VehicleDTO {
	
	@Id
	private Long id;
	private String vehicleNumber;	
	private String ownerName;

}
