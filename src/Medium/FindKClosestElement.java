package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * LeetCode 658
 * @author kokonatsudream
 *
 */
public class FindKClosestElement {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int smaller = 0;
		int larger = 0;
		
		List<Integer> res = new ArrayList<>();
		
        while(arr[larger] < x){
        	larger++;
        }
        if(larger != 0){
        	smaller = larger - 1;
        	
        	while(k > 0 && smaller >= 0 && larger < arr.length){
        		if(Math.abs(arr[smaller] - x) <= Math.abs(arr[larger] - x)){
        			res.add(arr[smaller]);
        			smaller--;
        		} else {
        			res.add(arr[larger]);
        			larger++;
        		}
                k--;
        	}
        	if(smaller < 0){
        		while(k > 0){
        			res.add(arr[larger]);
        			larger++;
        			k--;
        		}
        	} else if(larger >= arr.length){
        		while(k > 0){
        			res.add(arr[smaller]);
        			smaller--;
        			k--;
        		}
        	}
        	Collections.sort(res);
        } else {
        	for(int i = 0; i < k; i++){
        		res.add(arr[i]);
        	}
        }
        
        return res;
    }
	
}
