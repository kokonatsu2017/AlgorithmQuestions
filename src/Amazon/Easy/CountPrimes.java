package Amazon.Easy;
/**
 * LettCode 204
 * @author kokonatsudream
 *
 */
public class CountPrimes {
	public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n + 1];
        int count = 0;
        for(int i = 2; i * i < n; i++){
        	if(!notPrime[i]){
        		count++;
        		for(int j = 2; i * j < n; j++){
        			notPrime[i*j] = true;
        		}
        	}
        }
        
        return count;
        
       
        
    }
}
