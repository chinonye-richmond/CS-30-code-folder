
import static java.lang.System.*;

import java.util.Scanner;

public class Input

{

  public static void main (String[] args)

  {

      Scanner keyboard = new Scanner(System.in);

       int intOne, intTwo; 

       System.out.print("Enter an integer: ");

       intOne = keyboard.nextInt();

 


       System.out.print("Enter an integer: ");

       intTwo = keyboard.nextInt();

 

       System.out.println("integer one = " + intOne);

       System.out.println("integer two = " + intTwo);


      double doubleOne, doubleTwo; 

      System.out.print("Enter a double: ");

      doubleOne = keyboard.nextInt();

 

      System.out.print("Enter a double: ");

      doubleTwo = keyboard.nextInt();

 

      System.out.println("double one = " + doubleOne);

      System.out.println("double two = " + doubleTwo);


      System.out.println("integer one + integer two = " + (intOne+intTwo));

      System.out.println("double one + double two = " + (doubleOne+doubleTwo));



   }

}

    

