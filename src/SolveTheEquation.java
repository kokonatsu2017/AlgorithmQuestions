/**
 * Solve a given equation and return the value of x in the form of string "x=#value". The equation contains only '+', '-' operation, the variable x and its coefficient.

If there is no solution for the equation, return "No solution".

If there are infinite solutions for the equation, return "Infinite solutions".

If there is exactly one solution for the equation, we ensure that the value of x is an integer.
 * @author kokonatsudream
 *
 */
public class SolveTheEquation {
	public String solveEquation(String equation) {
		int totalCoeff = 0;
		int totalConstant = 0;
		
		int currNum = 0;
		boolean afterNum = false;
		int sign = 1;
		int beforeEqual = 1;
		
		for(char c: equation.toCharArray()) {
			if(c >= '0' && c <= '9') {
				currNum = currNum * 10 + ( c - '0');
				afterNum = true;
			} else if(c == 'x'){
				if(!afterNum) {
					currNum = 1;
				}
				totalCoeff += beforeEqual * sign * currNum;
				currNum = 0;
				afterNum = false;
			} else if (c == '+' || c == '-' || c == '=') {
				totalConstant += beforeEqual * sign * currNum;
				currNum = 0;
				afterNum = false;
				
				if (c == '+') {
                    sign = 1;
                } else if (c == '-') {
                    sign = -1;
                } else if (c == '=') {
                    sign = 1;
                    beforeEqual = -1;
                }
			}
		}
		
		totalConstant += beforeEqual * sign * currNum;
		
		if (totalCoeff == 0 && totalConstant == 0) {
	            return "Infinite solutions";
	    } else if (totalCoeff == 0) {
	            return "No solution";
	    } else {
	            return "x=" + (totalConstant / -totalCoeff);
	    }
    }
}
