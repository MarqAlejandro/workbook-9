package com.plurasight.demo;

import jakarta.persistence.*;
@Entity
@Table(name = "Vehicles", schema = "GTA")
public class Vehicle {
    @Id
    @Column(name = "VehicleID")
    private Long vehicleId;
    @Column(name = "OwnerID")
    private Long ownerId;
    @Column(name = "Type")
    private String type;
    @Column(name = "Brand")
    private String brand;
    @Column(name = "Speed")
    private int speed;
    @Column(name = "is_stolen")
    private boolean isStolen;
    // Getters and setters must be defined here...


    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStolen() {
        return isStolen;
    }

    public void setStolen(boolean stolen) {
        isStolen = stolen;
    }
}