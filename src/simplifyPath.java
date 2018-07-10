import java.util.LinkedList;

public class simplifyPath {
	public String simplifyPath(String path) {
        LinkedList<String> lis = new LinkedList<String>();
        String[] tokens = path.split("/");
        
        for(String s : tokens) {
        	if(s == null || s.isEmpty() || s.equals(".")) {
        		continue;
        	} else if(s.equals("..")) {
        		if(lis.size() != 0) {
        			lis.removeLast();
        		}
        	} else {
        		lis.addLast(s);
        	}
        }
        
        if(lis.size() == 0) return "/";
        
        StringBuilder res = new StringBuilder();
        
        while(!lis.isEmpty()) {
        	res.append("/").append(lis.removeFirst());
        }
        
        return res.toString();
        
        
    }
}
