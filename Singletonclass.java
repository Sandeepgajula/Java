class CoffeeMachine{
    private float coffeqty;
    private float milkqty;
    private float waterqty;
    static private CoffeeMachine my=null;
    private CoffeeMachine(){
        coffeqty=1;
        milkqty=1;
        waterqty=1;
    }
    public void fillwater(float qty){
        waterqty=qty;
    }
    public void fillmilk(float qty){
        milkqty=qty;
    }
    static CoffeeMachine getInstance(){
        if(my==null){
            my=new CoffeeMachine();
        }
        return my;
    }


}

public class Singletonclass {
    public static void main(String args[]){
        CoffeeMachine m1= CoffeeMachine.getInstance();
        CoffeeMachine m2= CoffeeMachine.getInstance();
        CoffeeMachine m3= CoffeeMachine.getInstance();
        System.out.println(m1+"   "+m2+ "   "+ m3);
        if(m1==m2 && m1==m3){
            System.out.println("same");
        }
    }

}
