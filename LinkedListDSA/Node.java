public class Node {
	
	int data;
	Node next;

	public Node(int data){

		this.data = data;
		this.next = null;
		
	}

	public void setData(int Data)
	{
		this.data = Data;
	}

	public int getData()
	{
		return data;
	}

	public void setNextNode(Node Next)
	{
		this.next = Next;
	}

	public Node getNextNode()
	{
		return next;

	}
}
