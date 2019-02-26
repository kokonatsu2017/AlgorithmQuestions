package Amazon.Easy;
/**
 * LettCode 657
 * @author kokonatsudream
 *
 */
public class RobotReturnToOrigin {
	public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        
        for(int i = 0; i < moves.length(); i++){
        	switch(moves.charAt(i)){
        		case 'U':
        			vertical++;
        			break;
        		case 'D':
        			vertical--;
        			break;
        		case 'L':
        			horizontal--;
        			break;
        		case 'R':
        			horizontal++;
        			break;
        	}
        }
        
        return horizontal == 0 && vertical == 0;
    }
}
