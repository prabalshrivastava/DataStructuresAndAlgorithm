package com.learning.nileshsirclasses.day03;

import static java.lang.System.out;

public class SinglyLinearLinkedList {
    //list of items linked together
    public static void main(String[] args) {

        //case 0 empty SLLL display called.
//        SinglyLinearLinkedList singlyLinearLinkedList = new SinglyLinearLinkedList();
//        singlyLinearLinkedList.display();

        //case 1 filled SLLL display called and addLast() also tested.
//        SinglyLinearLinkedList singlyLinearLinkedList = new SinglyLinearLinkedList();
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addLast(11);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addLast(22);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addLast(33);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addLast(44);
//        singlyLinearLinkedList.display();


        //case 2 filled SLLL display called and addFirst() also tested.
//        SinglyLinearLinkedList singlyLinearLinkedList = new SinglyLinearLinkedList();
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addFirst(11);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addFirst(22);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addFirst(33);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addFirst(44);
//        singlyLinearLinkedList.display();


//        case 1 filled SLLL display called and addLast() also tested.
        SinglyLinearLinkedList singlyLinearLinkedList = new SinglyLinearLinkedList();
        singlyLinearLinkedList.display();
        singlyLinearLinkedList.addLast(11);
        singlyLinearLinkedList.display();
        singlyLinearLinkedList.addLast(22);
        singlyLinearLinkedList.display();
        singlyLinearLinkedList.addLast(33);
        singlyLinearLinkedList.display();
        singlyLinearLinkedList.addLast(44);
        singlyLinearLinkedList.display();
        singlyLinearLinkedList.addAtPositionFromScratch(9,1);
        singlyLinearLinkedList.display();
    }

    Node head;

    public SinglyLinearLinkedList() {
        head = null;
    }

    public static class Node {
        private int data;
        private Node next;

        public Node() {
            data = 0;
            next = null;
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int first) {
        //make before break
        //create the new Node and initialize
        Node newNode = new Node(first);

        //point the newNode's next to the head
        newNode.next = head;

        //point the head to newNode
        head = newNode;
    }

    public void delAll() {
//        head = null; //in java
//        or
        while (head.next != null)
            delFirst();
    }

    public void delFirst() {
        if (head.next == null)
            throw new RuntimeException("List is empty");
        head = head.next;
    }

    public void delLast() {
        //special case 1 : if linkedlist is empty
        //special case 2 :linkedlist has only 1 element
        if (head == null || head.next == null) {
            delFirst();
        }

        Node temp = null;
        Node trav = head;
        while (trav.next != null) {
            temp = trav;
            trav = trav.next;
        }
        temp.next = null;
    }

    public void delAtPosition(int value, int position) {
        //special case 1 - if list is empty
        if (head == null)
            throw new RuntimeException("list is empty");

        //special case 2 - id position is 1
        //special case 3 - id position is > length || position < 1
        if (position == 1 || position < 1)
            delFirst();

        //traverse to the position-1
        //mark the node to be deleted as temp
        //update trav to trav.next.next

        Node trav = head;
        for (int i = 0; i < position - 1; i++) {
            trav = trav.next;
        }
        Node temp = trav.next;
        //special case 4 when position == length
        if (temp == null)
            throw new RuntimeException("invalid position");
        trav.next = temp.next;


    }

    public void addAtPosition(int value, int position) {

        if (position < 1) {
            throw new RuntimeException("Invalid position " + position);
        }

        if (position == 1 || head == null) {
            addFirst(position);
        } else {
            //create the node
            Node newNode = new Node(value, null);


            // Traverse at the position
            Node trav = head;
            for (int i = 1; i < position - 1; i++) {
                if (trav == null)
                    throw new RuntimeException("Invalid position " + position);
                trav = trav.next;
            }
            // make the new node next element point to the
            newNode.next = trav.next;
            trav.next = newNode;

        }

    }


    public void addAtPositionFromScratch(int value, int position) {
        //create the node
        Node newNode = new Node(value, null);

        // Traverse at the position
        Node trav = head;
        for (int i = 1; i < position - 1; i++) {
            trav = trav.next;
        }
        // make the new node next element point to the
        newNode.next = trav.next;
        trav.next = newNode;
    }

    public void addLast(int lastValue) {
        Node newNode = new Node(lastValue, null);

        Node trav = head;
        if (head == null) {
            head = newNode;
        } else {
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = newNode;
        }
    }

    public void display() {
        Node trav = head;
        out.print("display called : ");
        while (trav != null) {
            out.print(trav.data + ",");
            trav = trav.next;
        }
        out.println();
    }
}

