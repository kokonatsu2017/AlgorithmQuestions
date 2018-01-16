package Sorting;
/**
 * Search a sorted array by repeatedly dividing the search interval in half.
 *  
 * Begin with an interval covering the whole array. 
 * If the value of the search key is less than the item in the middle of the interval, 
 * narrow the interval to the lower half. Otherwise narrow it to the upper half. 
 * 
 * Repeatedly check until the value is found or the interval is empty.
 * 
 * 
 *
 */
public class BinarySearch {
	
	public int binarySearch(int arr[], int l, int r, int x){
		if(l <= r){
			int mid = (l +r)/2;
			
			if(arr[mid] == x) return mid;
			
			if(arr[mid] > x) return binarySearch(arr, l, mid - 1, x);
			else return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}
}
