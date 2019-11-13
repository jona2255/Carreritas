package com.company.view;

import com.company.controller.Play;
import com.company.model.Car;
import com.company.model.Vehicle;

import java.util.Scanner;

public class MenuVehicle {

    Menu menu = new Menu();
    Vehicle vehicle = new Vehicle();

    Scanner sc = new Scanner(System.in);




    public void selectVehicle() {
        Boolean salir = false;

        System.out.println("Elige con que vehiculo deseas participar: " +
                "\n1) Bicicleta " +
                "\n2) Coche " +
                "\n3) Camión " +
                "\n4) Moto ");

        int option = sc.nextInt();
        do {
            switch (option) {
                case 1:
                    vehicle.setCycle("bici");
                    vehicle.getVehicle();
                    //bici
                    salir = true;
                    break;
                case 2:
                    vehicle.setCar("coche");
                    vehicle.getVehicle();
                    //coche
                    salir = true;
                    break;
                case 3:
                    vehicle.setTruck("camion");
                    vehicle.getVehicle();
                    //camión
                    salir = true;
                    break;
                case 4:
                    vehicle.setMoto("moto");
                    vehicle.getVehicle();
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