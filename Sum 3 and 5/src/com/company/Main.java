package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i=1;i<1000;i++)
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number which is divadable by 3 and 5 is: " + i);
                sum += i;
                count++;
                if (count > 4) {
                    System.out.println("Sum of all those 5 numbers is: " + sum);
                    break;
                }
            }
    }
}
