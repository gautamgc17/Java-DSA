public class Merge2SortedArrays {
    public static int[] merge(int arr1[], int arr2[]){
        int[] ans = new int[arr1.length + arr2.length];

        int i=0, j=0, k=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            } else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(i == arr1.length){
            while(j < arr2.length){
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }
        if(j == arr2.length){
            while(i < arr1.length){
                ans[k] = arr1[i];
                k++;
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr1[] = {1, 6, 9, 18, 40, 66, 81};
        int arr2[] = {4, 5, 7, 12, 50};

        int[] result = merge(arr1, arr2);

        for(int ele: result){
            System.out.print(ele + " ");
        }
    }
}
