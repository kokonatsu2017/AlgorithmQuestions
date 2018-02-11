import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class wordLatter {

	
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
		Set<String> set = new HashSet<>();
		for(String s : wordList){
			set.add(s);
		}
        if(!set.contains(endWord)) return 0;
        
		Queue<String> q = new LinkedList<String>();
        q.add(beginWord);
       
        int step = 1;
        while(!q.isEmpty()){
        	int size = q.size();
        	for(int i = 0; i < size; i++){
        		String s= q.poll();
        		char[] arr = s.toCharArray();
        		for(int j = 0; j <arr.length;  j++){
        			char original = arr[j];
        			for(char c = 'a'; c<='z'; c++){
        				if(c == arr[j]) continue;
        				arr[j] = c;
        				String tmp = String.valueOf(arr);
        				if(tmp.equals(endWord))return step + 1;
        				if(set.contains(tmp)){
        					q.add(tmp);
        					set.remove(tmp);
        				}
        			}
        			arr[j] = original;
        		}
        	}
        	step++;
        }
        return 0;
    }
}
