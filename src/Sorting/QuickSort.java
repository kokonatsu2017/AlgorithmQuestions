package Sorting;

/**
 *  QuickSort is a Divide and Conquer algorithm. 
 *  It picks an element as pivot and partitions the given array around the picked pivot. 
 * 
 * O(nlogn) to O(n^2)
 */
public class QuickSort {
	public void sort(int arr[], int low, int high ){
		if(low < high){
			int p = partition(arr, low, high);
			
			sort(arr, low, p - 1);
			sort(arr, p + 1, high);
		}
	}
	
	public int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++){
			if(arr[j] <= pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//Put pivot at the end of the array
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i + 1;
	}
}
