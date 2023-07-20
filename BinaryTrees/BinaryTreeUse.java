import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
    
    // preorder traversal
    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // postorder traversal
    public static void postOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // inorder traversal
    public static void inOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // height of the tree
    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // print all nodes at depth d
    public static void printAtDepthK(BinaryTreeNode<Integer> root , int k){
        if(root == null){
            return;
        }

        if(k==0){
            System.out.println(root.data);
            return;
        }

        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);
    }
    
    // take level wise input
    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter root data is:");
        int rootData = scn.nextInt();
        if(rootData == -1){
            scn.close();
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();

            System.out.println("Enter left child of:" + front.data);
            int leftData = scn.nextInt();
            if(leftData != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(leftData);
                front.left = leftChild;
                pendingNodes.add(leftChild);
            }

            System.out.println("Enter right child of:" + front.data);
            int rightData = scn.nextInt();
            if(rightData != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(rightData);
                front.right = rightChild; 
                pendingNodes.add(rightChild); 
            }
        }
        scn.close();
        return root;
    }

    // print node to root path 
    public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root , int data){
        if(root == null){
            return null;
        }

        // if node is found, add it to arraylist and return the arraylist back to calling node(function)
        // if value of arraylist is not null, then add the caller's value(i.e root node)
        // search first in left half and then in right half, if not found return null
        if(root.data == data){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(root.data);
            return ans;
        }

        ArrayList<Integer> leftAns = rootToNodePath(root.left, data);
        if(leftAns != null){
            leftAns.add(root.data);
            return leftAns;
        }
        ArrayList<Integer> rightAns = rootToNodePath(root.right, data);
        if(rightAns != null){
            rightAns.add(root.data);
            return rightAns;
        }     
        return null;
    }


    public static void main(String[] args){
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        
        // System.out.println("Preorder:");
        // preOrder(root);
        // System.out.println();

        // int h = height(root);
        // System.out.println("Height of the tree: " + h);

        // System.out.println("Nodes at depth d are:");
        // printAtDepthK(root, 2);

        ArrayList<Integer> ans = rootToNodePath(root, 1);
        if(ans!=null){
            for(int val: ans){
                System.out.print(val + " ");
            }
        }
    }
}

 
