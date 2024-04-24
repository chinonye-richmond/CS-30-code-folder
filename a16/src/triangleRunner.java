// Area of Triangle
// Chinonye Richmond
// 4-24-2024
// This program calculates the area and perimeter of a triangle


import java.util.Scanner;

public class triangleRunner {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        triangle test = new triangle();
        int A, B, C;
        System.out.println("Enter the length of the first side: ");
        A = keyboard.nextInt();
        System.out.println("Enter the length of the second side: ");
        B = keyboard.nextInt();
        System.out.println("Enter the length of the third side: ");
        C = keyboard.nextInt();

   
        test.setSides(A,B,C);
        test.getPerimeter();
        test.getArea();




    }
}
