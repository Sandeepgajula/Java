 
import java.util.*;
class calci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println("enter key");
        int key=sc.nextInt();
        int add,sub,mul,div;
        switch (key) {
            case 1:
                add=a+b;
                System.out.println("addition  "+add);
                break;
            case 2:
                sub=a-b;
                System.out.println("sub  "+sub);
                break;
            case 3:
                mul=a*b;
                System.out.println("mul   "+mul);
                break;
            case 4:
                div=a/b;
                System.out.println("division  "+div);
                break;
            default:
                break;
        }
        sc.close();
    }
}