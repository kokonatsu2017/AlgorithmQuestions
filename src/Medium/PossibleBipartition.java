package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * LeetCode 886
 * @author kokonatsudream
 *
 */
public class PossibleBipartition {
	public boolean possibleBipartition(int N, int[][] dislikes) {
        if(dislikes.length == 0){
        	return true;
        }
        
        Map<Integer, Set<Integer>> map = new HashMap<>();
        
        for(int i = 1; i <= N; i++){
        	map.put(i, new HashSet<Integer>());
        }
        
        for(int[] dislike : dislikes){
        	map.get(dislike[0]).add(dislike[1]);
        	map.get(dislike[1]).add(dislike[0]);
        }
        
        int[] groups = new int[N + 1];
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 1; i <= N; i++){
        	if(groups[i] != 0){
        		continue;
        	}
        	
        	groups[i] = -1;
        	queue.add(i);
        	
        	while(!queue.isEmpty()){
        		int curr = queue.poll();
        		
        		if(!map.containsKey(curr)){
        			continue;
        		}
        		
        		for(int next : map.get(curr)){
        			if(groups[next] == groups[curr]){
        				return false;
        			}
        			if(groups[next] != 0){
        				continue;
        			}
        			
        			groups[next] = -groups[curr];
        			queue.add(next);
        		}
        	}
        }
        
        return true;
        
    }
}
