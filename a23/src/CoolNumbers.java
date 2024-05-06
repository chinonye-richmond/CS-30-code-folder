public class CoolNumbers {

    public static boolean isCoolNum(int number){
        boolean cool = false;
        if (number % 3 == 1 && number % 4 == 1 && number % 5 == 1 && number % 6 == 1){
            cool = true;
        }
        return cool;
    }

    public static void countCoolNum(int s){
        int count = 0;
        for (int x = 6; x < s; x++) {
            if (isCoolNum(x) == true) {
                count ++;
            }

        }
        
        System.out.println(count + " cool numbers between 6 and " + s);
    }

     
}
