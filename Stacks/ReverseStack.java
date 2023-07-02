package Stacks;

import java.util.Stack;

// Reverse a Stack using Recursion
// Time Complexity: O(N2)
// Auxiliary Space: O(N) use of Stack 
public class ReverseStack {

    public static void reverseStack(Stack<Integer> st, Stack<Integer> helper){
        // recursively empty the stack and hold their value in call stack;
        // now empty the stack into helper stack and then again insert elements into original stack
        if(st.isEmpty()){
            return;
        }

        int top = st.pop();
        reverseStack(st, helper);

        while(!st.isEmpty()){
            int temp = st.pop();
            helper.push(temp);
        }
        helper.push(top);

        while(!helper.isEmpty()){
            int temp = helper.pop();
            st.push(temp);
        }
    }

    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        int arr[] = {5, 6, 7, 1, 9};
        for(int elem: arr){
            st.push(elem);
        }
        System.out.println("Original Stack: " + st);

        Stack<Integer> helper = new Stack<>();
        reverseStack(st, helper);

        System.out.println("Reversed Stack: " + st);
    }
}
