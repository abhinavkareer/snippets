package tree;

class Node {
	private int data;
	private Node leftChild;
	private Node rightChild;
	
	
	
	
	public Node(int data) {
		super();
		this.data = data;
	}
	
	
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the leftChild
	 */
	public Node getLeftChild() {
		return leftChild;
	}
	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	/**
	 * @return the rightChild
	 */
	public Node getRightChild() {
		return rightChild;
	}
	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	
	
	
	
}
