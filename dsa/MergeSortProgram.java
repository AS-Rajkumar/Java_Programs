import java.util.*;

public class MergeSortProgram {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		int arr[] = new int[size]; 
		for(int i = 0; i< size; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		mergeSort(arr, 0, size - 1);
		
		for(int array : arr)
			System.out.print(array + " ");

	}
	
	public static void mergeSort(int[] arr, int left, int right)
	{
		if(left < right)
		{
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	
	public static void merge(int[] arr, int left, int mid, int right)
	{
		int leftArraySize = mid - left + 1;
		int rightArraySize = right - mid;
		
		int leftArray[] = new int[leftArraySize];
		int rightArray[] = new int[rightArraySize];
		
		int i = 0;
		int j = 0;
		int k = left;
		
		for(int x = 0; x<leftArraySize; x++)
		{
			leftArray[x] = arr[left + x];
		}
		
		for(int x = 0; x<rightArraySize; x++)
		{
			rightArray[x] = arr[mid+1+x];
		}
		
		while(i<leftArraySize && j<rightArraySize)
		{
			if(leftArray[i] <= rightArray[j])
			{
				arr[k] = leftArray[i];
				i++;
			}
			else
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<leftArraySize)
		{
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightArraySize)
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
