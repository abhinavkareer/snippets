package maxHeap;



public class MaxHeap {

	Node root;
	
	public void add(int data)
	{
		Node nodeToAdd = new Node(data);	
		
		if(root==null)
		{
			root=nodeToAdd;
			return;
		}
		Node traversingNode=root;
		traverseAndAdd(traversingNode,nodeToAdd);
		
		
	}
	
	public void traverseAndAdd(Node traversingNode,Node nodeToAdd)
	{
	
		if(traversingNode.getData()<nodeToAdd.getData())
		{
			int temp=traversingNode.getData();
			traversingNode.setData(nodeToAdd.getData());
			nodeToAdd.setData(temp);
			traverseAndAdd(traversingNode, nodeToAdd);
		}
		
		if(traversingNode.getLeftNode()==null)
		{
			traversingNode.setLeftNode(nodeToAdd);
		}
		else if(traversingNode.getRightNode()==null)
		{
			traversingNode.setLeftNode(nodeToAdd);

		}	
		
	}
	
}
