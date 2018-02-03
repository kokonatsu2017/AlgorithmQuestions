package String;

public class StringCompression {
	/**
	 * Given an array of characters, compress it in-place.

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a character (not int) of length 1.

After you are done modifying the input array in-place, return the new length of the array.
	 * @param chars
	 * @return
	 */
	public int compress(char[] chars) {
		int count = 0;
		char prev = ' ';
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < chars.length; i++){
			char cur = chars[i];
			
			if(prev == ' ' ) prev = cur;
			
			if(prev == cur){
				count++;
			}else{
				sb.append(prev);
				if(count > 1)
					sb.append(count);
				count = 1;
				prev = cur;
			}
		}
		sb.append(prev);
		if(count > 1) sb.append(count);
		
		for(int i = 0;i < sb.length(); i++){
			chars[i] = sb.charAt(i);
		}
		return sb.length();
        
    }
}
