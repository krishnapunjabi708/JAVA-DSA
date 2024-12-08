public class linear_search {
    public static int a_linear_search(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;

            }
          
        }
        return -1;

    }
    public static int a_linear_search(String array[],String key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;

            }
          
        }
        return -1;

    }
public static void main(String[] args) {
    int array[]={2,4,6,8,10,12,14,16,18};
    int key=10;
int index=a_linear_search(array,key);
if (index==-1){
    System.out.println("NOT FOUND");
}
else{
    System.out.println("The Array is on index "+index);

}
String menu[]={"sambosa","pizza","dosa","idli"};
String a_key="pizza";
int a_index=a_linear_search(menu,a_key);
if (a_index==-1){
    System.out.println("NOT FOUND");
}
else{
    System.out.println("The Array is on index "+a_index);

}
   //Time Complecity=O(n)
   
}
    
}