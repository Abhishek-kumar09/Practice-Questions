package com.codeforcause.TestApr29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nm = bf.readLine();

        int n = Integer.parseInt(nm.split(" ")[0]);

        String[] strs = new String[n];

        for(int i = 0; i < n; i++) {
            strs[i] = bf.readLine();
        }

        for(int i = 0; i < n; i++) {
            boolean b = isBalanced(strs[i]);
            if(b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(ch == '(') stack.push(')');
            else if(ch == '{') stack.push('}');
            else if(ch == '[') stack.push(']');
            else if(ch == ']' || ch == '}' || ch == ')') {
                if (!checkParen(ch, stack)) {
                    return false;
                }
            }
        }

        if(!stack.isEmpty()) {
            return false;
        }

        return true;
    }

    private static boolean checkParen(char ch, Stack<Character> stack) {
        if(stack.isEmpty()) {
            return false;
        }

        char pop = stack.pop();
        if(pop != ch) {
            return false;
        }

        return true;
    }
}

/*
2
{()}
{({[}})]
 */
