package com.company.controller;

import com.company.model.Competitor;

import java.util.ArrayList;

public class Competition {


    // Definir la competition

    int participantes;
    int circuitos;

    ArrayList<Competitor> competitors = new ArrayList<>();

    public Competition(int participantes, int circuitos, Competitor competitor) {
        this.participantes = participantes;
        this.circuitos = circuitos;
        this.competitors.add(competitor);
    }


    public void añadirParticipantes(String vehicle){


        for (int i = 1; i < participantes; i++) {
            String nombre = "Participante ";
            nombre += Integer.toString(i);

            Competitor competitor = new Competitor(nombre);
            competitor.setVehiculo(vehicle);
            competitors.add(competitor);
        }

    }

}
