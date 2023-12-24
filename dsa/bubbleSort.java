import java.util.*;
/*
 * not efficient but simple to understand
 * Time complexity:
 * 		Best case:
 * 			 In the best case the array of "n" element which is already sorted
 * 			 so we only needed to check the array if it is sorted or not
 * 			 Time complexity is O(n)
 * 			 But remember best case is only checking if it is sorted or not
 * 			 it is not entering the bubble sort even if we gave sorted array\
 * 			 to the bubble sort the time is sill O(n^2)
 * 		worst case:
 * 			 In the worst case where array of "n" element is not sorted
 * 			 So we have to perform n-1 iteration and also traverse the array of size n
 * 			 Time complexity is O(n^2)
 * 
 * Algorithm:
 * 		Traverse the entire array at the same time compare the adjacent the 
 * 		element of the array, greater vales are swapped to the right if ascending or 
 * 		greater values are swapped to the left
 * 		again perform traverse the entire array until the array is sorted
 * */
public class bubbleSort {
	//global Scanner for taking the input from all the method in the class
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// calling the userInput() method
		userInput(); 
		
	}
	
	public static int userInput()
	{
		/*
		 * This method is used to get the input from the user and alsoto make
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
			bubbleSortAsc(nums, size);
		else
			bubbleSortDesc(nums, size);
		
		return 0;
	}
	
	public static int bubbleSortDesc(int[] nums, int size) {
		/*
		 * This method has code for bubble sort algorithm for 
		 * descending order
		*/
		int temp = 0;//temporary variable for swaping
		
		//condition to check if the array is already sorted or not
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
		
		
		//outer loop for to perform the iteration until the entire array is sorted
		for(int i = 0; i < size; i++)
			{
				//inner loop is for to traverse the array from left to right
				for(int j = 0; j < size - i -  1; j++) 
				{
					//condition for comparing the adjacent element and perform swapping 
					//in a way that the greater value should be in the left side of the array
					if(nums[j] < nums[j + 1])
					{
						temp = nums[j];
						nums[j] = nums[j + 1];
						nums[j + 1] = temp;
					}
				}
				printArray(nums, size);//printing the array for each iteration to see the process
			}
		System.out.println("-------------------------------------");
		System.out.println("After Sorting:");
		printArray(nums, size);//printing the array after sorting is done
		
		return 0;
		
	}

	public static int bubbleSortAsc(int[] nums, int size) {
		
		/*
		 * This method has code for bubble sort algorithm for 
		 * Ascending order
		*/
		int temp = 0;//temporary variable for swapping
		
		//condition to check if the array is already sorted or not
		if(isSortedAsc(nums, size) == true)
		{
			System.out.println("The array is already sorted");
			return 0;
		}
					
		System.out.println("-------------------------------------");
		System.out.println("before Sorting:");
		printArray(nums, size);//calling printArray() method for printing the unsorted array
				
		System.out.println("-------------------------------------");
		System.out.println("Each Iteration:");
		
		//outer loop for to perform the iteration until the entire array is sorted
		for(int i = 0; i < size; i++)
			{
				//inner loop is for to traverse the array from left to right
				for(int j = 0; j < size - i -  1; j++) 
				{
					//condition for comparing the adjacent element and perform swapping 
					//in a way that the greater value should be in the right side of the array
					if(nums[j] > nums[j + 1])
					{
						temp = nums[j];
						nums[j] = nums[j + 1];
						nums[j + 1] = temp;
					}
				}
				printArray(nums, size);//printing the array for each iteration to see the process
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
		{
			if(arr[i] > arr[i+1])
				return false;
		}
		
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
