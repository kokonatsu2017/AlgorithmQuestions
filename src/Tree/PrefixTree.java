package Tree;

import java.util.HashMap;
import java.util.Map;
/**
 * Implement a trie with insert, search, and startsWith methods.

Example:

Trie trie = new Trie();

trie.insert("apple");
trie.search("apple");   // returns true
trie.search("app");     // returns false
trie.startsWith("app"); // returns true
trie.insert("app");   
trie.search("app");     // returns true
Note:

You may assume that all inputs are consist of lowercase letters a-z.
All inputs are guaranteed to be non-empty strings.
 * @author kokonatsudream
 *
 */
public class PrefixTree {
	
	public class TrieNode{
		boolean isWord;
		Map<Character, TrieNode> children;
		
		TrieNode(){
			children = new HashMap<>();
		}
	}
	
	
	TrieNode root;
	 /** Initialize your data structure here. */
    public PrefixTree() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = root;
        
        for(char c: word.toCharArray()) {
        	if(!curr.children.containsKey(c)) curr.children.put(c, new TrieNode());
        	curr = curr.children.get(c);
        	
        }
        curr.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr = root;
        
        for(char c : word.toCharArray()) {
        	if(!curr.children.containsKey(c)) return false;
        	curr = curr.children.get(c);
        }
        
        return curr.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curr = root; 
        
        for(char c : prefix.toCharArray()) {
        	if(!curr.children.containsKey(c)) return false;
        	curr = curr.children.get(c);
        }
        return true;
    }
}
