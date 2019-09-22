package com.company;

public class Main {

    public static void main(String[] args) {
    checkNumber(1);
    checkNumber(-2);
    checkNumber(5);
    }
    public static void checkNumber(int number){
        if (number>0){
            System.out.println("Your number is positive");
        }else if (number<0){
            System.out.println("Your number is negative");
        }else{
            System.out.println("Number is neutral");
        }

    }
}
