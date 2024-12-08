public class sorting {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
    }

    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }

    }
    public static void selection_sort(int arr[]){
        int temp,curr;
        for(int i=0;i<arr.length-1;i++){
            curr=i;//3
            for(int j=i+1;j<arr.length;j++){
           
            if(arr[curr]>arr[j]){
                curr=j;
            }

            } 
            temp=arr[i];
            arr[i]=arr[curr];
            arr[curr]=temp;
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
        
        

    }
public static void insertion_sort(int arr[]){
    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        while (prev>=0&&curr<arr[prev]) {
            arr[prev+1]=arr[prev];
            prev--;
            
        }
        arr[prev+1]=curr;

    }
}
        
    
    public static void main(String[] args) {
        int arr[]={4,3,1,2};
 insertion_sort(arr);
        
        
    }
}