package Stacks;

import java.util.Stack;

// If the current character of the string is an opening bracket(‘(‘ or ‘{‘ or ‘[‘), then push it to the stack
//  If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching opening bracket then fine, 
// else parentheses are not balanced. This is because of the fact that in a balanced expression, whichever bracket opens last, should be closed first.

// Time and Space Complexity: O(N)

public class BalancedParenthesis {

    public static boolean isValid(String expr){

        Stack<Character> st = new Stack<Character>();

        for(int i=0; i<expr.length(); i++){
            if(expr.charAt(i) == '(' || expr.charAt(i) == '{' || expr.charAt(i) == '['){
                st.push(expr.charAt(i));
                continue;
            }

            else if(expr.charAt(i) == ')' || expr.charAt(i) == '}' || expr.charAt(i) == ']'){
                
                if(st.isEmpty()){
                    return false;
                }

                char top = st.pop();
                if (expr.charAt(i) == ')' && top == '('){
                    continue;
                }
                else if (expr.charAt(i) == '}' && top == '{'){
                    continue;
                }
                else if (expr.charAt(i) == ']' && top == '['){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        String expr = "{[(abcddcba)]]}";
        System.out.println(isValid(expr));
    }
}
