package lambdaExpessionsandIOstreams;

import java.io.FileInputStream;

public class IOstream2 {
    public static void main(String[] args) throws Exception{
        try(FileInputStream f=new FileInputStream("C:/Users/sandeep gajula/Desktop/E3S1/java/test.txt")){
             byte b[]=new byte[f.available()];

            f.read(b);
            String s=new String(b);
            System.out.print(s);
        }
    }
    
}
