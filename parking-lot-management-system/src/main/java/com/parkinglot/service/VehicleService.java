package com.parkinglot.service;

import com.parkinglot.dto.VehicleDTO;
import com.parkinglot.entity.Vehicle;
import com.parkinglot.exception.ResourceNotFoundException;
import com.parkinglot.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDTO vehicleDTO) {
        Vehicle vehicle = new Vehicle();
        vehicle.setType(vehicleDTO.getType());
        vehicle.setEntryTime(vehicleDTO.getEntryTime());
        return vehicleRepository.save(vehicle);
    }

    public Vehicle exitVehicle(Long vehicleId) {
        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found with id " + vehicleId));
        vehicleRepository.delete(vehicle);
        return vehicle;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(Long vehicleId) {
        return vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found with id " + vehicleId));
    }
}