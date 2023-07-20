public class BSTClass {
    // perform aadd, delete, get in BST

    private BTNode<Integer> root;
    // private int size;


    // helper function not associated with object; works with any node and not only object's root; insert any given data
    private static BTNode<Integer> insertHelper(BTNode<Integer> root , int x){
        if(root == null){
            BTNode<Integer> node = new BTNode<>(x); 
            return node;
        }
        if(x <= root.data){
            root.left = insertHelper(root.left, x);
        } else {
            root.right = insertHelper(root.right , x);
        }
        return root;
    }

    public void insert(int x){
        root = insertHelper(root, x);
    }


    private static BTNode<Integer> deleteDataHelper(BTNode<Integer> root, int x){
        if(root == null){
            return null;
        }

        // if data is lesser than root, then call on left subtree
        if(x < root.data){
            root.left = deleteDataHelper(root.left, x);
        }
        else if(x > root.data){
            root.right = deleteDataHelper(root.right, x); 
        }
        else{
            // if we found the root to be deleted, then 3 case are there
            // case 1 root has 0 child
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2 root has 1 child
            else if (root.left != null && root.right == null){
                return root.left;
            }
            else if(root.left == null && root.right != null){
                return root.right;
            }
            // case 3 root has 2 child
            else{
                // either find the largest on left subtree or smallest in right subtree and give its value to root
                // also now we want to find the replacement of this node (now delete that node which was used to replace root)
                BTNode<Integer> largestNode = root.left;
                while(largestNode.right != null){
                    largestNode = largestNode.right;
                }
                root.data = largestNode.data;
                root.right = deleteDataHelper(root.left, largestNode.data);
            }
        }
        return root;
    }

    public void deleteData(int x){
        // output - same or changed root / deleted or not
        root = deleteDataHelper(root , x);
    }


    private static boolean isPresentHelper(BTNode<Integer> root , int x){
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        else if(x <= root.data){
            return isPresentHelper(root.left , x);
        }
        else{
            return isPresentHelper(root.right , x);
        }
    }

    public boolean isPresent(int x){
        return isPresentHelper(root , x);
    }


    public static void inOrder(BTNode<Integer> root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void print(){
        inOrder(root);
    }
}
