package com.example.emailScheduler.Algos.ebay;

public class OperationsOnLinkedList {
    static Node head;

    Node reverseLinkedList(Node node) {

        Node current = node;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        node = previous;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int date) {
            this.data = date;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        OperationsOnLinkedList list = new OperationsOnLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverseLinkedList(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}


