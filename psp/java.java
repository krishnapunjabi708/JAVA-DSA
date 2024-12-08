public class java {


    
public static void main(String[]args){
    if(args.length==0){
        System.out.println("Usage: java Assignment1 <N1><N2>....<N>");
        return;
    }
  int sum=0;
  int N=args.length;
  //calculate the sum
  for(int i=0;i<N;i++){
    sum+=Integer.parseInt(args[i]);
  }  
//calculate average
double average=(double)sum/N;
//Display sum and average
System.out.println("Sum of numbers: "+sum);
System.out.println("average of numbers: "+average);
}
}


