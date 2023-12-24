package dsa;

import java.util.*;

/*
 * Time complexity:
 * 		best case --> O(n)
 * 			In this case we gave an already sorted array which means 
 * 			inner loop while condition will never be true
 * 		worst case --> O(n^2)
 * 
 * Algorithm:
 * 		To sort an array of size N in an ascending order iterate oven the array
 * 		and compare the key to its predecessor if the key is smaller then move the 
 * 		predecessor to the key index and comapare the key to the new predecessor
 * */

public class InsertionSort {
	
	//global Scanner for taking the input from all the method in the class
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
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
			insertionSortAsc(nums, size);
		else
			insertionSortDesc(nums, size);
		
		return 0;
	}

	public static int insertionSortDesc(int[] nums, int size) {
		
		int key = -1;
		
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
		
		//Out loop for iteration
		for(int i=1; i<size; i++)
		{
			key = nums[i];
			int j = i-1;
			//condition to compare the key to its predecessor
			while(j >= 0 && nums[j] < key)
			{
				nums[j+1] = nums[j];
				j = j - 1;
			}
			nums[j+1] = key;
			
			printArray(nums, size);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("After Sorting:");
		printArray(nums, size);//printing the array after sorting is done
		
		return 0;
		
	}

	public static int insertionSortAsc(int[] nums, int size) {
		
int key = -1;
		
		//condition to check if the array is already sorted or not
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
		
		//Out loop for iteration
		for(int i=1; i<size; i++)
		{
			key = nums[i];
			int j = i-1;
			//condition to compare the key to its predecessor
			while(j >= 0 && nums[j] > key)
			{
				nums[j+1] = nums[j];
				j = j - 1;
			}
			nums[j+1] = key;
			
			printArray(nums, size);
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
