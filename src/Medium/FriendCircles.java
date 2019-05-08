package Medium;

/**
 * LeetCode 547
 * @author kokonatsudream
 *
 */
public class FriendCircles {
	
	class UnionSet {
		int[] rank, parent;
		int count, n;
		
		public UnionSet(int n){
            this.n = n;
			this.count = n;
            this.parent = new int[n];
            this.rank = new int[n];
			makeSet();
		}
		
		public void makeSet(){
			for(int i = 0; i < n; i++){
				parent[i] = i;
			}
		}
		
		int find(int x){
			if(parent[x] != x){
				return find(parent[x]);
			}
			
			return x;
		}
		
		void union(int x, int y){
			int xRoot = find(x);
			int yRoot = find(y);
			
			if(xRoot == yRoot){
				return;
			}
			
			if(rank[yRoot] < rank[xRoot]){
				parent[yRoot] = xRoot;
			} else {
				parent[yRoot] = xRoot;
				rank[xRoot] = rank[xRoot] + 1;
			}
			
			count--;
		}
		
		int getCount(){
			return this.count;
		}
		
	}
	public int findCircleNum(int[][] M) {
		
		UnionSet us = new UnionSet(M.length);
        for(int i = 0; i < M.length; i++){
        	for(int j = 0; j < M[0].length; j++){
        		if(M[i][j] == 1){
        			us.union(i, j);
        		}
        	}
        }
        
        return us.getCount();
	}
}
