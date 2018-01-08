package lettcodePractice;

import java.util.ArrayList;
import java.util.List;

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
