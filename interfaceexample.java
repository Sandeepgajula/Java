class phone{
    void call(){
        System.out.println("phone call");
    
    }
    void sms(){
        System.out.println("phone sms");

    }
}
interface Icamera{
    void click();
    void record();
}
interface Ivediomaker{
    void play();
    void pause();
    void stop();
}
class smartphone extends phone implements Icamera,Ivediomaker{
    public void vediocall(){System.out.println(" smart phone vedio call");}
    public void click(){System.out.println("smartphone is clicking pohoto");}
    public void record(){System.out.println("smartphone is recording video");}
    public void play(){System.out.println("smartphone is playing");}
    public void pause(){System.out.println("smartphone vedio is pause");}
    public void stop(){System.out.println("smartphone vedio is stopped");}
}




public class interfaceexample{
    public static void main(String args[]){
        smartphone s=new smartphone();
        s.call();
        s.click();

    }
 }