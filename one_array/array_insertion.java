import java.util.*;
public class array_insertion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int array[]={1,2,3,4,5};
System.out.println("Enter The Elment You Want To Enter: ");
int elment=s.nextInt();
System.out.println("Enter The Position you Want to Enter: ");
int position=s.nextInt();
int new_arr[]=new int[array.length+1];
int k=0;
for (int i=0;i<new_arr.length;i++){
    
    if (position-1>i||position-1<i){
        
        new_arr[i]=array[k];
        k++;
    }
    else{
new_arr[position-1]=elment;
    }
   
}
for(int i=0;i<new_arr.length;i++){
System.out.print(new_arr[i]+",");    
}

    }
}
