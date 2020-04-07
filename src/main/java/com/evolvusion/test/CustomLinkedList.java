package com.evolvusion.test;

public class CustomLinkedList {

	public Node head;

	public Node tail;

	public void addNode(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			tail = newNode;
			head = newNode;
		} else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void display() {
		
		Node current=head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		while(current != null) {
			System.out.println(current.data+"->");
			current=current.next;
		}
		
		System.out.println(current);
	}

}
