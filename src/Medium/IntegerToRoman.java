package Medium;

import java.util.HashMap;
import java.util.Map;
/**
 * LeetCode 12
 * @author kokonatsudream
 *
 */
public class IntegerToRoman {
	public String intToRoman(int num) {
        Map<Integer, String> romanConverter = new HashMap<>();
        
        romanConverter.put(1, "I");
        romanConverter.put(5, "V");
        romanConverter.put(10,"X");
        romanConverter.put(50, "L");
        romanConverter.put(100, "C");
        romanConverter.put(500, "D");
        romanConverter.put(1000, "M");
        romanConverter.put(4, "IV");
        romanConverter.put(9, "IX");
        romanConverter.put(40, "XL");
        romanConverter.put(90, "XC");
        romanConverter.put(400, "CD");
        romanConverter.put(900, "CM");
        
        StringBuilder roman = new StringBuilder();
        String number = String.valueOf(num);
        
        int digits = number.length();
        for(int i = 0; i < digits; i++){
        	int digit = number.charAt(i) - '0';
        	if(digits - i == 4){
        		for(int j = 0; j < digit; j++){
        			roman.append("M");
        		}
        	} else {
        		int val = (int) Math.pow(10, digits - i - 1);
        		if(digit == 9){
        			roman.append(romanConverter.get(val * digit));
        		} else if(digit > 5){
        			roman.append(romanConverter.get(val * 5));
        			for(int j = 5; j < digit; j++){
            			roman.append(romanConverter.get(val));
            		}
        		} else if(digit == 5){
        			roman.append(romanConverter.get(val * digit));
        		} else if(digit == 4){
        			roman.append(romanConverter.get(val * digit));
        		} else {
        			for(int j = 0; j < digit; j++){
            			roman.append(romanConverter.get(val));
            		}
        		}
        	}
        }
        
        return roman.toString();
        
    }
}
