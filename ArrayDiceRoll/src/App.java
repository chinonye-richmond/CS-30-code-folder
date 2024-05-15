import java.util.Scanner;
import java.util.Random;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random rand = new Random();
        int[] outcomes = new int [13];
        int numRolls;
        int result;
        
        System.out.print("How many rolls (max 13)? ");
        numRolls = keys.nextInt();

        // Check if out of bounds, set a max and min assumption
        if (numRolls > 13) {
            numRolls = 13;
        }
        else if (numRolls < 0) {
            numRolls = 1;
        }

        // Roll dice and add to outcomes array - Assume two dice
        for (int roll = 0; roll < numRolls; roll++) {
            // rolling "two dice"
            int dice1 = (rand.nextInt(6) + 1);
            int dice2 =  (rand.nextInt(6) + 1);
            result = dice1 + dice2;
            outcomes[roll] = result;
            System.out.println("Roll number " + roll + " is " + outcomes[roll] + " from D1 = " + dice1 + " D2 = " + dice2);
        }


    }
}
