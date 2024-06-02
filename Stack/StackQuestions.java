package Stack;

import java.util.*;

public class StackQuestions {

    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        int i = 0;
        Stack<Character> s = new Stack<>();
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        str = result.toString();
        return str;
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void stockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) {
            int curr = stock[i];
            while (!s.isEmpty() && curr > stock[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }

    public static void nextGreater(int arr[], int nextG[]) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length - 1;
        for (int i = n; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextG[i] = -1;
            } else {
                nextG[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static boolean validParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening braces
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            }
            // closing braces
            else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((ch == ')' && s.peek() == '(') || (ch == '}' && s.peek() == '{')
                        || (ch == ']' && s.peek() == '[')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean duplicateParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate pair
                } else {
                    s.pop(); // opening pair
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void maxArea(int arr[]) {
        int maxArea = 0 ;
        int nsr[] = new int[arr.length] ;
        int nsl[] = new int[arr.length] ;
        int n = arr.length - 1 ;
        // Next smaller right
        Stack<Integer> s = new Stack<>() ;

        for (int i = n ; i >= 0 ; i--) {
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]) {
                s.pop() ;
            }
            if (s.isEmpty()) {
                nsr[i] = n+1 ;
            }
            else {
                nsr[i] = s.peek() ;
            }
            s.push(i) ;
        }

        // Next smaller left
        s = new Stack<>() ;

        for (int i = 0; i < nsl.length; i++) {
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]) {
                s.pop() ;
            }
            if(s.isEmpty()) {
                nsl[i] = -1 ;
            }
            else {
                nsl[i] = s.peek() ;
            }
            s.push(i) ;
        }


        // current area
        for (int i = 0; i < arr.length; i++) {
            // currArea = length * (j-i-1)-width
            int currArea = arr[i] * (nsr[i] - nsl[i] - 1) ;
            maxArea = Math.max(maxArea, currArea) ;
        }
        
        System.out.println("Maximum Area : " + maxArea);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // pushBottom(s,4) ;

        // reverseStack(s);

        // String str = "HelloWorld" ;
        // String result = reverseString(str) ;
        // System.out.println(result);

        // ********************** Stock Span Problem
        // *********************************************
        // int Stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        // int span[] = new int[Stock.length];
        // stockSpan(Stock, span);
        // for (int i = 0; i < span.length; i++) {
        // System.out.print(span[i] + " ");
        // }
        // ***********************************************

        // *********************** Next Greater Element **********************
        // int arr[] = { 6, 8, 0, 1, 3 };
        // int nextGreaterElement[] = new int[arr.length];
        // nextGreater(arr, nextGreaterElement);
        // for (int i = 0; i < nextGreaterElement.length ; i++) {
        // System.out.print(nextGreaterElement[i] + " ");
        // }
        // ********************************************************************

        // ***************************** Valid Parenthesis ************************
        // String str = ")))))))" ;
        // System.out.println(validParenthesis(str));
        // ************************************************************************

        // **************************** Duplicate Parenthesis **********************
        // String str = "((a+b))";
        // String str1 = "(a+b)";
        // System.out.println(duplicateParenthesis(str1));
        // *************************************************************************

        // ******************************* Maximum Area in Histogram **********************
        // int arr[] = {2 , 1 , 5 , 6 , 2 , 3} ;
        // maxArea(arr);
        // *********************************************************************************

        // printStack(s) ;
    }
}
