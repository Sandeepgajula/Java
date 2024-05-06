package lambdaExpessionsandIOstreams;
@FunctionalInterface
interface Mylambda{
    public void display();
}
public class lambda1 {
    public static void main(String[] args) {
        Mylambda m=()->{System.out.println("hiii there");};
        m.display();
    }

    
}
