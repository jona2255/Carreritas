package com.company.controller;

import com.company.model.Competitor;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Play {


    // Aqui jugamos

    // Que pueda pinchar rueda (jejeje)

    // Aqui ponemos los randoms de los tiempos.

    public void partida(Competition competition){

        if (competition != null){
            System.out.println("La carrerita va a comenzar...");

            for (int i = 0; i < competition.circuitos ; i++) {

                correr(competition);
            }

        } else {
            System.out.println("Configura la competición");
        }

    }

    void correr(Competition competition){

        for (int i = 0; i < competition.competitors.size(); i++) {

            double tiempo = (Math.random()*0.1000+2.00);
            competition.competitors.get(i).setTiempo((double)Math.round(tiempo * 10000d) / 10000d);

        }
        ordenarTiempo(competition);

    }

    void ordenarTiempo(Competition  competition){

        Collections.sort(competition.competitors, new Comparator<Competitor>() {
            @Override
            public int compare(Competitor competitor, Competitor t1) {
                if (competitor.getTiempo() > t1.getTiempo()) return 1;
                else if (competitor.getTiempo() < t1.getTiempo()) return-1;
                return 0;
            }
        });
        puntuar(competition);
    }

    void puntuar(Competition competition){

        int j = 5;
        for (int i = 0; i < 5; i++) {
            try {
                int puntos = competition.competitors.get(i).getPuntos();
                competition.competitors.get(i).setPuntos(puntos + j);

            }catch (Exception e){
                break;
            }
            j--;
        }
        Clasification.mostrarCarrera(competition,this);
    }

     void ordenarPuntos(Competition competition) {
        Collections.sort(competition.competitors, new Comparator<Competitor>() {
            @Override
            public int compare(Competitor competitor, Competitor t1) {
                if (competitor.getPuntos() < t1.getPuntos()) return 1;
                else if (competitor.getPuntos() > t1.getPuntos()) return-1;
                return 0;
            }
        });
    }
}
