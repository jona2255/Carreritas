package com.company.view;

import com.company.model.Vehicle;

import java.util.Scanner;

public class MenuVehicle {

    Menu menu = new Menu();
    Vehicle vehicle = new Vehicle();

    Scanner sc = new Scanner(System.in);

    public String selectVehicle() {
        Boolean salir = false;
        
        String vehiculo = "";

        System.out.println("Elige con que vehiculo deseas participar: " +
                "\n1) Bicicleta " +
                "\n2) Coche " +
                "\n3) Camión " +
                "\n4) Moto ");

        int option = sc.nextInt();
        do {
            switch (option) {
                case 1:
                    //bici
                    vehicle.setCycle("bici");
                    vehiculo = vehicle.getVehicle();
                    salir = true;
                    break;
                case 2:
                    //coche
                    vehicle.setCar("coche");
                    vehiculo = vehicle.getVehicle();
                    salir = true;
                    break;
                case 3:
                    //camión
                    vehicle.setTruck("camion");
                    vehiculo = vehicle.getVehicle();
                    salir = true;
                    break;
                case 4:
                    //moto
                    vehicle.setMoto("moto");
                    vehiculo = vehicle.getVehicle();
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no disponible, elige otra:");
                    option = sc.nextInt();
                    break;
            }
        } while (salir == false) ;

        return vehiculo;
    }
}