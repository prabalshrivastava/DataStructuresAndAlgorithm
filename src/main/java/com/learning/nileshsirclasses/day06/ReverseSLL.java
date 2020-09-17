package com.learning.nileshsirclasses.day06;

class ReverseSLL {
    static class Node {
        private int data;
        private Node next;

        public Node() {
            data = 0;
            next = null;
        }

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    private Node head;

    public ReverseSLL() {
        head = null;
    }

    // time complexity - O(n)
    public void addLast(int val) {
        Node newNode = new Node(val);
        // special case: if list is empty
        if (head == null)
            head = newNode; // newNode itself is first node of list
        else { // general case: if list already have few nodes
            // traverse till last node
            Node trav = head;
            while (trav.next != null)
                trav = trav.next;
            // add address of newNode into last node's next
            trav.next = newNode;
        }
    }

    // time complexity - O(n)
    public void display() {
        System.out.print("List: ");
        Node trav = head;
        while (trav != null) {
            System.out.print(trav.data + ", ");
            trav = trav.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node oldHead = head;
        head = null;
        while (oldHead != null) {
            Node temp = oldHead;
            oldHead = oldHead.next;

            temp.next = head;
            head = temp;
        }
    }

    private void reverseDisplay() {
        System.out.println("Reverse : ");
        reverse(head);
    }

    public void reverse(Node trav) {
        if (trav.next == null) {
            return;
        }
        System.out.print(trav.data + ",");
        reverse(trav.next);
    }

    public void recursiveReverse(Node trav) {
        if (trav.next == null) {
            head = trav;
            return;
        }
        recursiveReverse(trav.next);
        trav.next.next = trav;
        trav = null;
    }

    public void recursiveReverse() {
        recursiveReverse(head);
    }

    public int findMiddle() {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow != null ? slow.data : 0;
    }


    public static void main(String[] args) {
        ReverseSLL l1 = new ReverseSLL();
        l1.addLast(30);
        l1.addLast(10);
        l1.addLast(40);
        l1.addLast(20);
        l1.display();
//        l1.reverse();
//        l1.reverseDisplay();
//        System.out.println("");
        l1.recursiveReverse();
        l1.display();
    }
}