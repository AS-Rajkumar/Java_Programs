public class LinkedList {
	
	public Node head;
	int length;

	public LinkedList()
	{
		this.head = null;
		this.length = 0;
	}

	public int getLength()
	{
		return length;
	}

	public int getHead()
	{
		return head.getData();
	}

	public Node mergeSort(Node headNode)
	{
		if(headNode == null || headNode.getNextNode() == null)
		{
			return headNode;
		}

		Node middle = getMiddle(headNode);
		Node nextOfMiddle = middle.getNextNode();

		middle.setNextNode(null);

		Node left = mergeSort(headNode);

		Node right = mergeSort(nextOfMiddle);
		
		Node SortedList = toSort(left, right);
		return SortedList;

				
	}

	public Node getMiddle(Node headNode)
	{
		if(headNode == null )
			return headNode;

		Node slow = headNode;
		Node fast = headNode;
		
		while(fast.getNextNode() != null && fast.getNextNode().getNextNode() != null)
		{
			
			slow = slow.getNextNode();
			fast = fast.getNextNode().getNextNode();

		}

		return slow;
	}

	public Node toSort(Node left, Node right)
	{
		Node result;

		if(left == null)

			return right;

		else if(right == null)
		
			return left;
		
		else
		{
			if(left.getData() < right.getData())
			{
				result = left;
				result.setNextNode(toSort(left.getNextNode(), right));
			}
			
			else
			{
				result = right;
				result.setNextNode(toSort(left, right.getNextNode()));
			}
		}	
			return result;
				 
		
	}

	public Node lastNode()
	{

		Node currentnode = head;
		while(currentnode.getNextNode() != null)
		{
			currentnode = currentnode.getNextNode();
		}
		return currentnode;

	
	}

	public Node requiredNode(int index)
	{

		Node currentnode = head;
		
		while(index > 1 & currentnode.getNextNode() != null)
		{
			currentnode = currentnode.getNextNode();
			index--;
		}

		return currentnode;
	
	}
	
	public int Insert(int data)
	{
		Node node = new Node(data);
		
		if(head == null)
		{
			head = node;
			length++;

			return 1;
		}
		
		Node lastnode = lastNode();

		lastnode.setNextNode(node);
		length++;

	        return 1;
	}
	
	public int InsertAt(int index,int data)
	{
		if(index > length)
		{
			System.out.println("You can up to index: " + length);

			return -1;
		}
		if(index == 0)
		{
			InsertAtStart(data);
			
			return 1;
		}
		
		Node node = new Node(data);
		
		Node requirednode = requiredNode(index);

		node.setNextNode(requirednode.getNextNode());
		requirednode.setNextNode(node);
		
		length++;

		return 1;
	}
	
	public int InsertAtStart(int data) {
		
		Node node = new Node(data);
		
		if(head == null)
		{
			head = node;
			length++;

			return 1;
		}
		
		node.setNextNode(head);
		head = node;
		
		length++;

		return 1;
	}
	
	public int Remove(int index)
	{
		if(index >= length)
		{
			System.out.println("You can delete upto index: " + (length - 1));

			return -1;
		}
		if(index == 0)
		{
			head = head.next;
			length--;

			return 1;
		}
		
		Node requirednode = requiredNode(index);

		Node node = requirednode.getNextNode();
		requirednode.setNextNode(node.next);
		
		length--;
		node = null;

		return 1;
	}

	public int printList()
	{
		if(head == null)
		{
			System.out.println("The list is empty");
			return -1;
		}
		Node currentnode = head;

		while(currentnode.getNextNode() != null)
		{
			System.out.print(currentnode.getData() + " ");
			currentnode = currentnode.getNextNode();
		}
		System.out.println(currentnode.getData());
	return 1;
	}

}
