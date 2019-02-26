package Amazon.Easy;
/**
 * LeetCode 482
 * @author kokonatsudream
 *
 */
public class LicenseKeyFormatting {
	public String licenseKeyFormatting(String S, int K) {
        S = S.replace("-", "").toUpperCase();
        
        StringBuilder res = new StringBuilder();
        int count = 0;
        for(int i = S.length() - 1; i >= 0; i--){
        	if(count < K){
        		res.append(S.charAt(i));
        		count++;
        	} else {
        		res.append("-");
        		res.append(S.charAt(i));
        		count = 1;
        	}
        }
        
        return res.reverse().toString();
    }
}
