public class Counting_sort {
    public static void count_sort(int arr[]){
        int max_num=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max_num=Math.max(max_num, arr[i]);
        }
        int count[]=new int[max_num+1];

        for(int i=0;i<count.length;i++){

            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,2,4,6,7,8,9,8};
        count_sort(arr);

        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
