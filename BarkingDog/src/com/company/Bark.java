package com.company;

public class Bark {
    public static boolean bark (boolean barking, int hourOfDay){
        boolean result = false;
        if (hourOfDay<0 || hourOfDay>23) {
            return false;
        }else if (hourOfDay>=8 && hourOfDay<=22){
            return false;
        }else if(hourOfDay>0 && hourOfDay<23){
            if (barking){
                result = true;
            }
            else {
                return false;
            }
        }
        return result;
    }
}
