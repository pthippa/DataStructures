import java.util.ArrayList;

public class LinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int value) {
			data = value;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.head = new Node(1);
		Node node = new Node(2);
		linkedList.head.next = node;
		Node lastNode = node;
		
		for (int i=3; i <= 10; i++) {
			lastNode.next = new Node(i);
			lastNode = lastNode.next;
		}
		
		PrintList(linkedList.head);
		int n = 4;
		System.out.println("\nDeleting Node " + n);
		deleteNode(linkedList, n);
		PrintList(linkedList.head);
		System.out.println("\nInserting Node " + n);
		insertNode(linkedList, 4);
		PrintList(linkedList.head);
		System.out.println("\nReversing linked list");
		reverseLinkedList(linkedList);
		PrintList(linkedList.head);
	}
	
	static void PrintList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	static void deleteNode(LinkedList llist, int value) {
		Node node;
		if (llist.head.data == value) {
			llist.head = llist.head.next;
			return;
		}
		else {
			node = llist.head;
		}
		
		while (node.next != null) {
			if (node.next.data == value) {
				node.next = node.next.next;
				break;
			}
			node = node.next;
		}
	}
	
	static void insertNode(LinkedList llist, int value) {
		Node node;
		if (llist.head.data > value) {
			Node tempNode = llist.head;
			llist.head = new Node(value);
			llist.head.next = tempNode;
			return;
		}
		else {
			node = llist.head;
		}
		
		while (node.next != null) {
			if (node.next.data > value) {
				Node tempNode = node.next;
				node.next = new Node(value);
				node.next.next = tempNode;
				break;
			}
			node = node.next;
		}
	}
	
	static void reverseLinkedList(LinkedList llist) {
		Node node = llist.head;
		ArrayList<Node> nodeList = new ArrayList<Node>();
		
		while (node.next != null) {
			nodeList.add(node);
			node = node.next;
		}
		nodeList.add(node);
		
		for (int i = nodeList.size()-1; i > 0; i--) {
			nodeList.get(i).next = nodeList.get(i-1);
		}
		nodeList.get(0).next = null;
		llist.head = nodeList.get(nodeList.size()-1);
		
	}
}
