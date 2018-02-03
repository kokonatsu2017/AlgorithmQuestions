
public class ExcelSheetColumn {
	/**
	 * Given a positive integer, 
	 * return its corresponding column title as appear in an Excel sheet.
	 *   1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
	 * @param n
	 * @return
	 */
	public String convertToTitle(int n) {
		StringBuilder res = new StringBuilder();
        
        while(n > 0) {
        	res.append((char)((n - 1) % 26 + 'A'));
        	n = (n - 1) / 26;
        	
        }
        return res.reverse().toString();
    }
}
