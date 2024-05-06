import java.util.*;
class factor{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                int j;
                 for(j=2;j<i;j++){
                    if((i%j)==0){
                        break;
                    }
                 }
                 if(i==j){
                    System.out.println(i);
                 }
                
            }
        }
        sc.close();
    }
}