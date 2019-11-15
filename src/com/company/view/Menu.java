package com.company.view;

import com.company.controller.Clasification;
import com.company.controller.Play;

import java.util.Scanner;

public class Menu {

    // 2- Clasification

    Scanner sc = new Scanner(System.in);

    public void chose(){

        System.out.println("1- Configuració de la competició\n2- Resultats/Palmarès/ClassificacióGeneral\n3- Jugar\n4- Finalizar");

        MenuCompetition menuCompetition = new MenuCompetition();
        Clasification clasification = new Clasification();
        Play play = new Play();

        int valor = sc.nextInt();

        do {

            switch (valor){
                case 1:
                    menuCompetition.conf();
                    break;
                case 2:
                    clasification.show();
                    break;
                case 3:
                   play.partida();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no disponible, elige otra vez");
                    break;

            }
            valor = sc.nextInt();

        } while (valor!=4);

    }
}
