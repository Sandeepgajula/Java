package lambdaExpessionsandIOstreams;
 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream1 {
    public static void main(String[] args) {
        try{
        FileOutputStream f=new FileOutputStream("C:/Users/sandeep gajula/Desktop/E3S1/java/test.txt");
        String str="Learn something new to Explore";
        byte b[]=str.getBytes();
        f.write(b);
        f.close();
        }

        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    
}
