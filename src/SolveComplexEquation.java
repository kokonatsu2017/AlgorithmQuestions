/**
 * Given two strings representing two complex numbers.

You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 * @author kokonatsudream
 *
 */
public class SolveComplexEquation {
	 public String complexNumberMultiply(String a, String b) {
		 
		 int[] valA = getNums(a);
		 int[] valB = getNums(b);
		 
		 
		 
		 int integer = valA[0] * valB[0];
		 int ii = valA[1] * valB[1];
		 int i = valA[0] * valB[1] + valA[1] * valB[0];
		
		 integer = integer - ii;
		 
		 return String.format("%d+%di", integer, ii);
	        
	 }
	 
	 public int[] getNums(String s) {
		 int[] res = new int[2];
		 
		 int num = Integer.valueOf(s.substring(0, s.indexOf("+")));
		 int complex = Integer.valueOf(s.substring(s.indexOf("+") + 1, s.length() -1));
		 
		 res[0] = num;
		 res[1] = complex;
		 
		 return res;
	 }
}
