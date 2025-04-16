package com.parkinglot.dto;

public class ParkingSlotDTO {
    private Long slotNumber;
    private boolean isAvailable;
    private String vehicleType;

    public ParkingSlotDTO() {
    }

    public ParkingSlotDTO(Long slotNumber, boolean isAvailable, String vehicleType) {
        this.slotNumber = slotNumber;
        this.isAvailable = isAvailable;
        this.vehicleType = vehicleType;
    }

    public Long getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(Long slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}