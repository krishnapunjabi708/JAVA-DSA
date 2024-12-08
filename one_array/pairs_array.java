public class pairs_array {
public static void pair(int number[]){
    int total_pair=0;//total pair=n*(n-1)/2  -------Arthematic Progression
for(int i=0;i<number.length;i++){
    
    int current=number[i];//2,4,6,8,10
    for(int j=i+1;j<number.length;j++){
        int next=number[j];
        System.out.print("("+current+","+next+") ");
total_pair++;
    }
    System.out.println();

}
System.out.println("total pair = "+total_pair);
}
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
pair(number);
//Time Complecity=O(n^2)
    }
}