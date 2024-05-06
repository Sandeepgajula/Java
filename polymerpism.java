package Week2.week67;
class Area{
    void area(){
        System.out.println("The area of the  ");
    }
}
class circle extends Area{
    void area(){
        System.out.println("circle   " + (2*3.14*10));
    }
}
class square extends Area{
    void area(){
        System.out.println("square  " + (10*10));

    }
}

public class polymerpism {
    public static void main(String args[]){
        Area a=new Area();
        Area a1=new square();
        Area a2=new circle();
        a.area();
        a1.area();
        a2.area();

    }
    


    
}
