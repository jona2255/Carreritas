package com.company.view;

import com.company.controller.Clasification;
import com.company.controller.Competition;
import com.company.controller.Play;

import java.util.Scanner;

public class Menu {

    // 2- Clasification

    Scanner sc = new Scanner(System.in);

    public void chose(){
        System.out.println("1- Configuración de la competición\n2- Resultados/Palmarés/Classificación General\n3- Jugar\n4- Finalizar");


        MenuCompetition menuCompetition = new MenuCompetition();
        Clasification clasification = new Clasification();
        Competition competition = null;
        Play play = new Play();

        int valor = sc.nextInt();

        do {

            switch (valor){
                case 1:
                    competition = menuCompetition.conf(competition);
                    break;
                case 2:
                    clasification.show(competition);
                    break;
                case 3:
                   play.partida(competition);
                    break;
                case 4:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no disponible, elige otra vez");
                    break;

            }

            System.out.println("1- Configuración de la competición\n2- Resultados/Palmarés/Classificación General\n3- Jugar\n4- Finalizar");
            valor = sc.nextInt();

        } while (valor!=4);

    }
}
