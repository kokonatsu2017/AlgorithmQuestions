package Sorting;
/**
 * If r > l
 * 	 1. Find the middle point to divide the array into two halves:  
             middle m = (l+r)/2     
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)   
 * 
 * O(nlogn)
 *
 */
public class MergeSort {
	public void sort(int arr[], int l, int r){
		if(l < r){
			int m = (l + r) /2;
			
			sort(arr, l, m);
			sort(arr, m + 1, r);
			
			merge(arr, l, m, r);
		}
	}
	public void merge(int arr[], int l, int m, int r){
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0; i < n1; i++){
			L[i] = arr[l + i];
		}
		for(int j = 0; j < n2; j++){
			R[j] = arr[m + 1 + j];
		}
		
		int i = 0, j = 0;
		
		int k = l;
		//Merge arrays
		while(i < n1 && j < n2){
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			} else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i < n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k] = R[j];
			j++;
			k++;
		}
		
	} 
}
