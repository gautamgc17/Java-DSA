public class LinkedListUse {

    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static void printLL(Node<Integer> head){
        // Node<Integer> temp = head;
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }

    }
    public static void main(String[] args){

        // Generic Node
        Node<Integer> n1 = new Node<>(99);
        System.out.println(n1.data);
        System.out.println(n1.next);

        Node<Integer> head = createLinkedList();
        System.out.println(head);
        printLL(head);
        printLL(head);
    }   
}
