package com.example.emailScheduler.GoldManPrt6;

import java.util.Stack;

public class InFixPostFix {
    public boolean isOperand(String string){
        for (int i=0;i<string.length();i++){
            if ((string.charAt(i) >= 'a' || string.charAt(i)<= 'z') && (string.charAt(i) >= 'A' || string.charAt(i)<= 'Z') )
                return true;
        }
        return false;
    }

    public String postFix(String string){
        Stack stack = new Stack();
        for (int i=0;i<string.length();i++){
            if (isOperand(string.charAt(i)+"")){
                stack.push(string.charAt(i)+"");
            }
            else {
                String op1 = String.valueOf(stack.peek());
                stack.pop();
                String op2 = String.valueOf(stack.peek());
                stack.pop();
                stack.push("("+op2+""+string.charAt(i)+""+op1+")");
            }
        }

        return String.valueOf(stack.peek());
    }
}
