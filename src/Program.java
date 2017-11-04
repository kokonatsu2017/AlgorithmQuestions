import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public int maxProfit(int [] prices){
		int min = Integer.MAX_VALUE;
		int profit = 0;
		for(int i = 0; i < prices.length; i++){
			if(prices[i] < min){
				min = prices[i];
			} else {
				if(prices[i] - min > profit){
					profit = prices[i] - min;
				}
			}
		}
		return profit;
	}
	
	public int firstUniqChar(String s){
		LinkedHashMap<Character, Boolean> ele = new LinkedHashMap<Character, Boolean>();
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(ele.containsKey(s.charAt(i))){
				ele.put(c, false);
			} else {
				ele.put(c, true);
			}
		}
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(ele.get(c)){
				return i;
			}
		}
		return -1;
	}
	public class ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public void reverseList(ListNode head){
		ListNode current = head;
		ListNode tmp = null;
		ListNode previous = null;
		while(current != null){
			tmp = current;
			current = current.next;
			tmp.next = previous;
		}
	}
	public boolean isPrime(ListNode head){
		ListNode faster = head;
		ListNode shorter = head;
		
		
		Stack<ListNode> s = new Stack<ListNode>();
		while(faster.next.next != null && faster.next != null){
			faster = faster.next.next;
			s.push(shorter);
			shorter = shorter.next;
			
		}
		if(faster.next != null){
			shorter = shorter.next;
		}
		while(!s.isEmpty()){
			shorter = shorter.next;
			if(s.pop() != shorter){
				return false;
			}
		}
		return true;
	}
	public String longestPalindrome(String s) {
		   char[] chars = s.toCharArray();
		   int len = s.length();
		   while (len >= 0) {
		       for (int i = 0; i + len - 1 < chars.length; i++) {
		           int left = i;
		           int right = i + len - 1;
		           boolean good = true;
		           while (left < right) {
		               if (chars[left] != chars[right]) {
		                   good = false;
		                   break;
		               }
		               left++;
		               right--;
		           }
		           if (good)
		               return s.substring(i, i + len);
		       }
		       --len;
		   }
		   return "";
	}

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (l1 != null) ? l1 : l2;
        return head.next;
    }
    public String removeVowel(String string){
	    StringBuffer sb = new StringBuffer();
	    String v = "aeiouAEIOU";
	    for(int i = 0; i < string.length(); i++){
	        if(v.indexOf(string.charAt(i)) > -1) continue; 
	        sb.append(string.charAt(i));
	    }
	    return sb.toString();
    }
    
    public boolean stringRotation(String s1, String s2){
    	if(s1.length() != s2.length()){
    		return false;
    	}
    	String s1s1 = s1 + s1;
    	return s1s1.indexOf(s2) != -1;
    }
	
    
    class TreeNode{
    	TreeNode left = null;
    	TreeNode right = null;
    	int val;
    	TreeNode(int v){
    		val = v;
    	}
    }
    
    public boolean isSubTree(TreeNode T1, TreeNode T2) {
        if (T2 == null) return true;
        if (T1 == null) return false;
        return (isSameTree(T1,T2) || isSubTree(T1.left, T2) || isSubTree(T1.right, T2));
    }
    public boolean isSameTree(TreeNode T1, TreeNode T2) {
        if (T1 == null && T2 == null)
            return true;
        if (T1 == null || T2 == null)
            return false;
        if (T1.val != T2.val)
            return false;
        return (isSameTree(T1.left, T2.left) && isSameTree(T1.right, T2.right));
    }
	
    public static int TwoSumCount(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                count += map.get(target - nums[i]);
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i]) + 1);
        }
        return count;
    }
    public boolean isValidParam(String s) {
        while(!s.equals("")){
            if(s.contains("()")){
                s = s.replace("()", "");
            } else if(s.contains("[]")){
                s = s.replace("[]", "");
            } else if(s.contains("{}")){
                s = s.replace("{}", "");
            }else{
                return false;
            }
        }
        return true;
    }
    
    public static ListNode reverseSecondHalfList(ListNode head) {
        if (head == null || head.next == null)      return head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode pre = slow.next;
        ListNode cur = pre.next;
        while (cur != null) {
            pre.next = cur.next;
            cur.next = slow.next;
            slow.next = cur;
            cur = pre.next;
        }
        return head;
    }
    
    
    public int BSTMinPath(TreeNode root) {
        if (root == null)   return 0;
        if (root.left != null && root.right == null)
            return BSTMinPath(root.left) + root.val;
        if (root.left == null && root.right != null)
            return BSTMinPath(root.right) + root.val;
        return Math.min(BSTMinPath(root.left), BSTMinPath(root.right)) + root.val;
    }
    /**
	 * top right 
	 * 1234
	 * 5332
	 * 1232
	 * left bottom
	 * 
	 * top => [layer][i]
	 * left => [length - i] [layer]
	 * bottom => [length - layer][length - i]
	 * right => [i][length - layer]
	 * 
	 * 
	 */

//clockwise
	public void rotate(int[][] matrix) {
		int layers = matrix.length/2;
		int length = matrix[0].length - 1;
		for(int layer = 0; layer < layers; layer++){
		    for(int i = layer; i < matrix.length - layer - 1; i++){
		        int tmp = matrix[layer][i];
		        matrix[layer][i] = matrix[length -i][layer];
		        matrix[length -i][layer] = matrix[length - layer][length - i];
		        matrix[length - layer][length - i]=   matrix[i][length -layer];
		        matrix[i][length - layer] = tmp;
		    }
		}
	}
}

   
