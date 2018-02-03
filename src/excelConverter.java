
public class excelConverter {
	/**
	 * Given a column title as appear in an Excel sheet, 
	 * return its corresponding column number.
	 * @param s
	 * @return
	 */
	public int titleToNumber(String s) {
		int sum = 0;
		int idx = 1;
		sum = s.charAt(s.length() -1) - 'A' + 1;
		for(int i = s.length() -2; i >= 0; i--){
			sum+= Math.pow(26, idx) * (s.charAt(i) - 'A' + 1); 
			idx++;
		}
		return sum;
    }
}
