package com.ojas.dataStructure;

public class SingleLinkedList1 {
	/*
	 * // implementation of a Node in a linked List //generic type- public class
	 * ListNode<T> { private T data; private ListNode<T> next; }
	 * 
	 * // intgerType- public class ListNode1 { private int data; private ListNode1
	 * next; }
	 */
//	private ListNode head; // head node to hold the list
	// given a listNode, print all elements it hold
	public void display(ListNode head) {
		if (head == null) {
			return;
		}
		ListNode current = head;
		// loop each element till end of the list
		// last node points to null
		while (current != null) {
			System.out.print(current.data + " -->");// print current element's data
//move to next element
			current = current.next;
		}
		System.out.println(current);
	}

	// Given a listNode head, find out length of linked list
	public int length(ListNode head) {
		if (head == null) {
			return 0;
		}
		// create a count variable to hold length
		int count = 0;
		// loop each element and increment the count till list ends
		ListNode current = head;
		while (current != null) {
			count++;
			// move to next node
			current = current.next;
		}
		return count;
	}

// inserting a first node into link list
	public ListNode insesrtAtBeginning(ListNode head, int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			return newNode;
		}
		newNode.next = head;
		head = newNode;
		return head;// this head will be new head, having new node at beginneing
	}

	// inserting a last node in linked list
	public ListNode insertAtEnd(ListNode head, int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			return newNode;
		}
		ListNode current = head;
		while (null != current.next) {
			current = current.next;
		}
		current.next = newNode;
		return head;
	}

	// inserting a node after middle node or any node
	public void inseertAfter(ListNode previous, int data) {
		if (previous == null) {
			System.out.println("The given previous node can not be null");
			return;
		}
		ListNode newNode = new ListNode(data);
		newNode.next = previous.next;
		previous.next = newNode;
	}

//inserting a node of given node
	public ListNode insertAtposition(ListNode head, int data, int position) {
		// preform boundary checks
		int size = length(head);
		if (position > size + 1 || position < 1) {
			System.out.println("Invalid posiion.");
			return head;
		}
		ListNode newNode = new ListNode(data);
		if (position == 1) {
			newNode.next = head;
			return newNode;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			newNode.next = current;
			previous.next = newNode;
			return head;
		}
	}

//deleting a first node intoo list
	
	private static class ListNode {// It contains a staitc inner class ListNode
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		// Lets create a linked list demostrated in slide
		// 10-> 8-> 1-> 11 ->null
		// 10 as head node of linked list
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
//attach them togeter to form a list
		head.next = second;// 10->8
		second.next = third;// 10-> 8->1
		third.next = fourth;// 10-> 8-> 1-> 11 ->null

		SingleLinkedList1 s1 = new SingleLinkedList1();
		s1.display(head);
		System.out.println();
		int len = s1.length(head);
		System.out.println("The lenght of the node is  = " + len);
		System.out.println();
		ListNode newHead = s1.insesrtAtBeginning(head, 15);
		System.out.println("inserting a first node");
		s1.display(newHead);

		ListNode lastNode = s1.insertAtEnd(head, 15);
		System.out.println("inserting a last node");

		s1.display(lastNode);
		System.out.println("inserting a middle or previous any node");
		s1.inseertAfter(second, 12);
		s1.display(head);
		head = s1.insertAtposition(head, 232, 3);
		s1.display(head);

	}

}
