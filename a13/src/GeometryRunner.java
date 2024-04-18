//geometry calculator
// Chinonye Richmond
// 4-18-2024

import static java.lang.System.*;

import java.util.Scanner;

public class GeometryRunner {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String choice;
        // enter either rectangle, cube or circle
        System.out.println("Do you want to find the perimeter of a rectangle, the surface area of a cube or the area of a circle? ");
        choice = keyboard.next();

        Geometry test = new Geometry();

        if (choice.equals("rectangle") ){
            System.out.println("Enter a width: ");
            double w = keyboard.nextDouble();

            System.out.println("Enter a length: ");
            double l = keyboard.nextDouble();

            test.setPerimeter(w, l);
            test.PerimeterRectangle();
            test.print1();
        }
        else if (choice.equals("cube")){
            System.out.println("Enter a length: ");
            double s = keyboard.nextDouble();

            test.setSide(s);
            test.SurfaceAreaCube();
            test.print2();
        }
        else if (choice.equals("circle")){
            System.out.println("Enter a radius: ");
            double r = keyboard.nextDouble();

            test.setRadius(r);
            test.AreaCircle();
            test.print3();
        }



    }
}
