public class practice {
    public static void main(String args[]){
         

    }
    
}
interface vehicle{
    void getcompany();
    void type();
    void getconsumption();
}
class twowheeler implements vehicle {
    String company,t;
    int distance;
    twowheeler(String c,String type,int d){
        company=c;
        t=type;
        distance= d;
    }
    public void getcompany(){
        System.out.println(company);
    }
    public void type(){
        System.out.println(t);

    }
    

}

