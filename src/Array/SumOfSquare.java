package Array;


/**
 * Given a non-negative integer c, 
 * your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 * 
 *
 */
public class SumOfSquare {
	public boolean judgeSquareSum(int c) {
		int left = 1;
		int right = (int) Math.sqrt(c);
		
		while(right >= left){
			int val = right * right + left * left;
			
			if(val < c){
				left++;
			} else if(val > c){
				right--;
			} else {
				return true;
			}
		}
        
		return false;
    }
}
