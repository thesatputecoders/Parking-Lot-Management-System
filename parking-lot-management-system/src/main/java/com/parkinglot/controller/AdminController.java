package com.parkinglot.controller;

import com.parkinglot.dto.ParkingSlotDTO;
import com.parkinglot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/slots")
    public ResponseEntity<ParkingSlotDTO> addParkingSlot(@RequestBody ParkingSlotDTO parkingSlotDTO) {
        ParkingSlotDTO createdSlot = adminService.addParkingSlot(parkingSlotDTO);
        return ResponseEntity.ok(createdSlot);
    }

    @PutMapping("/slots/{id}")
    public ResponseEntity<ParkingSlotDTO> updateParkingSlot(@PathVariable Long id, @RequestBody ParkingSlotDTO parkingSlotDTO) {
        ParkingSlotDTO updatedSlot = adminService.updateParkingSlot(id, parkingSlotDTO);
        return ResponseEntity.ok(updatedSlot);
    }

    @GetMapping("/slots")
    public ResponseEntity<List<ParkingSlotDTO>> getAllParkingSlots() {
        List<ParkingSlotDTO> slots = adminService.getAllParkingSlots();
        return ResponseEntity.ok(slots);
    }
}