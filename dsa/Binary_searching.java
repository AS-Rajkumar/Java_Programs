package dsa;

public class Binary_searching {

	public static void main(String[] args) {
		
		int nums[] = {5,7,9,11,13};
		int target = 0;
		
		int result = binarySearchWithRecursive(nums, target, 0, nums.length - 1);
		
		if(result != -1) 
			System.out.println("Element is found at index :" + result);
		
		else 
			System.out.println("Element not found");
		
	}

	public static int linearSearch(int[] nums, int target) {
		
		for(int i = 0; i < nums.length; i++ ) {
			if(nums[i] == target)
				return i;
		}
		
		return -1;
	}
	
	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right) {
			int mid = (left + right)/2;
			
			if(nums[mid] == target) 
				return mid;
			
			else if(nums[mid] < target) 
				left = mid + 1;
			
			else 
				right = mid - 1;
		}
		return -1;
	}
	
	public static int binarySearchWithRecursive(int[] nums, int target, int left, int right) {
		
		int mid = (left + right) / 2;
		
		if(left <= right) {
			if(nums[mid] == target) 
				return mid;
			
			else if(nums[mid] < target) 
				return binarySearchWithRecursive(nums, target, mid + 1, right);
				
			else 
				return binarySearchWithRecursive(nums, target, left, mid - 1);
		}
		return -1;

	
	}

}
