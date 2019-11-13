package com.company.model;

public class Vehicle {

    Car car;
    Moto motorcycle;
    Cycle cycle;
    Truck truck;
    String coche = "coche", moto = "moto", bici = "bici", camion = "camion";

    public Car getCar() {
        System.out.println("Tipo de vehiculo seleccionado: " + coche);
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Moto getMoto() {
        System.out.println("Tipo de vehiculo seleccionado: " + moto);
        return motorcycle;
    }

    public void setMoto(Moto moto) {
        this.motorcycle = moto;
    }

    public Cycle getCycle() {
        System.out.println("Tipo de vehiculo seleccionado: " + bici);
        return cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }

    public Truck getTruck() {
        System.out.println("Tipo de vehiculo seleccionado: " + camion);
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }
}
