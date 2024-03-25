import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        System.out.println("Scanner Demo Inputs");

        System.out.println("Integars: ");
        int num = keys.nextInt();
        System.out.println("The Number Was: "+ num);
    }
}
