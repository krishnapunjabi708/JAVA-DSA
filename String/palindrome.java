public class palindrome {


public static boolean a_palindrome(String str){
    int n=str.length();

    for(int i=0;i<n/2;i++){
if(str.charAt(i)!=str.charAt(n-i-1)){
    return false;
    }
}
return true;
}
    public static void main(String[] args) {
        String str="madam";
        boolean bool=a_palindrome(str);
        if(bool==true){
            System.out.println("the Word "+str+" is a palindrome");

        }
        else{
            System.out.println("the Word "+str+" is not a palindrome");
        }
    }
}
