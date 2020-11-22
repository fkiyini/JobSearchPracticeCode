package com.example.emailScheduler.Algos.GoldMan;

import java.util.Stack;

class MyQueue {

    /**
     * Initialize your data structure here.
     */
    private Stack<Integer> s1 = new Stack();
    private Stack<Integer> s2 = new Stack<>();

    public MyQueue() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        s1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        return s2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        } else {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        return s2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args)    {
        MyQueue s = new MyQueue();
        s.push(1);
        s.push(2);
        s.push(3);

//        System.out.println("current size: " + s.size());
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());


//        System.out.println("current size: " + s.size());

    }

}
