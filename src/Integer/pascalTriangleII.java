package Integer;


import java.util.ArrayList;
import java.util.List;

public class pascalTriangleII {
	/**
	 * Given an index k, return the kth row of the Pascal's triangle.

		For example, given k = 3,
		Return [1,3,3,1].	
	 * @param rowIndex
	 * @return
	 */
	 public List<Integer> getRow(int rowIndex) {
	        List<Integer> list = new ArrayList<Integer>();
	        
	        list.add(1);
	        for(int row = 1; row <= rowIndex; row++){
	        	for(int column = row -1; column >= 1; column--){
	        		int tmp = list.get(column) + list.get(column - 1);
	        		list.set(column, tmp);
	        	}
	        	list.add(1);
	        }
	        return list;
	    }
}
