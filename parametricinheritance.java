/*let's take an reactangle as parent and cuboid as child those have similar parameters l,b and another h */
class reactangle{
    int length,breadth;
    public reactangle(){
        length=1;
        breadth=1;
    }
    public reactangle(int l,int b){
        length=l;
        breadth=b;
    }

}
class cuboid extends reactangle{
    int height;
    public cuboid(){
        height=1;
    }
    public cuboid(int l,int b,int h){
        super(l,b);
        height=h;

    }
    int volume(){
        return length*breadth*height;
    }
}
public class parametricinheritance {
    public static void main(String args[]){
        cuboid r=new cuboid(5,10,1);
        System.out.println(r.volume());


    } 
    
}
