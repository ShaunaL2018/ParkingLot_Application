package com.springboot.parkinglot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.parkinglot.entity.VehicleDTO;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleDTO, Long> {

}
