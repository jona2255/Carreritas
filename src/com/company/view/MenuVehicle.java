package com.company.view;

import com.company.controller.Play;
import com.company.model.Car;

import java.util.Scanner;

public class MenuVehicle {

    Car car = new Car();
    Menu menu = new Menu();
    Play play = new Play();

    Scanner sc = new Scanner(System.in);


    Boolean salir = false;

    public void selectVehicle() {
        System.out.println("Elige con que vehiculo deseas participar: " +
                "\n1) Bicicleta " +
                "\n2) Coche " +
                "\n3) Camión " +
                "\n4) Moto ");

        int option = sc.nextInt();
        do {
            switch (option) {
                case 1:
                    System.out.println("Vehiculo: Bicicleta");
                    //bici
                    salir = true;

                    break;
                case 2:
                    System.out.println("Vehiculo: Coche");
                    //coche
                    salir = true;
                    break;
                case 3:
                    System.out.println("Vehiculo: Camión");
                    //camión
                    salir = true;
                    break;
                case 4:
                    System.out.println("Vehiculo: Moto");
                    //moto
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no disponible, elige otra:");
                    option = sc.nextInt();
                    break;
            }
        } while (salir == false) ;

        menu.show();
    }
}