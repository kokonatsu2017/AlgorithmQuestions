package Amazon.Easy;

/**
 * LeetCode 38
 * @author kokonatsudream
 *
 */
public class CountAnySay {
	public String countAndSay(int n) {
		
		if(n == 1){
			return Integer.toString(n);
		}
	
		
		return count(countAndSay(n-1));
    }
	
	public String count(String s){
		StringBuilder res = new StringBuilder();
		
		int sum = 1;
		
		for(int i = 0; i < s.length(); i++){
			if(i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)){
				res.append(sum);
				res.append(s.charAt(i));
				sum = 1;
			} else {
				sum++;
			}
		}
		
		return res.toString();
	}
}
