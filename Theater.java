import java.util.*;
class Theater extends Thread{
    static Scanner sc=new Scanner(System.in);
    boolean booked;
    int seat=10;
    synchronized void seat24(int q){
        if(seat>q){
            this.seat=seat-q;
            System.out.println("Seats booked are " +seat);
            booked=true;
		}
        else{
            System.out.println("Given No.of seats are alredy filled");
            booked=false;
		}
    }
    public void run(){
        System.out.println("Enter no.of seats want to book");
        seat24(sc.nextInt());
    }
    public static void main(String[] args)throws Exception{
        Theater t1=new Theater();
        Theater t2=new Theater();
        t1.start();
		t1.join();
        t2.start();
    }
}