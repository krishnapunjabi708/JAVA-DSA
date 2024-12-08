import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
 //Creating Array:-

int array[]=new int[5];
int num[]={1,2,3,4};
String fruit[]={"mango","apple","orange"};
//input in Array
array[0]=s.nextInt();
array[1]=s.nextInt();
array[2]=s.nextInt();
System.out.println("Array at Zero Postion: "+array[0]);
System.out.println("Array at 1 Postion: "+array[1]);
System.out.println("Array at 2 Postion: "+array[2]);
//update the array
array[1]=array[1]+1;
array[2]=20;
System.out.println(array[1]);
System.out.println(array[2]);
//we can calculate the length of array
System.out.println(array.length);//5
System.out.println(fruit.length);//3







//Using Loop:-
//int i=0;
// System.out.println("Enter The Array: ");
// while(true){
// array[i]=s.nextInt();
// i++;
// if(i==5){
//     break;
// }
// }

    }
}
