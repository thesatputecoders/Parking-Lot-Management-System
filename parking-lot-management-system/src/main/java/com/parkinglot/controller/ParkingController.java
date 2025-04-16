package com.parkinglot.controller;

import com.parkinglot.dto.ParkingSlotDTO;
import com.parkinglot.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @PostMapping("/entry")
    public ResponseEntity<String> vehicleEntry(@RequestBody ParkingSlotDTO parkingSlotDTO) {
        return ResponseEntity.ok(parkingService.vehicleEntry(parkingSlotDTO));
    }

    @PostMapping("/exit")
    public ResponseEntity<String> vehicleExit(@RequestParam Long ticketId) {
        return ResponseEntity.ok(parkingService.vehicleExit(ticketId));
    }

    @GetMapping("/availability")
    public ResponseEntity<List<ParkingSlotDTO>> getAvailableSlots() {
        return ResponseEntity.ok(parkingService.getAvailableSlots());
    }

    @GetMapping("/slots/{vehicleType}")
    public ResponseEntity<ParkingSlotDTO> allocateSlot(@PathVariable String vehicleType) {
        return ResponseEntity.ok(parkingService.allocateSlot(vehicleType));
    }

    @GetMapping("/report/daily")
    public ResponseEntity<String> generateDailyReport() {
        return ResponseEntity.ok(parkingService.generateDailyReport());
    }
}