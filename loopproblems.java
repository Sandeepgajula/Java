import java.util.*;
class loopproblems
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c,f;
        c=0;
        f=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
            c=c+i;
            f=f*i;
           
        }
        System.out.println("sum of the no.");
        System.out.println(c);
        System.out.println("factorial");
        System.out.println(f);

        sc.close();

    }

}