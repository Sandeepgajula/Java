 
package lambdaExpessionsandIOstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Excercise {
    public static void main(String[] args) throws Exception{
       
        FileInputStream f=new FileInputStream("C:/Users/sandeep gajula/Desktop/E3S1/java/Example1.txt");
        FileOutputStream f2=new FileOutputStream("C:/Users/sandeep gajula/Desktop/E3S1/java/Example2.txt");
        int b;
        while((b=f.read())!=-1){
            if(b>=65 && b<=90)f2.write(b+32);
            else f2.write(b);
        }
        
            f2.close();
            f.close();
        }
    
    
}

    

