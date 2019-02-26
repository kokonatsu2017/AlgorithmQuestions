package Amazon.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 49
 * @author kokonatsudream
 *
 */
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<List<String>>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s: strs){
        	
        	char[] chars = s.toCharArray();
        	Arrays.sort(chars);
        	String keyString = String.valueOf(chars);
        	
        	if(!map.containsKey(keyString)) map.put(keyString, new ArrayList<String>());
        	map.get(keyString).add(s);
        }
        
        return new ArrayList<List<String>>(map.values());
        
    }
}
