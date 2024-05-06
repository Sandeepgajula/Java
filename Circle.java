
public class Circle {
    double radius;
 
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getperimeter(){
        return 2*Math.PI*radius;
    }
}

class Main {

    public static void main(String[] args) {


        Circle c1 = new Circle();
        c1.radius=5;
        
        Circle c2 = new Circle();
        c2.radius=10;
        Circle c3 = new Circle();
        c3.radius=15;
        System.out.println("area of 1 " + c1.getArea());
        System.out.println("perimeter of 1" + c1.getperimeter());
        System.out.println("area of 2 " + c2.getArea());
        System.out.println("perimeter of 2" + c2.getperimeter());
        System.out.println("area of 3 " + c3.getArea());
        System.out.println("perimeter of 3" + c3.getperimeter());
         

        
 
    }
}
