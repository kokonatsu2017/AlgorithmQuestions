package Easy;
/**
 * LeetCode 762
 * @author kokonatsudream
 *
 */
public class PrimeNumberOfSetBits {
	public int countPrimeSetBits(int L, int R) {
        int count = 0;
        
        for(int i = L; i <= R; i++){
        	int bits = Integer.bitCount(i);
        	if(isPrime(bits)){
        		count++;
        	}
        }
        return count;
    }
	
	public boolean isPrime(int n){
		if(n <= 1) return false;
		
		for(int i = 2; i <= n/2; i++){
			if(n % i == 0){
				return false;
			}
		}
		
		return true;
	}
}
