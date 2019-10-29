package com.company.view;

import com.company.controller.Clasification;

import java.util.Scanner;

public class Menu {


    // 1- Configuració de la competició -> MenuCompetition
    // 2- Resultats/Palmarès/ClassificacióGeneral -> Clasification
    // 3- Jugar -> Play
    // 4- Acabar


    public void show(){

        System.out.println("1- Configuració de la competició\n2- Resultats/Palmarès/ClassificacióGeneral\n3- Jugar\n4- Finalizar");


    }

    public void chose(){

        MenuCompetition menuCompetition = new MenuCompetition();
        Clasification clasification = new Clasification();
        MenuPlay menuPlay = new MenuPlay();

        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();

        do {

            switch (valor){
                case 1:
                    menuCompetition.conf();
                    break;
                case 2:
                    clasification.show();
                    break;
                case 3:
                    menuPlay.show();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no disponible, elige otra vez");
                    break;

            }
            valor = in.nextInt();

        } while (valor!=4);

    }
}
