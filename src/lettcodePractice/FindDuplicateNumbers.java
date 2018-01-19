package lettcodePractice;

import java.util.HashSet;
/**
 * The set S originally contains numbers from 1 to n. 
 * 
 * But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, 
 * which results in repetition of one number and loss of another number.

   Given an array nums representing the data status of this set after the error. 
   Your task is to firstly find the number occurs twice and then find the number that is missing. 
   Return them in the form of an array.
 * 
 *
 */
public class FindDuplicateNumbers {
	public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = (1 + n) * n/2;
        
        HashSet<Integer> numbers = new HashSet<Integer>();
        int duplicate = -1;
        for(int i : nums){
        	if(!numbers.contains(i)){
        		numbers.add(i);
        		sum -= i;
        	} else{
        		duplicate = i;
        	}
        }
        
        return new int[]{duplicate, sum};
    }
}
