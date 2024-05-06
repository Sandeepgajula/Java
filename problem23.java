package week7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class problem23 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        meth1();
        try{
            int n=Integer.parseInt(sc.next());
            System.out.println(n);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        
        sc.close();
    
        
    }
    static void meth1(){
        Scanner sc=new Scanner(System.in);
        try{
        int n=sc.nextInt();}
        catch(InputMismatchException e){
            System.out.println(e);
        }



    }
   
    
}
