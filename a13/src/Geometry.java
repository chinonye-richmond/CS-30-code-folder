import java.lang.Math.*;
public class Geometry {
    private double width, length, radius, side, perimeter, surfaceArea, area;

    public void setPerimeter(double w , double l){
        width = w;
        length = l;
    }
  
    public double PerimeterRectangle(){
        perimeter = (2.0 * width) + (2.0 * length);
        return perimeter;
    }

    public void print1(){
        System.out.print(perimeter);
    }

    public void setSide(double s){
        side = s;
    }

    public double SurfaceAreaCube(){
        surfaceArea = 6.0 * (side * side);
        return surfaceArea;
    }

    public void print2(){
        System.out.print(surfaceArea);
    }

    public void setRadius(double r){
        radius = r;
    }

    public double AreaCircle(){
        area = Math.PI * (radius * radius);
        return area;
    }

    public void print3(){
        System.out.print(area);
    }
}
