public class Average {
    private double one, two, average;
    public void setNums(double n1 , double n2){
        one = n1;
        two = n2;
    }
    public void average(){
        average = (one+two)/2;
    }
    public void print(){
        System.out.print(average);
    }
}
