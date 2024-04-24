import java.util.Scanner; 
import java.lang.Math.*;

public class triangle {
    private int a, b, c;
    private double perimeter, s, area;

    public triangle(){
        setSides(0,0,0);
        perimeter = 0;
	    area = 0;
	}
  

    public void setSides(int sidea, int sideb, int sidec){
        a = sidea;
        b = sideb;
        c = sidec;
    }
    public void getPerimeter(){
        perimeter = a + b + c; 
        System.out.println("The perimeter of the triangle is " + perimeter);
    }
    public void getArea(){
        s = perimeter/2.0;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is " + area);
    }
}
