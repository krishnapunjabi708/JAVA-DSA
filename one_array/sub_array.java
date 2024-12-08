public class sub_array {
    public static void sub(int number[]){
    int n=number.length;
for(int i=0;i<number.length;i++){
    int start=i;
       for(int j=i;j<number.length;j++){
               int end=j;
                              for(int k=start;k<=end;k++){
                                 System.out.print(number[k]+" ");
                                 
                                                     }
                                                    
                                System.out.println();
                                         }
    System.out.println();
                                }
System.out.println("The Total Number Pair are : "+(n*(n+1)/2));
                                         }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
sub(number);

    }
}
