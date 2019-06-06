package Medium;

import java.util.ArrayList;
import java.util.List;


/**
 * LeetCode 207
 * @author kokonatsudream
 *
 */
public class CourseSchedule {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());
        
        for(int i = 0; i < prerequisites.length; i++){
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        boolean[] cleared = new boolean[numCourses];
        
        for(int i = 0; i < numCourses; i++){
            if(isCyclic(graph,i,new boolean[numCourses],cleared)){
                return false;
            }
        }
        
        return true;
   
    }
	
	public boolean isCyclic(List<List<Integer>> graph, int source, boolean[] seen, boolean[] cleared){
        
        if(cleared[source]){
            return false;
        }
        
        if(seen[source]){
            return true;
        }
        
        seen[source] = true;
        
        List<Integer> neighbours = graph.get(source);
        
        for(int nei: neighbours){
            if(!isCyclic(graph, nei, seen, cleared)){
                cleared[nei] = true;
            } else {
                return true;
            }
        }
        
        return false;
    }
}
