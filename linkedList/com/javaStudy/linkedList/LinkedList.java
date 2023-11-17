package com.javaStudy.linkedList;

public class LinkedList {
	private ListNode head;
	private ListNode tem = null;

	public LinkedList() {
		head = null;
	}

	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
	}

	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else if (head.link == null) {
			tem = newNode;
			head.link = tem;
		} else {
			tem.link = newNode;
			tem = newNode;
		}
	}

	public void deleteLastNode() {
		ListNode pre = null;
		ListNode temp = this.head;
		while (temp != null) {
			if (temp.link == null) {
				pre.link = null;
			}
			pre = temp;
			temp = temp.link;
		}

	}

	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		while (temp != null) {
			if (data == temp.getData()) {
				return temp;
			}
			temp = temp.link;
		}
		return temp;
	}

	public void reverseList() {

	}

	public void printList() {
		ListNode temp = this.head;
		System.out.printf("L = (");
		while (temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if (temp != null) {
				System.out.printf(",");
			}
		}
		System.out.println(")");
	}

}
