package Easy;
/**
 * LeetCode 860
 * @author kokonatsudream
 *
 */
public class LemonadeChange {
	public boolean lemonadeChange(int[] bills) {
		int[] money = new int[2];
        for(int i = 0; i < bills.length; i++){
        	
        	int total = bills[i];
        	
        	switch(total){
        	case 5:
        		money[0]++;
        		break;
        	case 10:
        		if(money[0] == 0) return false;
        		money[0]--;
        		money[1]++;
        		break;
        	case 20:
        		if(money[1] >= 1){
        			money[1]--;
        			if(money[0] >= 1){
        				money[0]--;
        			} else {
        				return false;
        			}
        		} else if(money[0] >= 3){
        			money[0] -= 3;
        		} else {
        			return false;
        		}
        		break;
        	}
        }
        return true;
    }
}
