public class Selection_sort {

    public static void sel_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
          int  min_pos=i;
            for(int j=i+1;j<arr.length;j++ ){
                if(arr[j]<arr[min_pos]){
                    min_pos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_pos];
            arr[min_pos]=temp;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={6,8,4,5,2,3,1};
        sel_sort(arr);
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
    }
}