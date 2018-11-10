package Amazon;
/**
 * LeetCode 640
 * @author kokonatsudream
 *
 */
public class SolveEquation {
	public String solveEquation(String equation) {
	       int totalCoeff = 0;
			int totalConstant = 0;
			
			int currNum = 0;
			boolean afterNum = false;
			int sign = 1;
			int beforeEqual = 1;
			
			for(int i = 0; i < equation.length(); i++){
				char c = equation.charAt(i);
				
				if(c >= '0' && c <= '9'){
					afterNum = true;
					currNum = currNum * 10 + ( c - '0'); 
				} else if(c == 'x'){
					if(!afterNum){
						currNum = 1;
					}
					totalCoeff += beforeEqual * sign * currNum;
					currNum = 0;
					afterNum = false;
				} else if(c == '='){
					totalConstant += beforeEqual * sign * currNum;
					currNum = 0;
					afterNum = false;
					sign = 1;
					beforeEqual = -1;
				} else if(c == '-'){
					totalConstant += beforeEqual * sign * currNum;
					currNum = 0;
					afterNum = false;
					sign = -1;
				} else if(c == '+'){
					totalConstant += beforeEqual * sign * currNum;
					currNum = 0;
					afterNum = false;
					sign = 1;
				}
			}
			totalConstant += beforeEqual * sign * currNum;
	        
	        
	        if(totalCoeff == 0 && totalConstant != 0){
	        	return "No solution";
	        } else if(totalCoeff == 0 && totalConstant == 0) {
	        	return "Infinite solutions";
	        } else {
	        	return "x="+ (-totalConstant/totalCoeff);
	        }
	    }
}
