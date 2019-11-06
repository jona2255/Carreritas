package com.company.model;

public abstract class Vehicle {
    String tipo;

    public void setRueda(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
}
