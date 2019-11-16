package com.company.model;

public class Vehicle {

    String vehicle;

    public String getVehicle() {
        System.out.println("Tipo de vehiculo seleccionado: " + vehicle);
        return vehicle;
    }

    public void setCar(String car) {
        this.vehicle = "coche";
    }

    public void setMoto(String moto) {
        this.vehicle = "moto";
    }

    public void setCycle(String cycle) {
        this.vehicle = "bici";
    }

    public void setTruck(String truck) {
        this.vehicle = "camion";
    }
}
