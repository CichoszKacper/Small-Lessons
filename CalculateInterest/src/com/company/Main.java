package com.company;

public class Main {

    public static void main(String[] args) {
        double i;
        for (i=2; i<6;i++){
            System.out.println("10000 at " + i + "% rate is " + calculateInterest(10000,i));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
