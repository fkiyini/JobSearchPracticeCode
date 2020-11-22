package com.example.emailScheduler.Algos.GoldManPrt2;

import java.util.HashSet;

public class LinkedListWithLoop {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            next = null;
        }
    }
    public static void push(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }
    public boolean aLinkedListWithLoop(Node h){
        HashSet<Node> s = new HashSet<Node>();
        while (h!=null){
            if(s.contains(h))
            return true;

            s.add(h);
            h = h.next;
        }
        return false;
    }


    
}
