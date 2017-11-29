
public class compareVersion {
	/**
	 * Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
	 * @param version1
	 * @param version2
	 * @return
	 */
	public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split(".");
        String[] v2 = version1.split(".");
        
        for(int i = 0; i < Math.max(v1.length, v2.length); i++) {
        	int num1 = i < v1.length ? Integer.parseInt(v1[i]): 0;
        	int num2 = i < v2.length ? Integer.parseInt(v2[i]): 0;
        	
        	if(num1 > num2) return 1;
        	else if(num1 < num2) return -1;
        }
        return 0;
    }
}
