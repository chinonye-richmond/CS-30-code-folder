import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
public class GroceryList {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        
        System.out.println("What do you want to add to your grocery list? ");
        String one = keys.nextLine();

        List<String> namesList = new ArrayList<String>();
        namesList.add(one);

        System.out.println("Grocery List: \n" + namesList);



        System.out.println("Do you have more items to add? ");
        String more = keys.nextLine();
        
        if (more == "yes"){
            System.out.println("What do you want to add to your grocery list? ");
            String two = keys.nextLine();
            namesList.add(two);
            System.out.println("Grocery List: \n" + namesList);
        } 
        else if (more == "no") {
            System.out.println("Grocery List: \n" + namesList); 
        }


        

        
    }
}
