package tree;

public class TestMyTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Tree myTree=new Tree();
		myTree.add(40);
		myTree.add(20);
		myTree.add(80);
		myTree.add(10);
		myTree.add(30);
		myTree.add(5);
		myTree.add(15);
		System.out.println("Pre Order Traversal");
		myTree.traversePreOrder(myTree.root);
		System.out.println("");
		System.out.println("In Order Traversal");
		myTree.traverseInOrder(myTree.root);
		System.out.println("");
		
		System.out.println("Post Order Traversal");
		myTree.traversePostOrder(myTree.root);
		System.out.println("");
		
		
	}

}
