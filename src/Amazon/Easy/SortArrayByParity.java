package Easy;
/**
 * LeetCode 922
 * @author kokonatsudream
 *
 */
public class SortArrayByParity {
	public int[] sortArrayByParityII(int[] A) {
		int even = 0;
		int odd = 1;
		
		int[] res = new int[A.length];
		
        for(int i = 0; i < A.length; i++){
        	if(A[i] % 2 == 0){
        		res[even] = A[i];
        		even += 2;
        	} else {
        		res[odd] = A[i];
        		odd += 2;
        	}
        }
        
        return res;
    }
}
