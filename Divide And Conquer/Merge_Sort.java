public class Merge_Sort {

    public static void aMerge_Sort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        aMerge_Sort(arr,si,mid);//left side
        aMerge_Sort(arr, mid+1, ei);//right side
        Merge(arr,si,mid,ei);

    }
public static void Merge(int arr[],int si,int mid,int ei){
    int i=si;//iterator for left part
    int j=mid+1;//iterator for right part
    int k=0;//iterator for temp arr
    int temp[]=new int[ei-si+1];
    while(i<=mid&&j<=ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[j];
            j++;
        }
        k++;
    }
    //left part
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    //right part
    while(j<=ei){
temp[k++]=arr[j++];
    }
    //copy temp to original arr
    for(i=si,k=0;k<temp.length;i++,k++){
        arr[i]=temp[k];
    }
}
public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
public static void main(String[] args) {
    int arr[]={6,3,9,5,2,8};
    aMerge_Sort(arr,0,arr.length-1);
    print(arr);
}
}