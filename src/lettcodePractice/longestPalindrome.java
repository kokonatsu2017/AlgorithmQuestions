package lettcodePractice;

public class longestPalindrome {

	
	public String longestPalindrome(String string) {
        int max = 0;
        int s = 0;
        int e = 0;
        char[] chars = string.toCharArray();
        for(int i = 0; i < string.length(); i++){
        	if(isPanlindrome(chars, i - max - 1, i)){
        		s = i - max - 1;
        		e = i;
        		max += 2;
        	} else if (isPanlindrome(chars, i - max, i)){
        		s = i - max;
        		e = i;
        		max += 1;
        	}
        }
        return string.substring(s, e + 1);
    }
	public boolean isPanlindrome(char[] chs, int s, int e){
		if(s < 0 ) return false;
		while(s < e){
			if(chs[s] != chs[e]) return false;
			s++;
			e--;
		}
		return true;
	}
}
