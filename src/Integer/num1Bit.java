package Integer;

public class num1Bit {
	/**
	 * Write a function that takes an unsigned integer and 
	 * returns the number of ?1' bits it has
	 * @param n
	 * @return
	 */
	 public int hammingWeight(int n) {
	        int res = 0;
	        while(n != 0){
	            if((n &1) == 1)
	                res++;
	            n >>>= 1;
	        }
	        return res;
	    }
}
