class Mythread{
    static int total_seats=20;
    
    static synchronized void m1(int seats){
        if(total_seats>=seats){
            total_seats=total_seats-seats;
            System.out.println("Seats Sucessfully Booked are "+seats);
            System.out.println("Available seats are "+total_seats);
        }else{
            System.out.println("seats cant be booked");
        }
    }
}
public class Main12 extends Thread
{
    static Mythread t;
    int seats;
    
    Main12(Mythread t,int seats){
        this.t=t;
        this.seats=seats;
    }
    
    public void run(){
        t.m1(seats);
    }
	public static void main(String[] args) {
		Mythread t1=new Mythread();
		Main12 m=new Main12(t1,7);
		m.start();
		
		Main12 m2=new Main12(t1,2);
		m2.start();
		
		Mythread t2=new Mythread();
		Main12 m3=new Main12(t2,3);
		m3.start();
		
		Main12 m4=new Main12(t2,10);
		m4.start();
	}
}