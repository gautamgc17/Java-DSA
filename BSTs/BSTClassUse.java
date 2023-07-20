public class BSTClassUse {
    public static void main(String[] args){
        BSTClass bst = new BSTClass();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);
        bst.insert(23);
        bst.insert(40);   

        System.out.println(bst.isPresent(2));

        bst.deleteData(23);
        System.out.println(bst.isPresent(23));
        
        bst.deleteData(2);
        
        bst.insert(41);
        bst.insert(45);
        bst.insert(49);
        bst.insert(47);

        bst.print();
        System.out.println();

        bst.deleteData(40);
        bst.print();
    }
}
