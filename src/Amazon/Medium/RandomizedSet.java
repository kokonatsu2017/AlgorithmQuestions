package Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
/**
 * LeetCode 380
 * @author kokonatsudream
 *
 */
public class RandomizedSet {
	private List<Integer> list;
	private Random rand;
	private Map<Integer, Integer> map;
	/** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)){
        	map.put(val, list.size());
        	list.add(val);
        	
        	return true;
        }
        return false;
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
        	int index = map.get(val);
        	map.remove(val);
        	int last = list.size() - 1;
        	if(index != last){
        		list.set(index, list.get(last));
        		map.put(list.get(last), index);
        	}
        	list.remove(last);
        	
        	return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int r = rand.nextInt(list.size());
        return list.get(r);
    }
}
