package lettcodePractice;

public class CountPrimes {
	/**
	 * Count the number of prime numbers less than a non-negative number, n.
	 * @param n
	 * @return
	 */
	public int countPrimes(int n) {
        int count = 0;
		boolean[] notPrimes = new boolean[n];
		
		for(int i = 2; i < n; i++) {
			if(!notPrimes[i]) {
				count++;
				if(i * i < n) {
					for(int j =2; i * j < n; j++) {
						notPrimes[i * j] = true;
					}
				}
			}
		}
		
		return count;
	
    }
}
