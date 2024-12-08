public class reverse_of_an_array {
    public static void reverse(int arr[]){
    //   int first=0,last=arr.length-1,swap;
    //   while(first<last){
    //     swap=arr[first];
    //     arr[first]=arr[last];  //apna college
    //     arr[last]=swap;
    //     first++;
    //     last--;
    //   }
      for(int i=0;i<arr.length/2;i++){
        int swap=arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-1-i]=swap;
      }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        reverse(arr);
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
//Time Complecity=O(n^3)
      }
    }
}
