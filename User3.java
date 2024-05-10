import java.util.Scanner;
class A{
    
    public static void m1(){
        Scanner sc=new Scanner(System.in);
        Insta i=new Insta();
        int n=1000+(int)(Math.random()*8999);
        System.out.println(n);
        System.out.println("Enter the OTP:");
        int a=sc.nextInt();
        if(n==a){
            System.out.println("Enter new Password");
            String s=sc.next();
            i.setpass(s);
            System.out.println("New Password is:"+i.getpass());
        }else{
            System.out.println("OTP doesn't match");
        }
    }
}
class Insta{
    private String username="pranay";
    private String password="12345";
    void setpass(String s){
        this.password=s;
    }
    String getpass(){
        return password;
    }
    String getname(){
        return username;
    }

}
public class User3{
    
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         Insta a=new Insta();
         A a1=new A();
         System.out.println("Enter the user name:");
         String s1=sc.next();
         if(s1.equals(a.getname())){
             System.out.println("Enter password");
             String s2=sc.next();
             if(s2.equals(a.getpass())){
                 System.out.println("Login sucessfull");
             }else{
                 System.out.println("Entered invalid Email please enter 1 to reset password");
                 int k=sc.nextInt();
                 if(k==1){
                     a1.m1();
                 }else{
                     System.out.println("Entered invalid Key");
                 }
             }
         }else{
             System.out.println("Entered incorrect username ");
         }
     }
}