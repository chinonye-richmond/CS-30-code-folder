public class LeapYear {
    private int year, leap;

    public void setYear(int yr){
        year = yr;
    }

    public int leapYear(){
        leap = year%4;
        return leap;
    }

    public void print(){
        if (leap == 0){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
    
}
