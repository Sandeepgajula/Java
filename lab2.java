package week7;
import java.util.*; 
 
class passenger{  
    
    String n,p;
    int age;
    public passenger(String name, int age2, String prof) { 
        n=name;
        age=age2;
        p=prof; 
    }
    public double reserve(double d){ 
           double c=0.0;
            if(age<4){
                c=0;
            }
            if(age>4 && age<9)
                c=d*0.4;
            
            if(p.equals("Student")){
                c=d*0.6;
            }
            if(p.equals("Defence"))
                c=d*0.8; 
            return c; 
    
}
}
class lab2{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no. of  passengers");
        int n=sc.nextInt();
        passenger p[]=new passenger[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the person" + i +"Name");
            String name=sc.next();
            System.out.println("enter the person" + i +"Age");
            int age=sc.nextInt();
            System.out.println("enter the person" + i +"Proffession");
            String prof=sc.next();
            p[i]=new passenger(name,age,prof);
        }
        int total=0;
        System.out.println("To-from Station use shortcuts");
        String j=sc.next();
        try{
            if(j.equals("WL-KMT") || j.equals("KMT-WL")){
                for(int i=0;i<n;i++){
                System.out.println("1.Sleeper--");
                System.out.println("2.AC--");
                System.out.println("3.general");
                int x=sc.nextInt();
               // int total=0;
                
                switch (x) {
                    case 1: 
                        total+=485-p[i].reserve(485);
                       
                        break;
                    case 2: 
                        total+=1500-p[i].reserve(1500);
                       
                        break;
                    case 3: 
                        total+=135-p[i].reserve(135);
                       
                        break;
                    default:
                        break;
                }
            }

            }  
            if(j.equals("WL-BSX") || j.equals("BSX-WL")){
                for(int i=0;i<n;i++){
                System.out.println("1.Sleeper--");
                System.out.println("2.AC--");
                System.out.println("3.general");
                int x=sc.nextInt();
                //int total=0; 
                switch (x) {
                    case 1: 
                        total+=385-p[i].reserve(385); 
                        break;
                    case 2: 
                        total+=1350-p[i].reserve(1350); 
                        break;
                    case 3: 
                        total+=125-p[i].reserve(125);
                       
                        break;
                    default:
                        break;
                }
            }

            }  
            if(j.equals("BSX-SC") || j.equals("SC-BSX")){
                for(int i=0;i<n;i++){
                System.out.println("1.Sleeper--");
                System.out.println("2.AC--");
                System.out.println("3.general");
                int x=sc.nextInt();
               // int total=0;
                
                switch (x) {
                    case 1: 
                        total+=485-p[i].reserve(485);
                       
                        break;
                    case 2: 
                        total+=1500-p[i].reserve(1500);
                       
                        break;
                    case 3: 
                        total+=135-p[i].reserve(135);
                       
                        break;
                    default:
                        break;
                }
            }

            }
            if(j.equals("BSX-BZA") || j.equals("BZA-BSX")){
                for(int i=0;i<n;i++){
                System.out.println("1.Sleeper--");
                System.out.println("2.AC--");
                System.out.println("3.general");
                int x=sc.nextInt();
                //int total=0;
                
                switch (x) {
                    case 1: 
                        total+=485-p[i].reserve(485);
                        break;
                    case 2: 
                        total+=1500-p[i].reserve(1500);
                       
                        break;
                    case 3: 
                        total+=135-p[i].reserve(135);
                    
                        break;
                    default:
                        break;
                }
            }

            } 
            
           System.out.println("total "+total);

        } 
        catch(Exception e){
            System.out.println("Your journey is not in our list");
        }


    }
} 
