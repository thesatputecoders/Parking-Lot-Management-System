package com.parkinglot.dto;

import java.time.LocalDateTime;

public class VehicleDTO {
    private Long vehicleId;
    private String vehicleType; // e.g., bike, car, truck
    private LocalDateTime entryTime;

    public VehicleDTO() {
    }

    public VehicleDTO(Long vehicleId, String vehicleType, LocalDateTime entryTime) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
}