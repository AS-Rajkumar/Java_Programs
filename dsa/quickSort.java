import java.util.*;

public class quickSort {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// calling the userInput() method
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
		{
			quickSortAsc(nums, 0, nums.length-1);
		}

		else
		{
			quickSortDesc(nums, 0, nums.length-1);
		}
			
		printArray(nums, size);
		
		return 0;
	} 
	
	private static void quickSortDesc(int[] nums, int low, int high) {
				
		if(low < high)
		{
			int pivot = partitionDesc(nums, low, high);
			quickSortDesc(nums, low, pivot - 1);
			quickSortDesc(nums, pivot + 1, high);
		}
		
	}

	private static int partitionDesc(int[] nums, int low, int high) {
		
		int pivot = nums[high];
		int i = low - 1;
		
		for(int j=low; j<high; j++)
		{
			if(nums[j] > pivot)
			{
				i = i + 1;
				swap(nums, i, j);
			}
		}
		
		swap(nums, i+1, high);
		
		return i + 1;
		
	}

	private static void quickSortAsc(int[] nums, int low, int high) {
		
		if(low < high)
		{
			int pivot = partitionAsc(nums, low, high);
			quickSortAsc(nums, low, pivot - 1);
			quickSortAsc(nums, pivot + 1, high);
		}
		
	}

	private static int partitionAsc(int[] nums, int low, int high) {
		int pivot = nums[high];
		int i = low - 1;
		
		for(int j=low; j<high; j++)
		{
			if(nums[j] < pivot)
			{
				i = i + 1;
				swap(nums, i, j);
			}
		}
		
		swap(nums, i+1, high);
		
		return i + 1;
	
	}

	public static void swap(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
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
