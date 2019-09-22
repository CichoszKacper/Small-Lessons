package com.company;

public class printMegaBytesAndKiloBytes {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        double megaBytes = kiloBytes*0.001;
        System.out.println(kiloBytes + " kilobytes is equal to " + megaBytes + " megabytes.");
    }
}
