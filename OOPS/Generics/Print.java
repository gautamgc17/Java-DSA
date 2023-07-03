package Generics;

public class Print {
    public <T> void print(T arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // generic bound types
    public static<T extends PrintInterface> void printArray(T arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i].print();
        }
        System.out.println();
    }
}
