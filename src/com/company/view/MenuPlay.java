package com.company.view;


import com.company.model.Car;
import com.company.model.Vehicle;

import java.util.Scanner;

public class MenuPlay {

    Car car = new Car();

    Scanner sc = new Scanner(System.in);

    public void selectVehicle() {
        System.out.println("Elige con que vehiculo deseas participar: " +
                "\n1) Bicicleta " +
                "\n2) Coche " +
                "\n3) Camión " +
                "\n4) Moto " +
                "\n5) Volver al menu principal." +
                "\n0) Salir de todo el programa.");

        int option = sc.nextInt();

        do {
            switch (option) {
                case 1:
                    System.out.println("Mira como pedaleo uuuuuuu");
                    break;
                case 2:
                    System.out.println("Mira como acelero uuuuuuu");
                    break;
                case 3:
                    System.out.println("Mira como descanso uuuuuu");
                    break;
                case 4:
                    System.out.println("Mira como caigo uuuuuuu");
                    break;
                default:
                    System.out.println("Opción no disponible, elige otra vez");
                    break;
            }
            option = sc.nextInt();
        }while (option != 0);
    }
}