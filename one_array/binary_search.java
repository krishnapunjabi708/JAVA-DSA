public class binary_search {
public static int Binay_Search(int arr[],int key){
int start=0,end=arr.length-1;
while(start<=end){
    int mid =(start+end)/2;
if (arr[mid]==key) {
return mid;    
}
else if(mid<key){
    start=mid+1;
}
else{
    end=mid-1;
}
}

    return -1;
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
int key=5;
int index=Binay_Search(arr, key);
System.out.println("The Index is "+index);
//Time Complecity=O(log(n))
    }
}
