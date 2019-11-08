package com.company.view;


import com.company.controller.Play;
import com.company.model.Car;

import java.util.Scanner;

public class MenuPlay {

    Car car = new Car();
    Menu menu = new Menu();
    Play play = new Play();

    Scanner sc = new Scanner(System.in);

    public void selectVehicle() {
        System.out.println("Elige con que vehiculo deseas participar: " +
                "\n1) Bicicleta " +
                "\n2) Coche " +
                "\n3) Camión " +
                "\n4) Moto " +
                "\n0) Volver al menu principal.");

        int option = sc.nextInt();
        do {
            switch (option) {
                case 1:
                    System.out.println("Vehiculo: Bicicleta");
                    //bici
                    play.partida();
                    break;
                case 2:
                    System.out.println("Vehiculo: Coche");
                    //coche
                    play.partida();
                    break;
                case 3:
                    System.out.println("Vehiculo: Camión");
                    //camión
                    play.partida();
                    break;
                case 4:
                    System.out.println("Vehiculo: Moto");
                    //moto
                    play.partida();
                    break;
                default:
                    System.out.println("Opción no disponible, elige otra:");
                    break;
            }
            option = sc.nextInt();
        } while (option != 0) ;

        menu.show();
    }
}