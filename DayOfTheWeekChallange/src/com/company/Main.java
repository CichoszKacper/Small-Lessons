package com.company;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog("Select a number from 0-6: ");
        int numberOfDay = Integer.parseInt(number);
        dayOfTheWeek(numberOfDay);
        }
    private static void dayOfTheWeek(int dayNumber) {
        String output;
        switch (dayNumber) {
            case 0:
                output = "The number you have selected represents Sunday";
                JOptionPane.showMessageDialog(null, output);
                break;
            case 1:
                output = "The number you have selected represents Monday";
                JOptionPane.showMessageDialog(null, output);
                break;
            case 2:
                output = "The number you have selected represents Tuesday";
                JOptionPane.showMessageDialog(null, output);
                break;
            case 3:
                output = "The number you have selected represents Wednesday";
                JOptionPane.showMessageDialog(null, output);
                break;
            case 4:
                output = "The number you have selected represents Thursday";
                JOptionPane.showMessageDialog(null, output);
                break;
            case 5:
                output = "The number you have selected represents Friday";
                JOptionPane.showMessageDialog(null, output);
                break;
            case 6:
                output = "The number you have selected represents Saturday";
                JOptionPane.showMessageDialog(null, output);
                break;
            default:
                output = "The number you selected is invalid";
                JOptionPane.showMessageDialog(null, output);
                break;
        }
    }
}
