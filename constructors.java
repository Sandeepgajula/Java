package Week2.week67;
class parent{
    public parent(){
        System.out.println(" this is parent");
    }
}
class child extends parent{
    public child(){
        System.out.println(" this is child");
    }
}
class grandchild extends child{
    public grandchild(){
        System.out.println(" this is grand child");
    }
}

public class constructors{
    public static void main(String args[]){
        grandchild g=new grandchild();

    }

}