package String;

/**
 * Implement strStr().

	Return the index of the first occurrence of needle in haystack, 
	or -1 if needle is not part of haystack.
 * 
 *
 */
public class strStr {
	public int strStr(String haystack, String needle) {
		if(needle.isEmpty()) return 0;
		
		if(needle.length() > haystack.length()) return -1;
		else if(needle.length() == haystack.length()){
			if(needle.equals(haystack)) return 0;
			else return -1;
		} else{
			int th = haystack.length() - needle.length();
			
			for(int i =0; i <= th; i++){
				if(haystack.substring(i, i + needle.length()).equals(needle)) return i;
			}
		}
		return -1;
	 }
}
