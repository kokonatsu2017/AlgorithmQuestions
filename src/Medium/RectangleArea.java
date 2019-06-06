package Medium;
/**
 * LeetCode 223
 * @author kokonatsudream
 *
 */
public class RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        //R1 x A C
		//R1 y B D
		//R2 x E G
		//R2 y F H
		
		int r1_x = Math.abs(C - A);
		int r1_y = Math.abs(D - B);
		int r2_x = Math.abs(G - E);
		int r2_y = Math.abs(H - F);
		
		//No overlap
		if(E >= C || A >= G || F >= D || B >= H){
			return r1_x * r1_y + r2_x * r2_y;
		}
		
		//R1 is inside R2 or R2 is inside R1
		if(A >= E && G >= C && B >= F && H >= D || E >= A && C >= G && F >= B && D >= H){
			return Math.max(r1_x * r1_y, r2_x * r2_y);
		}
		
		int common_x = Math.abs(Math.max(A, E) - Math.min(C, G));
		int common_y = Math.abs(Math.max(B, F) - Math.min(D, H));
		
		
		int area = r1_x * r1_y + r2_x * r2_y - common_x * common_y;
		
		return area;
        
    }
}
