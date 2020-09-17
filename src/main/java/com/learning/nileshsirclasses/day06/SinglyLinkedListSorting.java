package com.learning.nileshsirclasses.day06;

import static java.lang.System.out;

public class SinglyLinkedListSorting {
    //list of items linked together
    public static void main(String[] args) {

        //case 0 empty SLLL display called.
//        SinglyLinkedListSorting singlyLinearLinkedList = new SinglyLinkedListSorting();
//        singlyLinearLinkedList.display();

        //case 1 filled SLLL display called and addLast() also tested.
//        SinglyLinkedListSorting singlyLinearLinkedList = new SinglyLinkedListSorting();
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
//        SinglyLinkedListSorting singlyLinearLinkedList = new SinglyLinkedListSorting();
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addFirst(11);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addFirst(22);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addFirst(33);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addFirst(44);
//        singlyLinearLinkedList.display();


//        case 3 filled SLLL display called and addLast() also tested.
//        SinglyLinkedListSorting singlyLinearLinkedList = new SinglyLinkedListSorting();
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addLast(11);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addLast(22);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addLast(33);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addLast(44);
//        singlyLinearLinkedList.display();

//      case 4 Add to a list with only 1 element at the first position
//        SinglyLinkedListSorting singlyLinearLinkedList = new SinglyLinkedListSorting();
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addFirst(10);
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addAtPositionFromScratch(11, 1);
//        singlyLinearLinkedList.display();

//      case 5 Add to a list with no element at the first position
//        SinglyLinkedListSorting singlyLinearLinkedList = new SinglyLinkedListSorting();
//        singlyLinearLinkedList.display();
//        singlyLinearLinkedList.addAtPositionFromScratch(11, 2);
//        singlyLinearLinkedList.display();


//      case 5 Add to a list with position>length
        com.learning.nileshsirclasses.day06.SinglyLinkedListSorting singlyLinearLinkedList = new com.learning.nileshsirclasses.day06.SinglyLinkedListSorting();
        singlyLinearLinkedList.display();
        singlyLinearLinkedList.addAtPositionFromScratch(11, 1);
        singlyLinearLinkedList.display();
        singlyLinearLinkedList.addAtPositionFromScratch(12, 2);
        singlyLinearLinkedList.display();
        singlyLinearLinkedList.addAtPositionFromScratch(13, 3);
        singlyLinearLinkedList.display();
        //case 5a
//        singlyLinearLinkedList.addAtPositionFromScratch(19, 9);
        //case 5b
//        singlyLinearLinkedList.addAtPositionFromScratch(19, 5);
        //case 5c
        singlyLinearLinkedList.addAtPositionFromScratch(19, 4);
        singlyLinearLinkedList.display();

    }

    com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node head;

    public SinglyLinkedListSorting() {
        head = null;
    }

    public static class Node {
        private int data;
        private com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node next;

        public Node() {
            data = 0;
            next = null;
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int first) {
        //make before break
        //create the new Node and initialize
        com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node newNode = new com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node(first);

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

        com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node temp = null;
        com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node trav = head;
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

        com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node trav = head;
        for (int i = 0; i < position - 1; i++) {
            trav = trav.next;
        }
        com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node temp = trav.next;
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
            com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node newNode = new com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node(value, null);


            // Traverse at the position
            com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node trav = head;
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
        com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node newNode = new com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node(value, null);

        //special case
        // Empty LL ie head == null
        // position == 1 means inserting at the 1st position - addFirst() - our existing code will insert it in the second position instead of the first position
        // position == length ie position = 3 the same code will work and insert the element at the length position
        // position == length + 1 ie position = 3 + 1 the same code will work and insert the element at the last

        // spl 4. invalid pos (< 1)
        if (position < 1)
            throw new RuntimeException("Invalid position " + position);

        if (head == null || position == 1)
            addFirst(value);
        else {
            // Traverse at the position
            com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node trav = head;
            for (int i = 1; i < position - 1; i++) {
                trav = trav.next;
                //spl 3. if pos to add is beyond length of list, throw error
                if (trav == null)
                    throw new RuntimeException("Invalid position " + position);
            }
            // make the new node next element point to the
            newNode.next = trav.next;
            trav.next = newNode;
        }
    }

    public void addLast(int lastValue) {
        com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node newNode = new com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node(lastValue, null);

        com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node trav = head;
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
        com.learning.nileshsirclasses.day06.SinglyLinkedListSorting.Node trav = head;
        out.print("display called : ");
        while (trav != null) {
            out.print(trav.data + ",");
            trav = trav.next;
        }
        out.println();
    }
}
