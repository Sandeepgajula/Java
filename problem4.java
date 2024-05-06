package week7;

import java.util.Scanner;
import week7.management.lessException;

abstract class bank{
    abstract  void Credentialcheck(String s,String u ) throws Exception;
    abstract void credit();
    abstract void debit() throws lessException;
    abstract void displayBalance() ;
    abstract void exit();
}
class management extends bank {
    Scanner sc=new Scanner(System.in);
    String a[]={"sandeep","baaja","loki","aadhi"};
    String b[]={"1234","2629","1024","1745"};
    int bal[]={100,300,5000,50000};
    int x=0;
    public void Credentialcheck(String s,String password) throws Exception{
        for(int i=0;i<a.length;i++){
            if(a[i]==s && b[i]==password){
                x=i;
                System.out.println("Successfully logged in ......");
                break;
                
            }
            else{
                throw new Exception(" credential  Mismatch ");
            }

        }


     }
 
    class lessException extends Exception{
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "the balace is less than 1000";
        }
    }
    void  debit() throws lessException{
        if(bal[x]<1000) {
            throw new lessException();
        }
        else{
            System.out.println("enter the amount to enter");
        int y=sc.nextInt();
        bal[x]-=y; 
    }
} 
    @Override
    void credit() {
        
        System.out.println("enter the amount to enter");
        int y=sc.nextInt();
        bal[x]+=y; 
    }
    @Override
    void exit() {
         return;
        
    } 
    @Override
    void displayBalance() {
        System.out.println("the balance is " + bal[x]);
        // TODO Auto-generated method stub
        
    } 
} 

public class problem4 {
    public static void main(String args[]) {
        management m=new management(); 
        Scanner sc=new Scanner(System.in);
        boolean b=false; 
   
        try{
            m.Credentialcheck("sandeep","1234");
            b=true;
           }
        catch(Exception e){
             System.out.println(e);
        } 
        if(b==true){
        int s=1; 
        while(s==1){
        
            System.out.println("ente the choice ");
             
            System.out.println(" 1. Your here to check the balance ----" );
            System.out.println(" 2. Credit ------ ");
            System.out.println("3. dedit ------ ");
            System.out.println("4 .exit ------ ");
            int n=sc.nextInt();
            switch(n){ 
                case  1: 
                       m.displayBalance();
                       break;
                case 2:
                    
                      m.credit();
                      break;
                case 3:
                    
                     try{
                      m.debit();}
                     catch(Exception e){
                        System.out.println(e);
                     }
                      break;
                case 4: 
                     System.exit(0);

                 
            }
            System.out.println("press 1 to continue  else 0 to exit");
            s=sc.nextInt();
        }
    }
      
        sc.close();

    }

    
}
