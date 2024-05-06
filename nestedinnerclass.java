class outer{
    int x=10;
    //inner i= new inner();
    class inner{
        int y=20;
        void innerdisplay(){
            System.out.println("inner display  "+x);
            System.out.println("inner display   "+y);
        }

    }
    void outerdisplay(){
        inner i= new inner();
        i.innerdisplay();
        System.out.println("outerdisplay "+i.y); 

    }

}

public class nestedinnerclass {
    public static void main(String args[]){
        outer u=new outer();
        u.outerdisplay();
        System.out.println("direct display  ");
        outer.inner oi=new outer().new inner();
        oi.innerdisplay(); 

    }
}
