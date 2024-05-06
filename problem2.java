import java.util.*;
class problem2
{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=n-2;i>=0;i--) {
            for(int j=i-1;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print("* ");

                }
                else{
                    System.out.print("");
                }
               
            }
            System.out.println("");
        }
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++){
                if((i+j)>5){
                    System.out.print("* ");

                }
                else{
                    System.out.print("");
                }
               
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        sc.close();
    }
    
    
}
