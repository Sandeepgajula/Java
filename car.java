class car{
    String company;
    double milage;
    double speed ;
    String color;
    car(String c,double m,double s,String c2){
        company=c;
        milage=m;
        speed=s;
        color=c2;
    }
    

}
class latex{
    /**
     * @param arg
     */
    public static void main(String arg[]){
        car c[]=new car[3];

        c[0]=new car("ford",12,10,"blue");
        c[1]=new car("toyato",15,13,"blue");
        c[2]=new car("volkswagon",19,10,"blue");
        double m=0;
        int j=0;
        for(int i=0;i<3;i++){
            if(c[i].milage>m)
            {
                m=c[i].milage;
                j=i;
            }
        }
        System.out.println("Car is"+(c[j].company));
 
    }
    

}
