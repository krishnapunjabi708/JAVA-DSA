public class trapping_rain_water {
    public static int TrappedWater(int height[]){
        int n=height.length;
        int waterlevel=0,trappedwater=0;
int Leftmax[]=new int[n];
Leftmax[0]=height[0];
for(int i=1;i<n;i++){
    Leftmax[i]=Math.max(height[i],Leftmax[i-1] );
}
int Rightmax[]=new int[n];
Rightmax[n-1]=height[n-1];
for(int i=n-2;i>=0;i--){
    Rightmax[i]=Math.max(height[i],Rightmax[i+1]);
}
for(int i=0;i<n;i++){
    waterlevel=Math.min(Leftmax[i],Rightmax[i]);
trappedwater+=waterlevel-height[i];
}
return trappedwater;
    }
public static void main(String[] args) {
    
    int height[]={4,2,0,6,3,2,5};
   System.out.println( "The Amount of trapped water is "+TrappedWater(height));
}
}

