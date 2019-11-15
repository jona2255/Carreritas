package com.company.model;

public class Player {

    String playerName, vehiclePlayer;
    int playerPoints;
    float playerTime;

// Jugador
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getVehiclePlayer() {
        return vehiclePlayer;
    }

    public void setVehiclePlayer(String vehiclePlayer) {
        this.vehiclePlayer = vehiclePlayer;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    public float getPlayerTime() {
        return playerTime;
    }

    public void setPlayerTime(float playerTime) {
        this.playerTime = playerTime;
    }
}
