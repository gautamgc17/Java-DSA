public class MergeSort {

    private static void merge(int arr[], int start, int end){
        int mid = (start+end)/2;

        // temp array to store result of merging of 2 sorted arrays
        int temp[] = new int[end-start+1];
        int i = start, j = mid+1, k=0; 

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            } else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        if(i>mid){
            while(j<=end){
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        if(j>end){
            while(i<=mid){
                temp[k] = arr[i];
                k++;
                i++;
            }
        }

        // copy the results back to original array
        for(int x = 0; x<temp.length; x++){
            arr[x + start] = temp[x];
        }

        return;
    }

    public static void mergeSort(int[] arr, int start, int end){
        // base case
        if(start >= end){
            return;
        }

        // recursively divide the array into two halves
        int mid = (start + end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        // now merge the 2 sorted arrays
        merge(arr, start, end);
    }
    public static void main(String[] args){
        int arr[] = {15, 6, 9, 8, 4, 1, 66};
        mergeSort(arr, 0, arr.length-1);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}
