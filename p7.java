package week7;

import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
interface Reserve{
    boolean credentialsCheck(String username,String password) throws Exception;
    void reserve(int BearthCount,String Class) throws Exception;
    void exit();
}

class tickets{
    static ArrayList<Integer> aclist = new ArrayList<Integer>();
    static List<Integer> sclist = new ArrayList<Integer>();
   // static List<Integer> booked = new ArrayList<Integer>();
    Random rd = new Random();
    static{
        for(int i=0;i<140;i++){
            aclist.add(i+1);
            sclist.add(i+1);
        }
    }
    static int ac1=aclist.size(),sc1= sclist.size();
    void Reservation(int c,String Class){
        List<Integer> booked_now = new ArrayList<Integer>();
        if(Class.equals("a")){
            while(c!=0){
                int s = rd.nextInt(aclist.size());
                int seat = aclist.get(s);
                aclist.remove(s);
               // booked.add(seat);
                booked_now.add(seat);
                c--;
            }
            System.out.println("Booked Tickets are: \nCoach\tSeatNumber");
            for(int x:booked_now){
                if(x>70){
                    System.out.println("B2\t"+(x%70+1));
                }
                else
                System.out.println("B1\t"+x);
            }
        }
        else{
            while(c!=0){
                int s = rd.nextInt(sclist.size());
                int seat = aclist.get(s);
                sclist.remove(s);
               // booked.add(seat);
                booked_now.add(seat);
                c--;
            }
            System.out.println("Booked Tickets are: \nCoach\tSeatNumber");
            for(int x:booked_now){
                if(x>69){
                    System.out.println("S2\t"+(x%70+1));
                }
                else
                System.out.println("S1\t"+x);
            }
        }
    }
}

class Train implements Reserve{
    tickets t = new tickets();
    String username,password;
    int f1=0,f2=0;
    Train(){

    }
    Train(String u,String p){
        this.username = u;
        this.password = p;
    }
    public boolean credentialsCheck(String username,String password) throws Exception{
        if(this.username.equals(username) && this.password.equals(password))
            return true;
        else
            throw new Exception();
    }
    public void reserve(int BearthCount,String Class) throws Exception{
        if(this.f1==1 && this.f2==1){
            throw new Exception();
        }
        t.Reservation(BearthCount,Class);
    }
    public void exit(){
        System.exit(0);
    }
}
public class p7 {
    public static void main(String[] args) {
        System.out.println("-------------Train Reservation system-----------------");
        System.out.print("Enter no of users: ");
        Scanner sc = new Scanner(System.in);
        int nou = sc.nextInt();
        Train t[] = new Train[nou];
        for(int i=0;i<nou;i++){
            System.out.print("Username["+(i+1)+"]: ");
            String username = sc.next();
            System.out.print("Enter password: ");
            String password = sc.next();
            t[i] = new Train(username,password);
        }
        System.out.println("-----------Welcome--------------");
        int index=-1;
        while(true){
            System.out.print("\n1)Reserve ticket(login)\n2)Exit Application\n\nChoose a option ");
            int c = sc.nextInt();
            if(c == 2){
                sc.close();
                new Train().exit();
            }
            else if(c!=1){
                System.out.println("Invalid option");
                continue;
            }
            System.out.print("Enter username: ");
            String username = sc.next();
            System.out.print("Enter Password: ");
            String password = sc.next();
            boolean b=false;
            for(int i=0;i<nou;i++){
                try{
                    b = t[i].credentialsCheck(username,password);
                }
                catch(Exception e){
                }
                if(b==true){
                    index = i;
                    break;
                }
            }
            if(b==true){
                System.out.println("\t\tSuccessful login");
            }
            else
                System.out.println("********Exception: Credentials Mismatch************");
            while(b==true){
                System.out.print("\n1)Continue to Reserve ticket\n2)Exit\n\nChoose a option ");
                int ch = sc.nextInt();
                if(ch==1){
                    if(tickets.ac1==0 && tickets.sc1 == 0){
                        System.out.println("We are sorry no seats available");
                        continue;
                    }
                    System.out.println("\nClass\tAvailable seats");
                    System.out.print("\n\t1)AC\t\t"+tickets.aclist.size()+"\n\t2)Sleeper\t"+tickets.sclist.size()+"\nChoose class: ");
                    int ch2 = sc.nextInt();
                    int flag = 0;
                    if(ch2==1 || ch2 ==2){
                        System.out.print("Enter no of  bearths you want to reserve: ");
                        String Class = ch2==1?"a":"s";
                        int br = sc.nextInt();
                        try{
                            if(br>6){
                                throw new Exception();
                            }
                        }
                        catch(Exception e){
                            flag = 1;
                            System.out.println("**********Exception: You may be an agent***********");
                        }
                        if(ch2==1){
                            t[index].f1 =1;
                            while(br>(tickets.ac1)){
                                System.out.println("Insufficient seats available\nEnter within available seats");
                                br = sc.nextInt();
                            }
                        }
                        else{
                            
                            t[index].f2 =1;
                            while(br>(tickets.sc1)){
                                System.out.println("Insufficient seats available\nEnter within available seats");
                                br = sc.nextInt();
                            }
                        }
                        if(flag==0){
                            try{
                                t[index].reserve(br, Class);
                            }
                            catch(Exception e){
                                System.out.println("**********Exception: You may be an agent***********");
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid option");
                    }
                }
                else if(ch==2){
                    t[index].f1 = 0;
                    t[index].f2 = 0;
                    break;
                }
                else{
                    System.out.println("Wrong choice");
                }
            }
        }
    }
}