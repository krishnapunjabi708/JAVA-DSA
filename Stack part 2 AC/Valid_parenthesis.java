import java.util.Stack;

public class Valid_parenthesis {

    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String s="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    System.out.println("Invalid");
                   return;
                }
                else if((st.peek()=='('&&ch==')')||(st.peek()=='['&&ch==']')||(st.peek()=='{'&&ch=='}')){
                    st.pop();
                }
                else{
                    System.out.println("Invalid");
               return;
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("Valid");
        }
        else{
          System.out.println("Invalid");
        }
    }
}