package org.game;

import org.utils.Print;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private final Scanner scanner = new Scanner(System.in);
    private final String name;
    private int numPlayers = 1;

    public ArrayList<Player> getPlayers() {
        return players;
    }

    private final ArrayList<Player> players = new ArrayList<Player>();
    private double score = 0;

    public Game(int numPlayers, String name){
        this.numPlayers = numPlayers;
        this.name = name;
        addPlayers();
    }

    public String getName() {
        return name;
    }

    private void addPlayers(){
        for(int i=0; i<numPlayers;i++){
            players.add(addPlayer());
        }
    }

    private Player addPlayer(){
        Print.printConsole("Player name?");
        return new Player(scanner.nextLine());
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
