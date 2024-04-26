import java.util.Scanner;
import java.lang.Math.*;

public class MPH {
    private double distance, hours, minutes, speed, time;

    public void MilesPerHour(){
		setVariables(0,0,0);
		speed=0.0;
	}

    public void setVariables(double d, double h, double m){
        distance = d;
        hours = h;
        minutes = m;
    }

    public void calcSpeed(){
        time = hours + (minutes/60.0);
        speed = distance/time;
        System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + Math.ceil(speed) + " MPH" );
    }

}
