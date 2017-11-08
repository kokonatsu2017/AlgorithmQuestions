import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InsertDeleteGetRandmO1 {
	
	class RandomizedSet {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		
	    /** Initialize your data structure here. */
	    public RandomizedSet() {
	        
	    }
	    
	    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	    public boolean insert(int val) {
	        if(map.containsKey(val)) {
	        	return false;
	        } else {
	        	map.put(val, list.size());
	        	list.add(val);
	        	return true;
	        }
	    }
	    
	    /** Removes a value from the set. Returns true if the set contained the specified element. */
	    public boolean remove(int val) {
	        if(!map.containsKey(val)) {
	        	return false;
	        } else {
	        	int i = map.remove(val);
	        	int last = list.remove(list.size() - 1);
	        	
	        	if(val != last) {
	        		list.set(i, last);
	        		map.put(last, i);
	        	}
	        	return true;
	        }
	    }
	    
	    /** Get a random element from the set. */
	    public int getRandom() {
	        return list.get(r.nextInt(list.size()));
	    }
	}
}
