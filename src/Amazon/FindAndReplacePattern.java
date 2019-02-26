package Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * LettCode 890
 * @author kokonatsudream
 *
 */
public class FindAndReplacePattern {
	public List<String> findAndReplacePattern(String[] words, String pattern) {
        
		List<String> res = new ArrayList<String>();
        
        for(int i = 0; i < words.length; i++){
        	Map<Character, Character> replacement = new HashMap<Character, Character>();
        	Set<Character> used = new HashSet<Character>();
        	boolean skip = false;
        	
        	for(int j = 0; j < words[i].length();j++){
        		char charc = words[i].charAt(j);
        		char target = pattern.charAt(j);
        		
        		if(replacement.containsKey(target)){
        			if(replacement.get(target) != charc){
        				skip = true;
        				break;
        			}
        		} else {
        			replacement.put(target, charc);
        			if(used.contains(charc)){
        				skip = true;
        				break;
        			}
        			used.add(charc);
        		}
        		
        	}
        	if(!skip)
        		res.add(words[i]);
        }
        
        return res;
    }
}
