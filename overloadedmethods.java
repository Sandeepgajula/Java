class overloadedmethods{
    static void sum(int x,int y){
        System.out.print(x+y);
    }
    static void area (double l,double b){
        double a=l*b;
        System.out.println(a);
    }
    static void area(double r){
        double x=Math.PI*r*r;
        System.out.print(x);
    }
    public static void main(String args[]){
        int x=10,y=23;
        sum(x,y);
        double l=10,b=10,r=5;
        area(l,b);
        area(r);
    }
    
}