package dsa;

public class test {

	public static void main(String[] args) {
		
		int nums[] = {1, 2, 3, 4, 5};
		
		swap(nums, 1, 2);
		
		for(int num : nums)
		{
			System.out.print(num + "");
		}

	}
	
	public static void swap(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
	}

}
