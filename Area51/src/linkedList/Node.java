package linkedList;

public class Node {

	private int data;
	private Node nextNode;
	
	
	
	public Node(int data)
	{
		this.data=data;
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
	 * @return the nextNode
	 */
	public Node getNextNode() {
		return nextNode;
	}



	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
	
	
	
	
	
	
}
