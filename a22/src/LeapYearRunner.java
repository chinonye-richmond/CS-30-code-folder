import java.util.Scanner;

public class LeapYearRunner {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int yr = keyboard.nextInt();

        LeapYear test =  new LeapYear();
        test.setYear(yr);
        test.leapYear();
        test.print();

    }
}
