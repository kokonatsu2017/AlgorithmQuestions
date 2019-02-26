package Easy;

public class RotateString {
	public boolean rotateString(String A, String B) {
		if(A.length() != B.length()) return false;
		
        String concat = A + A;
        
        return concat.contains(B);
    }
}
