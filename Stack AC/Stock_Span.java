import java.util.*;;
public class Stock_Span {

public static void Stockspan(int Stocks[],int span[]){
Stack<Integer> s=new Stack<>();
span[0]=1;
s.push(0);
for(int i=1;i<Stocks.length;i++){
    int currPrice=Stocks[i];
    while(!s.isEmpty()&&currPrice>Stocks[s.peek()]){
        s.pop();

    }
    if(s.isEmpty()){
        span[i]=i+1;
    }
    else{
        int prevHigh=s.peek();
        span[i]=i-prevHigh;
    }
s.push(i);
}

}
public static void Print(int Span[],int Stocks[]) {
    for(int i=0;i<Stocks.length;i++){
        System.out.print(Stocks[i]+" ");
    }
    System.out.println();
    for(int i=0;i<Span.length;i++){
        System.out.print(Span[i]+"  ");
    }
    
}

    public static void main(String[] args) {
        int Stocks[]={100,80,60,70,60,85,100};
int span[]=new int[Stocks.length];
Stockspan(Stocks,span);
Print(span,Stocks);

    }
}
