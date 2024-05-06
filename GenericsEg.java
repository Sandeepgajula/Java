package lambdaExpessionsandIOstreams;
class Data<T>
{
    private T obj;
    public void setData(T v)
    {
        obj=v;
    }
    public T getData(){
        return obj;
    }
}
public class GenericsEg 
{ 
    public static void main(String[] args) {
        Data<String> g=new Data<>();
        g.setData("hii"); 
        System.out.println(g.getData());
         
    }
       
    
}
