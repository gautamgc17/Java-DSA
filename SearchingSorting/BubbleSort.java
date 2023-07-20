public class BubbleSort {
    public static void sort(int[]arr){
        int n = arr.length-1;

        for(int i=0; i < n; i++){
            for(int j=0; j < n-i; j++){
                
            // at every iteration, compare adjacent elements and swap them if not in correct order i.e move bigger element to the end
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
