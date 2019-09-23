package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(SecondsToMinutes(124, 20));
        System.out.println(SecondsToMinutes(124244));
    }
    public static String SecondsToMinutes(int minutes, int seconds){
        if (!(minutes >= 0) || !(seconds>=0 && seconds<=59)){
            return "Invalid number";
        }
        int hours = minutes/60;
        minutes = minutes%60;
        String result = (hours + " h " + minutes + " min " + seconds + " sec");
        return result;
    }
    public static String SecondsToMinutes(int seconds){
        if (seconds < 0) {
            return "Invalid number";
        }
        int minutes = seconds/60;
        seconds = seconds%60;

        return SecondsToMinutes(minutes,seconds);
    }
}
