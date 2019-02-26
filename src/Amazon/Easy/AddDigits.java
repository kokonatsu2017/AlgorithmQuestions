package Amazon.Easy;
/**
 * LeetCode 258
 * @author kokonatsudream
 *
 */
public class AddDigits {
	public int addDigits(int num) {
		int current = num;
        while(current >= 10){
        	int sum = 0;
        	while(current >= 10){
        		sum += current % 10;
        		current /= 10;
        	}
            sum += current;
        	current = sum;
        }
        
        return current;
    }
}
