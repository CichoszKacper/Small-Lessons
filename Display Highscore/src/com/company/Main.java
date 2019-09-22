package com.company;

import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args){
        String name = "Richard";
        int playerScore = 1001;
        displayHighscorePosition(name, calculateHighScore(playerScore));
        name = "Bryan";
        playerScore = 501;
        displayHighscorePosition(name, calculateHighScore(playerScore));
        name = "Richard";
        playerScore = 101;
        displayHighscorePosition(name, calculateHighScore(playerScore));
        name = "Richard";
        playerScore = 50;
        displayHighscorePosition(name, calculateHighScore(playerScore));
    }
    public static int calculateHighScore (int playerScore){
        if (playerScore>1000){
            return 1;
        }else if (playerScore>500){
            return 2;
        }else if (playerScore>100) {
            return 3;
        }
        return 4;
    }
    public static void displayHighscorePosition (String name, int score){
        System.out.println("Player "+name+" managed to get position number "+score);
    }

}
