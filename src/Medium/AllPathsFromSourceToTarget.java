package Medium;

import java.util.ArrayList;
import java.util.List;
/**
 * LeetCode 797
 * @author kokonatsudream
 *
 */
public class AllPathsFromSourceToTarget {
	
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		
		List<List<Integer>> res = new ArrayList<>();
		
        searchPath(graph, 0, new ArrayList<>(), res);
        return res;
    }
	
	public void searchPath(int[][] graph, int node, List<Integer> path, List<List<Integer>> res){
		
		path.add(node);
		
		if(node == graph.length - 1){
			res.add(new ArrayList(path));
			return;
		}
		
		for(int edge : graph[node]){
			searchPath(graph, edge, path, res);
			path.remove(path.size() - 1);
		}
	}
}
