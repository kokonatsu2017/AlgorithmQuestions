package String;
import java.util.List;

/**
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, 
 * determine if s can be segmented into a space-separated sequence of one or more dictionary words. 
 * You may assume the dictionary does not contain duplicate words.
 * 
 *
 */
public class wordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] breakable = new boolean[s.length() + 1];
        breakable[0] = true;
        
        for(int i = 1; i <= s.length(); i++) {
        	for(int j = 0; j < i; j++) {
        		if(breakable[j] && wordDict.contains(s.substring(j, i)))
        			breakable[i] = true;
        		
        	}
        }
        return breakable[s.length()];
    }
}
