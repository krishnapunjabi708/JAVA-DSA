public class Binary_String_Prob {
    public static void PrintBinStrings(int n,int lastPlace,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

// if(lastPlace==0){
//     PrintBinStrings(n-1, 0, str+"0");
//     PrintBinStrings(n-1, 1, str+"1");

// }
// else{
//     PrintBinStrings(n-1, 0, str+"0");
  
// }
//kaam
        PrintBinStrings(n-1, 0, str+"0");
        if(lastPlace==0){
            PrintBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        PrintBinStrings(3, 0, "");
    }
}
