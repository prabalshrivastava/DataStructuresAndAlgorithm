package com.learning.nileshsirclasses.day05;

import org.w3c.dom.Node;

import static java.lang.System.out;

public class DoublyLinearLinkedList {
    Node head;
    int count;

    public static class Node {
        private int data;
        private Node next;
        private Node previous;

        public Node() {
            data = 0;
            next = null;
            previous = null;
        }

        public Node(int val) {
            data = val;
            next = null;
            previous = null;
        }

        public Node(int data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }

    public void addFirst(int first) {
        //create a new node
        Node newNode = new Node(first);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    public void delAll() {
    }

    public void delFirst() {
        //point the head.next = head.next.next;
        if (head == null) {
            throw new RuntimeException("Empty List");
        } else if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        count--;
    }

    public void delLast() {
    }

    public void delAtPosition(int position) {


        //special case
        // head == null
        // position == 1
        // position == length


        if (head == null || position == 1 /*|| head.next == null*/) {
            delFirst();
        } else if (position < 1 || position > count) {
            throw new RuntimeException("Invalid Position");
        } else {
            //approach 1
            //traverse at the position-1
//        Node trav = head;
//        for (int i = 1; i < position; i++) {
//            trav = trav.next;
//        }
//        Node t1 = trav.previous;
//        Node t2 = trav.next;
//        t1.next = t2;
//        t2.previous = t1;


            //approach 2
            Node trav = head;
            for (int i = 1; i < position; i++) {
                trav = trav.next;
            }
            trav.previous.next = trav.next;
            if (trav.next != null) {//If not last node to delete
                trav.next.previous = trav.previous;
            }
        }
        count--;
    }

    public void addAtPosition(int value, int position) {
        if (position == count + 1) {
            addLast(value);
        } else if (head == null || position == 1) {
            addFirst(value);
        } else if (position < 1 || position > count + 1) {
            throw new RuntimeException("invalid position");
        } else {
            //create a new node
            Node newNode = new Node(value);

            //traverse till postiion-1
            Node trav = head;
            for (int i = 1; i < position - 1; i++) {
                trav = trav.next;
            }
            Node temp = trav.next;
            newNode.previous = trav;
            newNode.next = temp;

            trav.next = newNode;
            temp.previous = newNode;
        }
        count++;
    }

    public void addLast(int lastValue) {
        //create a new node
        Node newNode = new Node(lastValue);

        if (head == null) {
            head = newNode;
        } else {
            //traverse to last
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = newNode;
            newNode.previous = trav;
        }
        count++;
    }

    public void display() {
        Node trav = head;
        Node temp = null;

        out.print("\nForward list : ");
        while (trav != null) {
            out.print(trav.data + ",");
            temp = trav;
            trav = trav.next;
        }

        out.print("\nReverse list : ");
        while (temp != null) {
            out.print(temp.data + ",");
            temp = temp.previous;
        }
        out.println("\n");
    }


    public static void main(String[] args) {
//        DoublyLinearLinkedList doublyLinearLinkedList = new DoublyLinearLinkedList();
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addLast(10);
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addLast(20);
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addLast(30);
//        doublyLinearLinkedList.display();


//        DoublyLinearLinkedList doublyLinearLinkedList = new DoublyLinearLinkedList();
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addLast(10);
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addLast(20);
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addLast(30);
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addAtPosition(25, 3);
//        doublyLinearLinkedList.display();


//        DoublyLinearLinkedList doublyLinearLinkedList = new DoublyLinearLinkedList();
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addLast(10);
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addLast(20);
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addLast(30);
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.addAtPosition(25, 3);
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.delFirst();
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.delFirst();
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.delFirst();
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.delFirst();
//        doublyLinearLinkedList.display();
//        doublyLinearLinkedList.delFirst();
//        doublyLinearLinkedList.display();


        DoublyLinearLinkedList doublyLinearLinkedList = new DoublyLinearLinkedList();
        doublyLinearLinkedList.display();
        doublyLinearLinkedList.addLast(10);
        doublyLinearLinkedList.display();
        doublyLinearLinkedList.addLast(20);
        doublyLinearLinkedList.display();
        doublyLinearLinkedList.addLast(30);
        doublyLinearLinkedList.display();
        doublyLinearLinkedList.addAtPosition(25, 3);
        doublyLinearLinkedList.delAtPosition(2);
    }
}

