package LinkedList;

import java.util.LinkedList;

public class listCollections{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(0, 5);
        list.addFirst(1);
        list.addLast(100);

        list.set(1, 99);
        System.out.println(list.get(1));

        System.out.println(list.size());
        System.out.println(list.removeLast());

        System.out.println(list.remove());
    }
}