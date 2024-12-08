public class compare_substring {
//si= starting index , ei = ending index
    public static void substring(String str,int si,int ei){
    String substring="";

for(int i=si;i<ei;i++){
    substring+=str.charAt(i);
}
System.out.println(substring);
    }
    public static void main(String[] args) {
        String str1="Tony";
        String str2="Tony";
        String str3=new String("Tony");
        if(str1==str2){
            System.out.println(true);
        }
        if(str1==str3){ //it will show false because of interned function of java
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if(str1.equals(str3)){// it will show true because it compare the value stored in string
            System.out.println(true);
        }

        String str="Hello World";
substring(str, 0, 2);//output:- He
//this is also done by java function
System.out.println(str.substring(0,2));//output:- He
    }
}
