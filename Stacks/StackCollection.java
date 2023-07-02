package Stacks;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        for(int i=1; i<=5; i++){
            st.push(i);
        }
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
