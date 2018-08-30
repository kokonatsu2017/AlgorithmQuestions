import java.util.HashMap;
import java.util.Map;

/**
 * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

Example 1:

Input: numerator = 1, denominator = 2
Output: "0.5"
Example 2:

Input: numerator = 2, denominator = 1
Output: "2"
Example 3:

Input: numerator = 2, denominator = 3
Output: "0.(6)"
 * @author kokonatsudream
 *
 */
public class FractionRecurringDecimal {
	public String fractionToDecimal(int numerator, int denominator) {
		 if(numerator == 0) return "0";
		 
		 Map<Long, Integer> map = new HashMap<Long, Integer>();
		 StringBuilder sb = new StringBuilder();
		 
		 
		 if( (numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0) ) {
			 sb.append("-");
		 }
        
        long num = Math.abs((long)numerator);
		 long den = Math.abs((long)denominator);
		 
		 sb.append(num/den);
        
		 if(num % den == 0) {
			 return sb.toString();
		 }
        sb.append(".");
        
        num = (num % den) * 10;
		 
		 while(num != 0) {
			 if(map.containsKey(num)) {
				 sb.insert(map.get(num), "(");
				 sb.append(")");
				 return sb.toString();
			 }
			 
			 map.put(num, sb.length());
			 sb.append(num/den);
			 num = (num % den) * 10;
		 }
		 
		 return sb.toString();
	 }
}
