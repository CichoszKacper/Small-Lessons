package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        String output = "";
        for (int i = 0; i<myIntegers.length; i++){
            output += "For element " + (i+1) + " typed value was: " + myIntegers[i] + "\n";
        }
        output += "\nAverage of all typed values is " + getAverage(myIntegers);
        JOptionPane.showMessageDialog(null,output);
    }//end of void main


    public static int[] getIntegers(int number){
        int [] values = new int [number];
        String output = "Please enter " + number + " numbers";
        JOptionPane.showMessageDialog(null, output);
        for(int i=0; i<values.length; i++){
            values[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter " + (i+1) + " value."));
        }//end of for loop
        return values;
    }//end of getIntegers

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum / (double) array.length;
    }//end of getAverage
}//end of main
