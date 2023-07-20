public class TreeUse {

    // preorder traversal
    public static void preOrder(TreeNode<Integer> root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        for(int i=0; i<root.children.size(); i++){
            preOrder(root.children.get(i));
        }
    }

    // postorder traversal
    public static void postOrder(TreeNode<Integer> root){
        if(root == null){
            return;
        }

        for(int i=0; i<root.children.size(); i++){
            postOrder(root.children.get(i));
        }
        System.out.print(root.data + " ");
    }

    // height of a generic tree
    public static int height(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        // make recursive calls at all the child nodes, believing that recursion result will tell us the height of the subtree.
        int maxHeight = 0;
        for(int i=0; i<root.children.size(); i++){
            int currentHeight = height(root.children.get(i));
            maxHeight = Math.max(maxHeight, currentHeight);
        }

        // After moving out of the for loop, maxHeight stores the value of height of child with maximum height
        // So in order to get the height of the current tree with node as root, we add one to the height.
        return maxHeight + 1;
    }
}
