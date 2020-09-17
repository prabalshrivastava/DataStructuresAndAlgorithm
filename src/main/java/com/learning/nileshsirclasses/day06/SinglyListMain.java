package com.learning.nileshsirclasses.day06;

import java.util.Scanner;

class SinglyList {
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
	
	public SinglyList() {
		head = null;
	}
	
	// time complexity - O(n)
	public void addLast(int val) {
		Node newNode = new Node(val);
		// special case: if list is empty
		if(head == null)
			head = newNode; // newNode itself is first node of list
		else { // general case: if list already have few nodes
			// traverse till last node
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			// add address of newNode into last node's next
			trav.next = newNode;
		}
	}
	
	// time complexity - O(n)
	public void display() {
		System.out.print("List: ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void selectionSort() {
		for(Node i=head; i != null; i = i.next) {
			for(Node j=i.next; j != null; j = j.next) {
				if(i.data > j.data) {
					int temp = i.data;
					i.data = j.data;
					j.data = temp;
				}
			}
		}
	}
}

public class SinglyListMain {
	public static void main(String[] args) {
		SinglyList l1 = new SinglyList();
		l1.addLast(30);
		l1.addLast(10);
		l1.addLast(40);
		l1.addLast(20);
		l1.display();
		l1.selectionSort();
		l1.display();
	}
}