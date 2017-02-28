package tree;

public class Tree {

	Node root;

	public void add(int data) {
		Node nodeToAdd = new Node(data);
		if (root == null) {
			root = nodeToAdd;
			return;
		}

		Node traversingNode = root;

		traverseAndAdd(traversingNode, nodeToAdd);

	}

	public void traverseAndAdd(Node node, Node nodeToAdd) {
		if (nodeToAdd.getData() < node.getData()) {
			if (node.getLeftChild() == null) {
				node.setLeftChild(nodeToAdd);
			} else {
				traverseAndAdd(node.getLeftChild(), nodeToAdd);
			}

		} else if (nodeToAdd.getData() > node.getData()) {
			if (node.getRightChild() == null) {
				node.setRightChild(nodeToAdd);
			} else {
				traverseAndAdd(node.getRightChild(), nodeToAdd);
			}

		} else {
			traverseAndAdd(node.getRightChild(), nodeToAdd);
		}

	}

	public void traverseInOrder(Node root) {
		if (root.getLeftChild() != null)
			traverseInOrder(root.getLeftChild());

		System.out.print(root.getData() + " ");

		if (root.getRightChild() != null)
			traverseInOrder(root.getRightChild());
	}

	public void traversePreOrder(Node root) {
		System.out.print(root.getData() + " ");

		if (root.getLeftChild() != null)
			traversePreOrder(root.getLeftChild());
		if (root.getRightChild() != null)
			traversePreOrder(root.getRightChild());
	}

	public void traversePostOrder(Node root) {
		if (root.getLeftChild() != null)
			traversePostOrder(root.getLeftChild());

		if (root.getRightChild() != null)
			traversePostOrder(root.getRightChild());

		System.out.print(root.getData() + " ");

	}
	
	
	public void breadthFirstTraverse(Node root)
	{
	
		System.out.print(root.getData() + " ");
		if(root.getLeftChild()!=null)
		System.out.print(root.getLeftChild().getData() + " ");
		if(root.getRightChild()!=null)
		System.out.print(root.getRightChild().getData() + " ");
		
		
		

	}
	
	
	
	
	

}
