package Sorting;

/**
 * Bubble Sort is the simplest sorting algorithm that works 
 * by repeatedly swapping the adjacent elements if they are in wrong order.
 * O(n^2)
 *
 */
public class BubbleSort {
	
	public void sort(int arr[]){
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++){
			for(int j = 0; j < n - i -1; j++){
				if(arr[j] > arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}
