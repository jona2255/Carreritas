package com.company.model;

public class Competitor{

    String nombre;
    String vehiculo;
    int puntos = 0;
    double tiempo;


    public Competitor(String nombre, String vehiculo) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    public Competitor(String s) {
        this.nombre = s;
    }


    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

}
