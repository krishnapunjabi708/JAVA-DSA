import java.util.*;
class Bank{
    public double balance;
    public Bank(double balance){
this.balance=balance;
    }
public void deposit(double amount){
balance=balance+amount;
System.out.println("deposit Successfully! New Balance "+balance);


}
public void withdraw(double amount){
    if(balance>=amount){
        balance=balance-amount;
        System.out.println("Withdraw successfull! Currenty Balance "+balance);
    }
    else{
        System.out.println("EnSufficient balance");
    }
}
}
public class Banking {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Balance");
    double balance=sc.nextDouble();

    Bank b=new Bank(balance);
    
   }
}
