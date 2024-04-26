import java.util.Scanner;

public class MPHrunner {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the distance: ");
        double d = keyboard.nextDouble();
        System.out.println("Enter the hours: ");
        double h = keyboard.nextDouble();
        System.out.println("Enter the minutes: ");
        double m = keyboard.nextDouble(); 

        MPH test = new MPH();
        test.setVariables(d,h,m);
        test.calcSpeed();

    }
}
