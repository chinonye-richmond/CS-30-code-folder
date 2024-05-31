import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
public class GroceryList {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        List<String> namesList = new ArrayList<String>();
        boolean running = true;


        while (running) {
            
            System.out.println("What do you want to add to your grocery list? ");
            String one = keys.nextLine();

            namesList.add(one);



            System.out.println("Your grocery list currently is: ");

            for(int i = 0; i < namesList.size(); i++){
                System.out.println(namesList.get(i));
            }
                        
            System.out.println("Do you have more items to add? ");
            String more = keys.nextLine();

            if (more.equals("yes")){
                running = true;
            } 
            else {
                running = false;
            }
        }

        System.out.println("");
        System.out.println("Your grocery list is: ");

        for(int i = 0; i < namesList.size(); i++){
            System.out.println(namesList.get(i));
        }


        

        
    }
}
