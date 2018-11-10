package Amazon;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
/**
 * LeetCode 127
 * @author kokonatsudream
 *
 */
public class WordLadder {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<String>();
        Set<String> visited = new HashSet<String>();
        
        queue.add(beginWord);
        
        int level = 1;
        
        while(!queue.isEmpty()){
        	int size = queue.size();
        	for(int i = 0; i < size; i++){
        		String str = queue.poll();
        		if(str.equals(endWord)) return level;
        		
        		for(int j = 0; j < wordList.size(); j++){
        			String word = wordList.get(j);
        			if(!visited.contains(word) && oneDiff(word, str)){
        				visited.add(word);
        				queue.add(word);
        			}
        		}
        	}
        	
        	if(queue.size() == 0) return 0;
        	level++;
        }
        
        return level;
    }
	
	public boolean oneDiff(String s1, String s2){
		for(int i = 0; i < s1.length(); i++){
			if(s1.charAt(i) != s2.charAt(i))
				return s1.substring(i + 1).equals(s2.substring(i + 1));
		}
		
		return false;
	}
}
