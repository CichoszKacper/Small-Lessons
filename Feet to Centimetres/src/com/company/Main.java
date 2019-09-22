package com.company;

public class Main {

    public static void main(String[] args) {
    calcFeetAndInchesToCentimetres(3,6);
    calcFeetAndInchesToCentimetres(170);
    }
    public static double calcFeetAndInchesToCentimetres(double feet, double inches){
        if ((feet<0) || (inches<=0 || inches>=12)){
            return -1;
        }else {
            double centimetres = ((feet*12) + inches)*2.54;
            System.out.println(feet + " feet and " + inches + " inches is equal to " + centimetres + " centimetres");
            return centimetres;
        }
    }
    public static double calcFeetAndInchesToCentimetres(double inches){
        if (inches<=0){
            return -1;
        }else {
            double feet = (int) inches/12;
            double remainingInches = (int) inches%12;
            return calcFeetAndInchesToCentimetres(feet, remainingInches);
        }
    }
}
