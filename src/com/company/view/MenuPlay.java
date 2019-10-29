package com.company.view;


import com.company.model.Car;

import java.util.Scanner;

public class MenuPlay {

    Car car = new Car();

    public void show() {
        System.out.println("Elige con que vehiculo deseas participar: " +
                "\n1) Bicicleta " +
                "\n2) Coche " +
                "\n3) Camión " +
                "\n4) Moto ");


        System.out.println(car.getRueda());

    }
}
