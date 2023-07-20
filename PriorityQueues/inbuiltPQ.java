import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Comparator;

// custom comparator implementing Comparator interface
class StringLengthComparator implements Comparator<String> {
    public int compare(String a, String b){
        if(a.length() < b.length()){
            return 1;
        }
        else if(a.length() > b.length()){
            return -1;
        }
        else{
            return 0;
        }
    }
}

public class inbuiltPQ{
    public static void main(String[] args){
        // Priority Queues - bydefault min pq - pass intitial capacity and custom comparator
        // Returns a comparator that reverses the natural ordering imposed by the objects' own compareTo method
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] ranks = {20, 19, 1, 101, 1, 5, 2, 20, 45};

        for(int rank: ranks){
            pq.add(rank);
        }
        System.out.println(pq + " -> " + pq.size());

        while(pq.size() != 0){
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
        System.out.println();

        // declare a PriorityQueue object with custom comparator to generate max PQ
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a, b) -> (b - a));
        // PriorityQueue<Integer> pq2 = new PriorityQueue<>(ranks.length , new Comparator<Integer>(){
        //     public int compare(Integer a, Integer b){
        //         if(a < b){
        //             return 1;
        //         }
        //         else if (a.equals(b)){
        //             return 0;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // });

        int[] ranks2 = {20, 19, 1, 101, 1, 5, 2, 20, 45};

        for(int rank: ranks2){
            pq2.add(rank);
        }
        System.out.println(pq2 + " -> " + pq2.size());

        while(pq2.size() != 0){
            System.out.print(pq2.peek() + " ");
            pq2.remove();
        }
        System.out.println();


        StringLengthComparator strComparator = new StringLengthComparator();
        
        String sample[] = {"a", "def", "xz", "joggi", "tts"};
        PriorityQueue<String> pq3 = new PriorityQueue<>(strComparator);

        for(String s: sample){
            pq3.add(s);
        }
        while(pq3.size() != 0){
            System.out.print(pq3.peek() + " ");
            pq3.remove();
        }
    }
}