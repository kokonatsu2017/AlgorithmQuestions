package Easy;
/**
 * LeetCode 125
 * @author kokonatsudream
 *
 */
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^A-Za-z0-9]", "");
        t = t.toLowerCase();
        int start =0;
        int end=t.length()-1;
      while(start<=end){
          if(t.charAt(start)!=t.charAt(end)) {
              return false;
          }
          start++;
          end--;
          
      }
  
      return true;
      
  }
}
