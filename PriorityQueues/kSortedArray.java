import java.util.PriorityQueue;

// The array is nearly sorted. Every element is at-max displaced k spots left or right to it's position in the sorted array. 
// Hence it is being called k-sorted array.
// You are required to sort and print the sorted array.
// Time complexity reduced from O(nlogn) to O(nlogk).

public class kSortedArray {
    public static void sortKsortedArray(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // since every element is K position (excluding ith index) displace so create a priorityqueue of k+1 size 
        for(int i=0; i<=k; i++){
            pq.add(arr[i]);
        }

        //  3 elements are already added so now keep popping smallest element and add remaining
        for(int j=0; j<arr.length-k-1; j++){
            arr[j] = pq.remove();
            pq.add(arr[j + k + 1]);
        }

        // last 3 remaining elements are already sorted, so just remove them
        for(int j=arr.length-k-1; j<arr.length; j++){
            arr[j] = pq.remove();
        }
    }
    public static void main(String[] args){
        int[] arr = {2, 4, 1, 9, 6, 8};        // {1, 2, 4, 6, 8, 9}
        int[] arr2 = {6, 5, 3, 2, 8, 10, 9};   // {2, 3, 5, 6, 8, 9, 10}
        int k = 3;
        int k2 = 3;
        sortKsortedArray(arr, k);
        for(int i: arr){
            System.out.println(i + " ");
        }
    }
}
