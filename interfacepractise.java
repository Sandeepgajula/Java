interface Test{
    void meth1();
    void meth2();
}
class p implements Test{
    public void meth1(){
        System.out.println("this is meth1 of p");
    }
    public void meth2(){
        System.out.println("this is meth2 of p");
    }
    public void meth3(){
        System.out.println("this is meth3 of p");
    }
}

public class interfacepractise {
    public static void main(String args[]){
        Test t=new p();
        t.meth1();
        t.meth2();
        //t.meth3();
        
    }

}
