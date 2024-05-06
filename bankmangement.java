package week7;

import java.util.Scanner; 

interface b{
    void credit();
    void debit() throws Exception ;
    boolean credentailcheck(String x,String y) throws Exception;
}
class sbi implements b{
    String u,p;
    double b;
    public sbi(String s,String m,double c){
           u=s;
           p=m;
           b=c;
    }
    @Override
    public void credit() {
        // TODO Auto-generated method stub
        System.out.println("your adding 1000 ruppees to your wallet");
        b+=1000; 
    }
    @Override
    public void debit() throws Exception {
        if(b<1000){
            throw new Exception("Balance is Less"); 
        }
        else{
            System.out.println("your removing 500 ruppees to your wallet");
            b-=500; 

        } 
        
    }
    @Override
    public boolean credentailcheck(String x,String y) throws Exception{ 
        if(x.equals(u) && y.equals(p)){
            return true;
        }
        else{ 
            throw new Exception();
        } 
        
    }

}
public class bankmangement {
 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        sbi s[]=new sbi[2];
        s[0]=new sbi("rgukt","123",1000);
        s[1]=new sbi("mct","456",2000); 
        while(true){
            System.out.println("1 ---Login----");
            System.out.println("2 ---Exit----"); 
            int n=sc.nextInt();
            boolean b=false;
            int x=0;
            switch(n){
                case 1: 
                        System.out.println("enter username");
                        String u=sc.next();
                        System.out.println("enter password");
                        String p=sc.next(); 
                       try{
                       for(int i=0;i<2;i++){
                             b=s[i].credentailcheck(u,p); 
                             x=i;
                       }}
                       catch(Exception e){
                        System.out.println(e);
                       }
                       break;
                case 2:
                       System.exit(0);
                
            }
            if(b==false){
                System.out.println("credential mismatch");
            }
            else{
                System.out.println("----Succesfully loggin---");
                boolean a=true;
                while(a){
                    System.out.println("1.credit");
                    System.out.println("2.debit");
                    System.out.println("3.logout");
                    int c=sc.nextInt();
                    switch(c){
                        case 1:
                               s[x].credit();
                               System.out.println(s[x].b);
                               break;
                        case 2:
                               try{
                               s[x].debit();
                              }
                              catch(Exception e){
                                System.out.println(e);
                              }
                              break;
                        case 3:
                              a=false;
                              break;
                    }
                }

            } 
         
        sc.close();
        }
    } 
}
