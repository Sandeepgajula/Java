import java.util.*;
class palindrome{
        public static void main(String[] args){
           Scanner sc=new Scanner (System.in);
           System.out.println("enter no.");
           int n=sc.nextInt();
           System.out.println(n);
           int r=0,x=n;
           while(n!=0){
            r=(r*10)+(n%10);
            n=n/10;
           }
           if(r == x){
                System.out.println("palindrome");
           }
           else{ 
                System.out.println("NOT palindrome");
           }
           sc.close();
       }
}
   
         