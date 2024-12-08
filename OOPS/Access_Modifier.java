/*
 * ACCESS MODIFIER:-
 Access Modifier	within class	within package	outside package by subclass only	outside package
Private	                Y	              N                   	N	                            N
Default	               	Y	              Y	                    N		                        N
Protected		        Y		          Y	                 	Y		                        N
Public		            Y		          Y		                Y	                        	Y
 
 */

public class Access_Modifier {
    

public static void main(String[] args) {
Bank_Account b=new Bank_Account();
b.Name="krishna";
//b.password="krishna7"; it throws error because it is written in private
b.set_password("krishna7");
System.out.println(b.Name);
//System.out.println(b.password);   - it can not be access


    }
}
class Bank_Account {
    
    public String Name;//Access modifier Public
    private String password;//Access modifier Private

    void set_password(String SetPassword){
        password=SetPassword;
        System.out.println(password);

    }
}