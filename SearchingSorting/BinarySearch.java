class BinarySearch{
    public int iterativeSearch(int[] arr, int key){
        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key <= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public int recursiveSearch(int[] arr, int key, int start, int end){
        // base case
        if(start > end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if (key == arr[mid]){
            return mid;
        }
        else if(key <= arr[mid]){
            return recursiveSearch(arr, key, start, mid-1);
        }
        else{
            return recursiveSearch(arr, key, mid+1, end);
        }
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 9, 66, 77, 88};
        // Arrays.sort(arr);
        BinarySearch obj = new BinarySearch();
        // int res = obj.iterativeSearch(arr, 66); 
        int res = obj.recursiveSearch(arr, 696, 0, arr.length-1); 
        if (res == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + res);  
    }
}