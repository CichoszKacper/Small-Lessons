import java.lang.Math;

public class SpeedConventer {
    public static long toMilesPerHour(double kilometersPerHour){
        double milesPerHour = kilometersPerHour*0.621371;
        long newMilesPerHour = Math.round(milesPerHour);
        if (newMilesPerHour>=0){
            System.out.println(newMilesPerHour);
            return newMilesPerHour;
        }else
            return -1;

    }
}
