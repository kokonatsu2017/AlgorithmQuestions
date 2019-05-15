package Medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lib.NestedInteger;
/**
 * LeetCode 341
 * @author kokonatsudream
 *
 */
public class NestedIterator implements Iterator<Integer> {
	List<Integer> numbers;
	int current = 0;
	public NestedIterator(List<NestedInteger> nestedList) {
		numbers = new ArrayList<>();
		
		for(int i = 0; i < nestedList.size(); i++){
			getNumber(nestedList.get(i));
		}
        
    }
	
	public void getNumber(NestedInteger nestedInt){
		if(nestedInt.isInteger()){
			numbers.add(nestedInt.getInteger());
		} else {
			List<NestedInteger> list = nestedInt.getList();
			for(int i = 0; i < list.size(); i++){
				getNumber(list.get(i));
			}
		}
	}

    @Override
    public Integer next() {
        int val = numbers.get(current);
        current++;
        return val;
    }

    @Override
    public boolean hasNext() {
        return current < numbers.size();
    }
}
