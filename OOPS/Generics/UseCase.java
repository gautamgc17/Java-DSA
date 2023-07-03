package Generics;

public class UseCase {
    public static void main(String[] args){
        Pair<String, Integer> p = new Pair<String, Integer>("abcd", 20);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());

        int a = 1, b = 2, c = 3;
        Pair<Integer, Integer> internalPair = new Pair<Integer, Integer>(a, b);
        Pair< Pair<Integer, Integer>, Integer> p2 = new Pair<>(internalPair, c);
        System.out.println(p2.getFirst().getFirst());
        System.out.println(p2.getFirst().getSecond());       
        System.out.println(p2.getSecond());

        Integer arr[] = {1, 2, 3, 4, 5};
        Character srr[] = {'a', 'b', 'c', 'd'};
        Print pr = new Print();
        pr.print(arr);
        pr.print(srr);

        // Generic Bound
        Vehicle vrr[] = new Vehicle[5];
        for(int i=0; i<5; i++){
            vrr[i] = new Vehicle();
        }
        Print.printArray(vrr);
    }
}
