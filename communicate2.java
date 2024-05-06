import java.io.*;
import java.lang.*;

class communicate
{
       public static void main(String args[]) throws Exception
       {
           Producer obj1=new Producer();
           Consumer obj2=new Consumer(obj1);
 
           Thread t1=new Thread(obj1);
           Thread t2=new Thread(obj2);

                   t2.start();
                   t1.start();
     }
}


class Producer extends Thread
{
   StringBuffer sb;
  boolean dataprodover=false;

     Producer()
     {
                sb=new StringBuffer();
     }
    public void run()
    {
      synchronized(sb)
       {
             
                   System.out.println("producer started producing data");
               for(int i=1;i<=10;i++)
              {
                        try
                          {
                             sb.append(i+":");
                               Thread.sleep(1000);
                               System.out.println("appending : "+ i);
                              }
                    catch(Exception e)
                     {}
              }
                   System.out.println("producer finihed with producing data");
                  sb.notify();
               }
         }
}


class Consumer extends Thread
{
    Producer prod;
        Consumer(Producer prod)
       {
                this.prod=prod;
       }
  public void run()
  {
         synchronized(prod.sb)
         { 
          try
           {
                  prod.sb.wait();
               
                 
         
          }    catch(Exception e)
                  {}
               System.out.println("Consumer now consuming"+prod.sb);
         } 
  }
}
    
       
