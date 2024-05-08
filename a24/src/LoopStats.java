public class LoopStats {
    private int start, stop;

    public boolean even_odd(int num){
        boolean even = false;
        if (num %2 == 0){
            even = true;
        }
        return even;

    }
;
    public void stats(int b, int e){
        start = b;
        stop = e;
        int evencount = 0;
        int oddcount = 0;
        int total = 0;
        for(start = b; start <= stop; start++){
            total = total + start;            
            if (even_odd(start) == true){
                evencount ++;
            }
            else{
                oddcount ++;
            }
        }

        System.out.print(b + " to ");
        System.out.println( e);
        System.out.println("total " + total);
        System.out.println("even count " + evencount);
        System.out.println("odd count " + oddcount);
    }

}
