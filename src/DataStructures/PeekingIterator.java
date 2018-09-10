package DataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Given an Iterator class interface with methods: next() and hasNext(), design and implement a PeekingIterator that support the peek() operation -- it essentially peek() at the element that will be returned by the next call to next().

Example:

Assume that the iterator is initialized to the beginning of the list: [1,2,3].

Call next() gets you 1, the first element in the list.
Now you call peek() and it returns 2, the next element. Calling next() after that still return 2. 
You call next() the final time and it returns 3, the last element. 
Calling hasNext() after that should return false.
 * @author kokonatsudream
 *
 */
public class PeekingIterator implements Iterator<Integer> {
	
	private List<Integer> list; 
	int current = 0;
	
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    list = new ArrayList<>();
	    while(iterator.hasNext()) {
	    	list.add(iterator.next());
	    }
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return list.get(current);
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int num = list.get(current);
	    current++;
	    
	    return num;
	}

	@Override
	public boolean hasNext() {
	    return current < list.size();
	}
}
