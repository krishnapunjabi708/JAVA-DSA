import java.util.*;;
public class Reverse_String_using_Stack {
    public static String Reverse(String st ){
        Stack<Character> s=new Stack<>();
        StringBuilder s1=new StringBuilder("");
        int idx=0;
        while(idx<st.length()){
            s.push(st.charAt(idx));
            idx++;
        } 
    while (!s.isEmpty()) {
        s1.append(s.pop());
    }

return s1.toString();


    }
    public static void main(String[] args) {
     
       String st="krishna";
       System.out.println(st);
     System.out.println(Reverse(st));
       
    }
}
