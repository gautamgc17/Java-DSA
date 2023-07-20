import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTusecase {
    // search in a BST
    public static BTNode<Integer> searchInBST(BTNode<Integer> root , int key){
        if(root == null){
            return null;
        }

        if(key == root.data){
            return root;
        }
        else if(key <= root.data){
            return searchInBST(root.left , key);
        }
        else{
            return searchInBST(root.right , key);
        }
    } 

    // print node to root path 
    public static ArrayList<Integer> rootToNodePath(BTNode<Integer> root , int data){
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
        else if(data <= root.data){
            ArrayList<Integer> leftAns = rootToNodePath(root.left, data);
            if(leftAns != null){
                leftAns.add(root.data);
                return leftAns;
            }
        }
        else{
            ArrayList<Integer> rightAns = rootToNodePath(root.right, data);
            if(rightAns != null){
                rightAns.add(root.data);
                return rightAns;
            }
        }
        return null;
    }

    // take input level wise
    public static BTNode<Integer> takeInputLevelWise(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter root data is:");
        int rootData = scn.nextInt();
        if(rootData == -1){
            scn.close();
            return null;
        }
        BTNode<Integer> root = new BTNode<>(rootData);
        Queue<BTNode<Integer>> pendingNodes = new LinkedList<BTNode<Integer>>();
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BTNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of:" + front.data);
            int leftData = scn.nextInt();
            if(leftData != -1){
                BTNode<Integer> leftChild = new BTNode<>(leftData);
                front.left = leftChild;
                pendingNodes.add(leftChild);
            }
            System.out.println("Enter right child of:" + front.data);
            int rightData = scn.nextInt();
            if(rightData != -1){
                BTNode<Integer> rightChild = new BTNode<>(rightData);
                front.right = rightChild; 
                pendingNodes.add(rightChild); 
            }
        }
        scn.close();
        return root;
    }

    // print inorder - return in sorted order
    public static void inOrder(BTNode<Integer> root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    public static void main(String[] args){
        BTNode<Integer> root = takeInputLevelWise();
        BTNode<Integer> node = searchInBST(root, 9);
        inOrder(node);

        ArrayList<Integer> ans = rootToNodePath(root, 10);
        if(ans!=null){
            for(int val: ans){
                System.out.print( "\n" + val + " ");
            }
        }
    }
}
