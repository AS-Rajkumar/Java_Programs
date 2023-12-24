package LinkedListDSA;

public class LinkedList {
	
	Node head;
	
	public int Insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null)
		{
			head = node;
			return 1;
		}
		
		Node currentnode = head;
		while(currentnode.next != null)
		{
			currentnode = currentnode.next;
		}
		currentnode.next = node;
		return 1;
	}
	
	public int InsertAt(int index,int data)
	{
		if(index == 0)
		{
			InsertAtStart(data);
			return 1;
		}
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node currentnode = head;
		
		while(index > 1 & currentnode.next != null)
		{
			currentnode = currentnode.next;
			index--;
		}
		
		node.next = currentnode.next;
		currentnode.next = node;
		
		return 1;
	}
	
	public int InsertAtStart(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null)
		{
			head = node;
			return 1;
		}
		
		node.next = head;
		head = node;
		
		return 1;
	}
	
	public int Remove(int index)
	{
		if(index == 0)
		{
			head = head.next;
			return 1;
		}
		Node currentnode = head;
		while(index > 1 )
		{
			currentnode = currentnode.next;
			index--;
		}
		Node node = currentnode.next;
		currentnode.next = node.next;
		
		node = null;
		return 1;
	}

	public void printList()
	{
		Node currentnode = head;
		while(currentnode.next != null)
		{
			System.out.println(currentnode.data);
			currentnode = currentnode.next;
		}
		System.out.println(currentnode.data);
	}

}
