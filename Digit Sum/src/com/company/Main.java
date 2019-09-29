package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter number: ");
        int intInput = Integer.parseInt(input);
        String output = "Number you have entered after adding all digits to each to others equals: " +sumDigits(intInput);
        JOptionPane.showMessageDialog(null,output);
    }
    public static int sumDigits(int number) {
        if(number<10){
            return -1;
        }
        int sum = 0;
        while (number>0){
            int lastDigit = number%10;
            sum += lastDigit;
            number/=10;
        }
        return sum;
    }
}
