import java.util.*;;
public class Next_Greater_element {
    
public static void NextGreater(int arr[],int NextGreater[]){
Stack<Integer> s=new Stack<>();

for(int i=arr.length-1;i>=0;i--){


while(!s.isEmpty()&&arr[i]>=s.peek()){
    s.pop();
}
if(s.isEmpty()){
    NextGreater[i]=-1;
}
else{
    NextGreater[i]=s.peek();
}
s.push(arr[i]);
}

}
public static void Print(int arr[]) {
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
int NextGreater[]=new int[arr.length];
NextGreater(arr,NextGreater);
Print(NextGreater);
    }
}
