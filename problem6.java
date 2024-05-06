package week7;
import java.util.*;

interface reserve{
    boolean credentialsCheck(String s,String t) throws Exception;
    void reserves(int Brearthcount,String c) throws Exception;
    void exit();
}
class TrainReservation implements reserve{
    String user,pswd;
    TrainReservation(String u,String p ){
        user=u;
        pswd=p;
    }
    public boolean credentialsCheck(String u,String s) throws Exception{
        if(user.equals(u) && pswd.equals(s) ){
            return true;
        }
        else{
            throw new Exception();
        }
    }
    public void  reserves(int b,String c) throws Exception{
        int a=140;
        int sleeper=140;
        Random r= new Random();
        if(b>6){
            throw new Exception("You may be an Agent");
        }
        else{
            if(c.equals("A/C")){
                for(int i=0;i<b;i++){
                   System.out.println(r.nextInt(a));
                }
                a=a-b; 
           }
           else{
            for(int i=0;i<b;i++){
                System.out.println(r.nextInt(sleeper));

            }
            sleeper=sleeper-b;
           }
        }
       


    }
     
    @Override
    public void exit() {
        // TODO Auto-generated method stub
        
    }
     
    

}

public class problem6 {
     public static void main(String args[]){
        System.out.println("enter no. of  usernames and passwords ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TrainReservation t[]=new TrainReservation[n];
        int x=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the user name "  + i);
            String u=sc.next();
            System.out.println("enter password " + i);
            String p=sc.next();
            t[i]=new TrainReservation(u, p);
        }
        while(true){
            System.out.println(" -----------welcome to this application ------------");
            System.out.println("1..Login");
            System.out.println("2...Exit");
            int k=sc.nextInt();
            boolean b=false;
            switch (k) {
                case 1:
                    System.out.println("enter the user name to enter  ");
                    String user=sc.next();
                    System.out.println("enter password to enter  ");
                    String password=sc.next();
                     
                    for(int i=0;i<n;i++){
                        try{
                        b=t[i].credentialsCheck(user, password);
                        x=i;
                    }
                        catch(Exception e){}
                    } 
                    break;
                case 2:
                       System.exit(0); 
                default:
                    break;
            }
            if (b==false){
                System.out.println("The credentails are mis matched .... try again");
            }
            else{
                System.out.println(" --------------Succesfully loged in-------------"); 
                while(b){
                    System.out.println("1........   Two sleeper    ......... ");
                    System.out.println("2........   A/C Bearths    .........");
                    System.out.println("32........   Logout    ......... ");
                    int o=sc.nextInt();
                    switch(o){
                        case 1:
                               System.out.println("how many brearth you want to reserve");
                               int y=sc.nextInt();
                               try{
                               t[x].reserves(y, "sleeper");
                              }
                               catch(Exception e){
                                System.out.println(e);
                                    
                               }
                               break;
                        case 2:
                                System.out.println("how many brearth you want to reserve");
                                int z=sc.nextInt(); 
                                try{
                                    t[x].reserves(z, "A/C");
                                   }
                                    catch(Exception e){
                                     System.out.println(e);
                                         
                                  }
                                break;
                        case 3:
                                b=false;
                                break;

                   
                    }
                     



                }
            }


        } 
     } 
}
