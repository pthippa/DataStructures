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
		System.out.println("In insertNode");
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
}
