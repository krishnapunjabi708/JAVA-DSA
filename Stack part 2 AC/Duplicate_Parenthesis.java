import java.util.*;;
public class Duplicate_Parenthesis {
   public static Boolean Duplicate_Parenthesis(String str){
Stack<Character> s=new Stack<>();
for(int i=0;i<str.length();i++){
  
    char ch=str.charAt(i);
//closing
    if(ch==')'){
 int count=0;
while(s.peek()!='('){

count++;
s.pop();
}
if(count<1){
return true;//duplicate exist

}
else{
    s.pop();//opening pair
}
    }
    else{
        //opening
        s.push(ch);
    }

}

return false;
   }
   public static void main(String[] args) {
    //valid String
    String str="((a+b))";//true
String str2="(a-b)";//false
System.out.println(Duplicate_Parenthesis(str));
System.out.println(Duplicate_Parenthesis(str2));


   }
}
