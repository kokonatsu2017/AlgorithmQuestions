import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	/**
	 * Given an array of strings, group anagrams together.
	 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
	 * Return:
	 * [
  		["ate", "eat","tea"],
  		["nat","tan"],
  		["bat"]
	   ]
	 * @param strs
	 * @return
	 */
	 public List<List<String>> groupAnagrams(String[] strs) {
	        if(strs == null | strs.length == 0) return new ArrayList<List<String>>();
	        
	        Map<String, List<String>> map = new HashMap<String, List<String>>();
	        
	        for(String s : strs) {
	        	char[] chars = s.toCharArray();
	        	Arrays.sort(chars);
	        	
	        	String sorted = String.valueOf(chars);
	        	if(!map.containsKey(sorted)) {
	        		map.put(sorted, new ArrayList<String>());	
	        	}
	        	map.get(sorted).add(s);
	        }
	        List<List<String>> res = new ArrayList<List<String>>();
	        res.addAll(map.values());
	        return res;
	  }
}
