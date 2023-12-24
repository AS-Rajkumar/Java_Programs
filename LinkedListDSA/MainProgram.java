package LinkedListDSA;

public class MainProgram {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.Insert(23);
		list.Insert(44);
		list.Insert(26);
		list.Insert(98);
		list.Insert(34);
		list.Insert(65);
		
		list.InsertAtStart(10);
		list.InsertAtStart(11);
		list.InsertAtStart(12);
		list.InsertAtStart(13);
		list.InsertAtStart(14);
		
		list.Remove(0);
		
		list.printList();
		

	}

}
