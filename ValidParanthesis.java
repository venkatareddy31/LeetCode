package com.java.practice;

import java.util.Stack;

public class ValidParanthesis {

	public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else if((c==')'||c=='}'||c==']')&&stack.empty()==true)
            	return false;
            else if(stack.empty()==false){
                if(c==')'&&stack.peek()=='(')
                stack.pop();
                else if(c=='}'&&stack.peek()=='{')
                	stack.pop();
                else if(c==']'&&stack.peek()=='[')
                	stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()"));

	}

}
