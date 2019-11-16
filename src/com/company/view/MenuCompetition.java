package com.company.view;

import com.company.controller.Competition;
import com.company.model.Competitor;

import java.util.Scanner;

public class MenuCompetition {

    // con participantes, circuitos y nombre de jugador

    Scanner in = new Scanner(System.in);

    public Competition conf(Competition competition) {


        System.out.println("Elige el nombre del participante");

        String nombre = in.nextLine();

        System.out.println("Elige la cantidad de participantes");

        int numCompetitors = in.nextInt();

        MenuVehicle menuVehicle = new MenuVehicle();

        String vehicle = menuVehicle.selectVehicle();

        System.out.println("Elige la cantidad de circuitos del campeonato");

        int numRacings = in.nextInt();

        Competitor player = new Competitor(nombre,vehicle);

        competition = new Competition(numCompetitors,numRacings,player);
        competition.añadirParticipantes(vehicle);

        return competition;
    }


}
