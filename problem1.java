package week7;

public class problem1 {
    static int  meth1(int a,int b) throws Exception{
         if(a<1 || b<1){
            throw new Exception();
         }
         else {
            return 0;
         }
    
    }
    public static void main(String args[]) throws Exception{
         
        try{
            meth1(10,-1);
        }
        catch (Exception e){
            System.out.println("there cannot be divisible");
        }
        finally{
            System.out.println("the program completed");
        }
    }
    
}
