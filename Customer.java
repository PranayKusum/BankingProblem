import java.util.*;
class TransactionFailureException extends Exception{
	TransactionFailureException(){
		super("insufficient balance");
	}
}
class Bank{
	double balance=5000;
	public void deposite(int a){
		balance=balance+a;
		System.out.println("sucessfully deposited\navailable balance is "+balance);
	}
	public void withdraw(int b) throws Exception{
		if(balance-b<0){
			throw new TransactionFailureException();
		}else{
			balance=balance-b;
			System.out.println("sucessfully withdraw\n available balance is "+balance);
		}
	}
}
class Customer extends Thread{
	static Scanner sc=new Scanner(System.in);
	static Bank b=new Bank();
	public void run(){
		System.out.println("Enter deposite or Withdraw");
		String s=sc.nextLine();
		try{
			if(s.equals("deposite")){
				b.deposite(sc.nextInt());
			}else{
				b.withdraw(sc.nextInt());
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	public static void main(String[] args){
		Customer c=new Customer();
		c.start();
	}
}