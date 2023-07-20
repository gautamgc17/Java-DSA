public class SelectionSort {
    public static void sort(int[] arr){
        int n = arr.length-1;

        for(int i=0; i < n; i++){

            // at every iteration, find the minimum value in array, swap it with 1st element
            // so now 1st element forms part of sorted subarray
            int min_idx = i;
            for(int j=i+1; j < n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main(String[] args){
        int arr[] = {15, 6, 9, 8, 4, 1, 66};
        sort(arr);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }    
}
