import java.util.*;
class arrayappl{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter element in array");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        int m1,m2;
        m1=m2=a[0];
        for(int j=0;j<a.length;j++){
            if(m1>a[j]){
                m1=a[j];
            }
        }
        System.out.println("min of array "+m1);
        for(int j=0;j<a.length;j++){
            if(m2<a[j]){
                m2=a[j];
            }
        }
        System.out.println("max of array "+m2);


        sc.close();
        
    }
}