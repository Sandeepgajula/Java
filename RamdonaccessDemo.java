package lambdaExpessionsandIOstreams;

import java.io.*;

public class RamdonaccessDemo {
    public static void main(String[] args)  throws Exception {
         RandomAccessFile rf=new RandomAccessFile("C:/Users/sandeep gajula/Desktop/E3S1/java/Data.txt","rw");
         System.out.println((char)rf.read());
         rf.write('b');   
         System.out.println((char)rf.read());
         rf.skipBytes(3);
         System.out.println((char)rf.read());
    }

    
}
