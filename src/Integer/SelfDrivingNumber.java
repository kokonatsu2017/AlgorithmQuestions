package Integer;


import java.util.ArrayList;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.
 * 
 *iven a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 */
public class SelfDrivingNumber {
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = left; i <= right; i++){
            if(isValid(i)){
                res.add(i);
            }
        }
        return res;
    }
    public boolean isValid(int i){
        int current = i;
        
        while(current != 0){
            int rem = current % 10;
            if(rem == 0 || i % rem != 0)
                return false;
            current = current / 10;
        }
        return true;
    }
}
