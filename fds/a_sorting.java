
 class Innersorting {
     void Bubble_sort(int arr[]){
        int temp;
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
    
    if(arr[j]>arr[j+1]){
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
                }
            }
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
     }    
void Selection_sort(int arr[]){
   for(int i=0;i<arr.length-1;i++){
    int curr=arr[i];
    for(int j=i+1;j<arr.length;j++){
if(curr>arr[j]){
    curr=arr[j];
}
    }
    int temp=curr;
    curr=arr[i];
    arr[i]=temp;

   }
   
}
}
public class a_sorting {
   public static void main(String[] args) {
    int arr[]={4,3,2,1};
  int key=3;

    Innersorting a=new Innersorting();
   
    for(int i=1;i<arr.length-1;i++){
        int curr=arr[i];
int prev=i-1;
while(prev>=0&&curr<arr[prev]){
    arr[prev+1]=arr[prev];
    prev--;

}
arr[prev+1]=curr;
    }
    for(int i=0;i<arr.length-1;i++){
        int start=0,end=arr.length-1;
    

        while(start<=end){
            int mid=(start+end)/2;
            if(mid==key){
                System.out.println("The Array is at location : "+mid);
                return;
            }
            else if(mid<key){
start=mid+1;
            }
            else{
                end=mid-1;

            }
        }
    }
   } 
}
