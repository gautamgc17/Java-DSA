public class InsertionSort {
    public static void sort(int[] arr){

        for(int i=1; i < arr.length; i++){
            
            // compare current element with its predecessor elements, find the correct position, shift greater elemeents to right
            // place current element at its right position in sorted subpart
            int temp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
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
