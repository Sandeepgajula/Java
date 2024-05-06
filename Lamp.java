class Lamp{
     
        Boolean isOn;
        String lampType;
        Lamp(Boolean temp,String s){
            isOn=temp;
            lampType=s;
        }
        void turnon(){
            if(isOn==true){
                System.out.println("system already turned on");
            }
            else{
                if(isOn==false){
                    isOn=true;
                    System.out.println("bulb is on and state is "+isOn); 
                }

            }

        }
        void turnoff(){
            if(isOn==false){
                System.out.println("system already turned off");
            }
            else{
                if(isOn==true){
                    isOn=false;
                    System.out.println("bulb is off and state is "+isOn); 
                }

            }

            
        }

        
        
}
class And{
    public static void main(String arg[]){
        Lamp l1=new Lamp(false,"led"); 
        Lamp l2=new Lamp(false,"Halogen");
        l1.turnon();
        l2.turnoff();
      

    }
}
