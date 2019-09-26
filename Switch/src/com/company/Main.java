package com.company;

public class Main {

    public static void main(String[] args) {
        char switchValue = 'D';

        switch (switchValue){
            case 'A':
                System.out.println("You character is " + switchValue);
                break;
            case 'B':
                System.out.println("You character is " + switchValue);
                break;
            case 'C':
                System.out.println("You character is " + switchValue);
                break;
            case 'D':
                System.out.println("You character is " + switchValue);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + switchValue);
        }
    }
}
