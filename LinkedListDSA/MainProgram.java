import java.util.*;

public class MainProgram {

	static Scanner scan = new Scanner(System.in);
	static LinkedList list = new LinkedList();

	public static void main(String[] args) {

		boolean exit = false;

		while(!exit)
		{
			exit = UserChoice();
		}

	}

	public static boolean UserChoice()
	{
		int userChoice = 0;
		int element = 0;
		int listsize = 0;
		int index = -1;
		
		System.out.println("------------------------------------------------");

			
		System.out.println("press 1 --> To adding initial elements to the linkedlist");
		System.out.println("press 2 --> To insert element at the start of the linkedlist");
		System.out.println("press 3 --> To insert element at the required index of the linkedlist");
		System.out.println("press 4 --> To insert element at the end of the linkedlist");
		System.out.println("press 5 --> To remove element in the linkedlist");
		System.out.println("press 6 --> To show the Linkedlist");
		System.out.println("press 7 --> To get the length of the LinkedList");
		System.out.println("Press 8 --> To sort the given linkedlist");
		System.out.println("Press 9 --> To exit");

		System.out.println("(Note: In this program by default in option 1 elements are add to the tail of the linkedlist)");

		System.out.println("------------------------------------------------");
		
		System.out.print("Enter your choice:");
		userChoice = scan.nextInt();

		switch (userChoice)
		{
				
			case 1:

				System.out.println("Enter the size of the array:");
				listsize = scan.nextInt();
				
				System.out.println("Enter the elements of the list");

				for(int i = 0; i < listsize; i++)
				{
					element = scan.nextInt();
					list.Insert(element);
				}	
					
				break;
				
			case 2:
				System.out.print("Enter the element: ");
				element = scan.nextInt();

				list.InsertAtStart(element);

				break;

			case 3:
				System.out.print("Enter the element:");
				element = scan.nextInt();
				
				System.out.println("You can add up to the index: " + list.getLength());

				System.out.print("Enter the index:");
				index = scan.nextInt();

				list.InsertAt(index, element);

				break;

			case 4:
				System.out.print("Enter the Element:");
				element = scan.nextInt();

				list.Insert(element);

				break;

			case 5:
				System.out.println("You can delete up to index: " + (list.getLength() - 1));

				System.out.print("Enter the index :");
				index = scan.nextInt();

				list.Remove(index);

				break;

			case 6:
				list.printList();
				break;

			case 7:
				System.out.println("Length of ths list:" + list.getLength());
				break;

			case 8:
				list.head = list.mergeSort(list.head);
				list.printList();
				break;
			
			case 9:
				System.out.println("------------------!!Exit the Program!!-----------------");
				return true;

			default:
				System.out.println("Invalid Option");
				break;
			}
		return false;

	}
}
