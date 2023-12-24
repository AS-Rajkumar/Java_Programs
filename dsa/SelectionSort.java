import java.util.Scanner;

/*better then bubble sort in terms of swapping but not efficient
 * Same as bubble sort but less swapping
 * 
 * Time complexity:
 * 		Best case:
 * 			 In the best case the array of "n" element which is already sorted
 * 			 so we only needed to check the array if it is sorted or not
 * 			 Time complexity is O(n)
 * 			 But remember best case is only checking if it is sorted or not
 * 			 it is not entering the Selection sort even if we gave sorted array\
 * 			 to the Selection sort the time is sill O(n^2)
 * 		worst case:
 * 			 In the worst case where array of "n" element is not sorted
 * 			 So we have to perform n-1 iteration and also traverse the array of size n
 * 			 Time complexity is O(n^2)
 * 
 * Algorithms:
 * 		In an unsorted array find the minimum or maximum element move it to the 
 * 		right or left side of the array according to the preferred order (asc or desc)
 * 		
 * 		let's say we want to find the smallest number and sort to ascending order
 * 
 *  	In this case we find minimum number and swap it to the beginning of the array
 *  	that way we can say that left most is sorted remaining is unsorted
 *  	again find the minimum in unsorted array and swap it to the left
 *  	that way we can get the sorted array of the ascending order
 * 		
 * */
public class SelectionSort {
	
	//global Scanner for taking the input from all the method in the class
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		userInput();

	}
	
	public static int userInput()
	{
		/*
		 * This method is used to get the input from the user and also to make
		 * choice whether user wants to sort ascending or descending
		*/
		int size = 0;//size variable to get the size of the array
		int nums[];  //array for storing the elements
		int choice = 0;//variable to store the user choice
		
		System.out.print("Enter the Size of the array: ");
		size = scan.nextInt();//getting the size of the array
		
		nums = new int[size];//assign size to array"nums"
		
		//loop to the elements and store it in the array nums
		for(int i=0; i<size;i++)
		{
			nums[i] = scan.nextInt();
		}
		
		System.out.println("Press 1 for Ascending:\nPress 2 for Descending:\n");
		choice = scan.nextInt();//getting the user choice
		
		//calling sorting method with respect to the choices
		// 1 --> Ascending
		// 2 --> Descending
		if(choice == 1)
			selectionSortAsc(nums, size);
		else
			selectionSortDesc(nums, size);
		
		return 0;
	}

	public static int selectionSortAsc(int[] nums, int size) {
		
		/*
		 * Method to perdorm Selection sort in Descending order
		 * */
		
		int temp = 0;//temporary variable for swaping
		int minIndex = -1;//variable to store the minimum value index number
		
		//condition to check if the array is sorted or not
		if(isSortedAsc(nums, size))
		{
			System.out.println("The array is already sorted");
			return 0;
		}
		
		System.out.println("-------------------------------------");
		System.out.println("before Sorting:");
		printArray(nums, size);//calling printArray() method for printing the unsorted array
		
		System.out.println("-------------------------------------");
		System.out.println("Each Iteration:");
		
		//Outer loop for iteration
		for(int i=0; i<size-1; i++)
		{
			minIndex = i;//everyiteration we only swapping one element which means
						 //so every iteration stating point of the unsorted array
						 //must be i so we assume first element is smallest at the start 
			
			//Inner loop for the traversal of the loop
			for(int j=i+1; j<size; j++)
			{
				//condition to find the smallest value form the unsorted array
				if(nums[minIndex] > nums[j])
					minIndex = j;
			}
			//After it to the left side which is sorted side of the array
			temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
			
			printArray(nums, size);//method to print the array
		}
		
		System.out.println("-------------------------------------");
		System.out.println("After Sorting:");
		printArray(nums, size);//printing the array after sorting is done
		
		return 0;
	}

	public static int selectionSortDesc(int[] nums, int size) {
		
		/*
		 * Method to perform Selection sort in an Ascending order
		 * */
		
		int temp = 0;//temporary variable for swapping
		int maxIndex = -1;//variable to store the minimum value index number
		
		//condition to check if the array is sorted or not
		if(isSortedDesc(nums, size))
		{
			System.out.println("The array is already sorted");
			return 0;
		}
		
		System.out.println("-------------------------------------");
		System.out.println("before Sorting:");
		printArray(nums, size);//calling printArray() method for printing the unsorted array
		
		System.out.println("-------------------------------------");
		System.out.println("Each Iteration:");
		
		//Outer loop for iteration
		for(int i=0; i<size-1; i++)
		{
			maxIndex = i;//everyiteration we only swapping one element which means
						 //so every iteration stating point of the unsorted array
						 //must be i so we assume first element is largest at the start 
			
			//Inner loop for the traversal of the loop
			for(int j=i+1; j<size; j++)
			{
				//condition to find the greatest value form the unsorted array
				if(nums[maxIndex] < nums[j])
					maxIndex = j;
			}
			//After it to the left side which is sorted side of the array
			temp = nums[maxIndex];
			nums[maxIndex] = nums[i];
			nums[i] = temp;
			
			printArray(nums, size);//method to print the array
		}
		
		System.out.println("-------------------------------------");
		System.out.println("After Sorting:");
		printArray(nums, size);//printing the array after sorting is done
		
		return 0;
		
	}
	
	public static boolean isSortedAsc(int[] arr, int size)
	{
		/*
		 * This method is to check if the given array is already sorted or not
		 * */
		for(int i=0; i<size-1; i++)
			if(arr[i] > arr[i+1])
				return false;
		
		return true;
	}
	
	public static boolean isSortedDesc(int[] arr, int size)
	{
		/*
		 * This method is to check if the given array is already sorted or not
		 * */
		for(int i=0; i<size-1; i++)
			if(arr[i] < arr[i+1])
				return false;
		
		return true;
	}
	
	public static void printArray(int[] nums, int size)
	{
		/*
		 * This method is to print the array */
		
		for(int num : nums)
			System.out.print(num + " ");

		System.out.println();
		
	}

}
