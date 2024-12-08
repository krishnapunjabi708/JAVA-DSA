public class String_charAt {
    public static void print_letter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str="Krishna";
        System.out.println(str.charAt(2));// output:- i
        print_letter(str);
    }
}
