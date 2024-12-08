public class first_letter_in_upper_case {
    public static void toUpperCase(String str){
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            sb.append(str.charAt(i));
            if(str.charAt(i)==' '&&i!=str.length()-1){
                
i++;
sb.append(Character.toUpperCase(str.charAt(i)));

            }
           
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="hi, i am krishna";
        toUpperCase(str);
    }
}
