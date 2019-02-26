package Easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
/**
 * LeetCode 720
 * @author kokonatsudream
 *
 */
public class LongestWordInDictionary {
	private static class Node{
        Node[] child;
        String word;
        
        void insert(String w){
        	
            Node node=this;
            
            for(char c: w.toCharArray()){
                if(node.child==null){
                	node.child = new Node[26];
                }
                if(node.child[c-'a'] == null){
                	node.child[c-'a'] = new Node();
                }
                node = node.child[c-'a'];
            }
            node.word= w;
        }
    }
	
	public String longestWord(String[] words) {
        Node root = new Node();
        
        for(String word: words){
        	root.insert(word);
        }
        
        Deque<Node> st=new ArrayDeque<>();
        
        st.push(root);
        String res = "";
        
        while(!st.isEmpty()){
        	Node node = st.pop();
        	
        	if(node.word != null && node.word.length() > res.length()){
        		res = node.word;
        	}
        	
        	if(node.child != null){
        		for(char c = 'z'; c != 'a' -1; c--){
        			Node n = node.child[c - 'a'];
        			if(n != null && n.word != null){
        				st.push(n);
        			}
        		}
        	}
        }
        
        return res;
    }
	
	
}
