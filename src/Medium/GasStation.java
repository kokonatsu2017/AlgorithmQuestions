package Medium;
/**
 * LeetCode 134
 * @author kokonatsudream
 *
 */
public class GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasLeft = 0;
        int tank = 0;
        int start = 0;
        
        for(int i = 0; i < gas.length; i++){
        	gasLeft += gas[i] - cost[i];
        	tank += gas[i] - cost[i];
        	
        	if(tank < 0){
        		start = i + 1;
        		tank = 0;
        	}
        }
        
        if(gasLeft < 0){
        	return -1;
        } else {
        	return start;
        }
        
        
    }
}
