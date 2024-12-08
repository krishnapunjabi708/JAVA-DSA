public class argument_in_array {
    public static void update(int marks[],int unchangeable){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
        unchangeable=10;


    }
public static void main(String[] args) {
int marks[]={1,2,3,4};
int unchangeable=5;
update(marks,unchangeable);
for(int i=0;i<marks.length;i++){
    System.out.println(marks[i]);
}
System.out.println("unchangeable is : "+unchangeable);
}    
}
