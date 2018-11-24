package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * LeetCode 346
 * 
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

	Example:
	
	MovingAverage m = new MovingAverage(3);
	m.next(1) = 1
	m.next(10) = (1 + 10) / 2
	m.next(3) = (1 + 10 + 3) / 3
	m.next(5) = (10 + 3 + 5) / 3
 * @author kokonatsudream
 *
 */
public class MovingAverage {
	List<Integer> list;
	int size = 0;
	public MovingAverage(int size) {
        list = new ArrayList<Integer>();
        this.size = size;
    }
    
    public double next(int val) {
        if(list.size() == size){
        	list.remove(0);
        }
        list.add(val);
        
        int sum = 0;
        for(int num: list){
        	sum += num;
        }
        
        return sum * 1.0 / list.size();
    }
}
