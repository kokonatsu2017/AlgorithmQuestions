package Integer;

public class RotateFunction {
	public int maxRotateFunction(int[] A) {
		int len = A.length;
		int max = 0;
		int count = 0;
		int totalSum = 0;
		for(int i = 0; i < len; i++) {
			totalSum += A[i];
			count += i * A[i];
		}
		
		max = count;
		
		for(int i = len - 1; i > 0; i--) {
			count = count + totalSum - len * A[i];
			max = Math.max(count, max);
		}
		return max;
    }
}
