package week7;

import java.util.Scanner;

public class problem5 {
    static int  meth(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter something int ");
        int k=sc.nextInt();
        int n=100/0;
        int a[]={1,2,3,4};
        return a[6];


    }
    public static void main(String args[]){
        try{
            meth();
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
    
}
