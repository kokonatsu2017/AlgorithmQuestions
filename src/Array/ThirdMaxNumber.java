package Array;
/**
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 * @author Kerry
 *
 */
public class ThirdMaxNumber {
	 public int thirdMax(int[] nums) {
	       long fMax = Long.MIN_VALUE;
	       long sMax = Long.MIN_VALUE;
	       long tMax = Long.MIN_VALUE;
	       
	       for(int num : nums) {
	    	   if(num > fMax) {
	    		   tMax = sMax;
	    		   sMax = fMax;
	    		   fMax = num;
	    	   } else if(fMax > num && num > sMax) {
	    		   tMax = sMax;
	    		   sMax = num;
	    	   } else if(sMax > num && num > tMax) {
	    		   tMax = num;
	    	   }
	       }
	       
	       return tMax == Long.MIN_VALUE ? (int)fMax : (int)tMax;
	 }
}
