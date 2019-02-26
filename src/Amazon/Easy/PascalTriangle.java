package Easy;

import java.util.ArrayList;
import java.util.List;
/**
 * LettCode 119
 * @author kokonatsudream
 *
 */
public class PascalTriangle {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        
        if(rowIndex == 0){
        	return row;
        }
        
        int currRow = 1;
        int currIndex = 0;
        int preVal = 1;
        
        while(row.size() <= rowIndex){
        	if(currIndex + 1 == currRow){
        		row.add(1);
        		currIndex = 0;
        		currRow++;
        		preVal = 1;
        	} else {
        		int tmp = row.get(currIndex + 1);
        		row.set(currIndex + 1, row.get(currIndex + 1) + preVal);
        		preVal = tmp;
        		currIndex++;
        	}
        }
        return row;  
    }
}
