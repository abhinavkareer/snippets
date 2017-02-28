package linkedList;

public class TestMyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList myLL=new LinkedList();
		
		myLL.insertAtStart(5);
		myLL.insertAtStart(4);
		myLL.insertAtStart(3);
		myLL.insertAtStart(2);
		myLL.insertAtStart(1);
		
		
		myLL.traverse(myLL.head);
		
	}

}
