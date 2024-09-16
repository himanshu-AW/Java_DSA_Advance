import java.util.Stack;


// Given a string str consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.

// A parenthesis string is valid if:

// For every opening parenthesis, there is a closing parenthesis.
// Opening parenthesis must be closed in the correct order.
// Examples :

// Input: str = ((()
// Output: 2
// Explaination: The longest valid parenthesis substring is "()".
// Input: str = )()())
// Output: 4
// Explaination: The longest valid parenthesis substring is "()()".
// Expected Time Complexity: O(|str|)
// Expected Auxiliary Space: O(|str|)

// Constraints:
// 1 ≤ |str| ≤ 105  

public class LongestValidParentheses {
    public static int maxLength(String s) {
        // Stack to store indices
        Stack<Integer> stack = new Stack<>();
        // Start by pushing -1 as a base index for valid substrings
        stack.push(-1);
        
        int maxLength = 0;
        
        // Traverse through the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If it's an opening parenthesis, push the index onto the stack
            if (c == '(') {
                stack.push(i);
            } 
            // If it's a closing parenthesis
            else {
                stack.pop(); // Pop the top
                
                // If the stack becomes empty, push the current index
                if (stack.isEmpty()) {
                    stack.push(i);
                } 
                // Otherwise, calculate the valid substring length
                else {
                    int length = i - stack.peek();
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        // Example 1
        String str1 = "((()";
        System.out.println("Longest valid parentheses length: " + maxLength(str1)); // Output: 2
        
        // Example 2
        String str2 = ")()())";
        System.out.println("Longest valid parentheses length: " + maxLength(str2)); // Output: 4
    }
}