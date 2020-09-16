package com.learning.nileshsirclasses.day04;

import org.w3c.dom.Node;

import static java.lang.System.out;

public class SinglyCircularLinkedList {
    Node head;

    public static class Node {
        private int data;
        private Node next;

        public Node() {
            data = 0;
            next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int first) {
        Node newNode = new Node(first, null);
        Node trav = head;

        newNode.next = head;
        if (head == null) {
            head = newNode;
        } else {
            while (trav != head) {
                trav = trav.next;
            }
            trav.next = newNode;
        }
        head = newNode;
    }

    public void delAll() {

        if (head == null) {
            throw new RuntimeException("Empty List");
        }
        if (head.next == head) {
            head = null;
        }

        //way 1 - complexity On2
//        while(head!=null)
//            delFirst();

        //way 2 - complexity On - convert the circular linkedlist into linear list
        Node temp = head;
        head = head.next;
        temp.next = null;
        while (head != null) {
            temp = head;
            head = head.next;
            temp.next = null;
        }


//        while (head.next != head) {
//            head.next = head.next.next;
//        }
    }

    public void delFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        if (head.next == head) {
            head = null;
        }

        Node trav = head;
        while (trav != head) {
            trav = trav.next;
        }
        head = head.next;
        trav.next = head;
    }

    public void delLast() {
        while (head != null)
            delFirst();
    }

    public void delAtPosition(int value, int position) {
    }

    public void addAtPosition(int value, int position) {
    }

    public void addLast(int lastValue) {
        Node newNode = new Node(lastValue, null);
        Node trav = head;

        newNode.next = head;
        if (head == null) {
            head = newNode;
        } else {
            while (trav != head) {
                trav = trav.next;
            }
            trav.next = newNode;
        }
    }

    public void display() {
        out.print("list : ");
        Node trav = head;
        if (head != null) {
            do {
                out.print(trav.data + ",");
                trav = trav.next;
            }
            while (trav != head);
        }
    }


    public static void main(String[] args) {
        SinglyCircularLinkedList obj = new SinglyCircularLinkedList();
        obj.addLast(11);
        obj.addLast(22);
        obj.addLast(33);
        obj.addFirst(44);
        obj.display();
    }
}

