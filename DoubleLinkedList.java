package com.ojas.doubleLinkedList;

public class DoubleLinkedList {
	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode {
		private int data;
		private ListNode previous;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public DoubleLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	// checking doublie linked list empaty or not
	public boolean isEmpty() {
		return length == 0; // head == null
	}

	public int length() {
		return length;
	}

	// adding a variable into list
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
	}

	// display doubleLinkedList fordDirection
	public void displayForward() {
		if (head == null) {
			return;
		}
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "--> ");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	// display list into backward direction
	public void displayBackward() {
		if (tail == null) {
			return;
		}
		ListNode temp = tail;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.previous;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(15);
		dll.insertLast(25);
		dll.displayForward();
		dll.displayBackward();
	}
}
