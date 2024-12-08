public class Remove_duplicate_in_String {
    public static void Remove_duplicate_in_Strings(String str,int idx,StringBuilder NewStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(NewStr);
            return;
        }
        char currchar=str.charAt(idx);

        if(map[currchar-'a']==true){

         Remove_duplicate_in_Strings(str, idx+1, NewStr, map);
        }
        else{
map[currchar-'a']=true;
 Remove_duplicate_in_Strings(str, idx+1, NewStr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnacollege";
        Remove_duplicate_in_Strings(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
