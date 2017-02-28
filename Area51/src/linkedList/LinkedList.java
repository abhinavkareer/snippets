package linkedList;

import linkedList.Node;

public class LinkedList {
	Node head;

	public void insertAtLast(int data) {
		Node nodeToAdd = new Node(data);
		if (head == null) {
			head = nodeToAdd;
			return;
		}
		traverseToAddAtLast(head, nodeToAdd);
	}

	public void insertAtStart(int data) {
		Node nodeToAdd = new Node(data);
		if (head == null) {
			head = nodeToAdd;
			return;
		}

		nodeToAdd.setNextNode(head);
		head = nodeToAdd;
	}

	public void traverseToAddAtLast(Node traversingNode, Node nodeToAdd) {
		if (traversingNode.getNextNode() == null)
			traversingNode.setNextNode(nodeToAdd);
		else
			traverseToAddAtLast(traversingNode.getNextNode(), nodeToAdd);
	}

	public void traverse(Node head) {
		System.out.print(head.getData() + " ");
		if (head.getNextNode() != null)
			traverse(head.getNextNode());
	}

}
