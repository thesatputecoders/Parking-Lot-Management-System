package com.parkinglot.controller;

import com.parkinglot.dto.VehicleDTO;
import com.parkinglot.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/entry")
    public ResponseEntity<VehicleDTO> vehicleEntry(@RequestBody VehicleDTO vehicleDTO) {
        VehicleDTO createdVehicle = vehicleService.handleVehicleEntry(vehicleDTO);
        return ResponseEntity.ok(createdVehicle);
    }

    @PostMapping("/exit/{vehicleId}")
    public ResponseEntity<String> vehicleExit(@PathVariable Long vehicleId) {
        String response = vehicleService.handleVehicleExit(vehicleId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/available-slots")
    public ResponseEntity<List<VehicleDTO>> getAvailableSlots() {
        List<VehicleDTO> availableSlots = vehicleService.getAvailableSlots();
        return ResponseEntity.ok(availableSlots);
    }

    @GetMapping("/allocate/{vehicleType}")
    public ResponseEntity<VehicleDTO> allocateSlot(@PathVariable String vehicleType) {
        VehicleDTO allocatedSlot = vehicleService.allocateSlot(vehicleType);
        return ResponseEntity.ok(allocatedSlot);
    }
}