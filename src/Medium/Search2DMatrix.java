package Medium;
/**
 * LeetCode 74
 * @author kokonatsudream
 *
 */
public class Search2DMatrix {
	 public boolean searchMatrix(int[][] matrix, int target) {
		 
		 if(matrix.length == 0 || matrix[0].length == 0){
			 return false;
		 }
	     
		 boolean found = false;
		 
		 for(int i = 0; i < matrix.length; i++){
			 if(matrix[i][0] == target){
				 return true;
			 }
			 
			 if(matrix[i][matrix[i].length - 1] == target){
				 return true;
			 }
			 if(matrix[i][0] < target && target < matrix[i][matrix[i].length - 1]){
				 found = binarySearch(matrix, i, 0, matrix[i].length - 1, target);
			 }
			 if(found){
				 return true;
			 }
		 }
		 
		 return false;
	 }
	 
	 public boolean binarySearch(int[][] matrix, int row, int low, int high, int target){
		 if(low > high){
			 return false;
		 }
		 
		 int mid = (low + high)/2;
		 
		 if(matrix[row][mid] == target){
			 return true;
		 } else if(matrix[row][mid] < target){
			 return binarySearch(matrix, row, mid + 1,high, target);
		 } else {
			 return binarySearch(matrix, row, low, mid - 1, target);
		 }
	 }
}
