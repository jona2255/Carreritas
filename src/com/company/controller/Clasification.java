package com.company.controller;

public class Clasification {


    public void show(Competition competition) {

        if (competition != null){
            System.out.println();
            System.out.println("****************************");
            System.out.println();
            System.out.println("Grand Prix de: " + competition.competitors.get(0).getVehiculo());
            for (int i = 0; i < competition.competitors.size(); i++) {

                System.out.println(competition.competitors.get(i).getNombre());
            }

            System.out.println();
            System.out.println("****************************");
            System.out.println();

        } else {
            System.out.println("No se ha jugado todavía");
        }
    }


    public static void mostrarCarrera(Competition competition, Play play) {

        System.out.println("****************************");
        System.out.println();
        System.out.println("Tiempos");
        System.out.println();
        for (int i = 0; i < competition.competitors.size(); i++) {

            System.out.println(competition.competitors.get(i).getNombre()+ " : " + competition.competitors.get(i).getTiempo());

        }

        play.ordenarPuntos(competition);

        System.out.println();
        System.out.println("Clasificacion");
        System.out.println();
        for (int i = 0; i < competition.competitors.size(); i++) {

            System.out.println(competition.competitors.get(i).getNombre()+ " : " +competition.competitors.get(i).getPuntos());
        }

        System.out.println("****************************");
    }


}
