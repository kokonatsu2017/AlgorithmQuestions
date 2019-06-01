package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lib.TreeNode;
/**
 * LettCode 652
 * @author kokonatsudream
 *
 */
public class FindDuplicateSubtree {
	
	private static final String NULL_MARKER = ",";
    private static final String MARKER = ":";
    
	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if(root == null){
        	return new ArrayList<>();
        }
        
        List<TreeNode> res = new ArrayList<>();
        Map<String, List<TreeNode>> map = new HashMap<>();
        
        duplicateHelper(root, map);
        
        for(String str: map.keySet()){
        	List<TreeNode> tmp = map.get(str);
        	if(tmp.size() >= 2){
        		res.add(tmp.get(0));
        	}
        }
        
        return res;
    }
		
	public String duplicateHelper(TreeNode root, Map<String, List<TreeNode>> map){
		if(root == null){
			return NULL_MARKER;
		}
		
		String left = duplicateHelper(root.left, map);
		String right = duplicateHelper(root.right, map);
		
		String key = root.val + MARKER + left + MARKER + right;
		
		List<TreeNode> list = map.getOrDefault(key, new ArrayList<>());
		
		list.add(root);
		map.put(key, list);
		
		return key;
	}
}
