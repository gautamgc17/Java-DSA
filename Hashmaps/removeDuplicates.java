package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {

    public static ArrayList<Integer> removeDups(int arr[]){

        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(seen.containsKey(arr[i])){
                continue;
            }
            seen.put(arr[i], true);
            output.add(arr[i]);
        }
        return output;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 2, 2, 5, 4, 4, 4, 1, 2, 255, 9, 8, 9, 1};
        ArrayList<Integer> output = removeDups(arr);
        System.out.println(output);
    }
}
