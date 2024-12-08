public class quick_sort{
public static void Quick_Sort(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    //last elemet
    int pIdx=partition(arr,si,ei);
    Quick_Sort(arr, si, pIdx-1);//leftt
    Quick_Sort(arr, pIdx, ei);//right

}
public static int partition(int arr[],int si,int ei){
    int pivot=arr[ei];
    int i=si-1;//to make place for els smaller than pivot
for(int j=si;j<ei;j++){
    if(arr[j]<=pivot){
        i++;
        //swap
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
i++;
int temp=pivot;
arr[ei]=arr[i];
arr[i]=temp;
return i;
}
public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String[] args) {
       int arr[]={6,3,9,8,2,5};
       int ei=arr.length-1;
       Quick_Sort(arr, 0, ei); 
       print(arr);

    }
}