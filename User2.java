import java.util.Scanner;
class Insta{
	private String mailid="pranay@123";
	private String username="pranay";
	private String password="12345";
	
	void setpass(String s){
		this.password=password;
	}
	String getname(){
		return username;
	}
	String getpass(){
		return password;
	}
	String getmail(){
		return mailid;
	}
	public int validate(){
		int n=1000+((int)Math.random()*8999);
		return n;
	}
}

class Gmail{
	Scanner sc=new Scanner(System.in);
	Insta i=new Insta();
	void g(){
		int k=i.validate();
		System.out.println("Enter OTP:");
		int k2=sc.nextInt();
		if(k==k2){
			System.out.println("Enter new password");
			String b=sc.next();
			i.setpass(b);
			System.out.println("new password is: "+i.getpass());
		}
		else{
			System.out.println("Entered Email id is not found");
		}
	}
}

class User2{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args){
		Insta a=new Insta();
		Gmail g=new Gmail();
		System.out.println("please Enter the userID");
		
	}
}