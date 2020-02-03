
public class matrixSort {

	public static void main(String[] args) {
		int[][] matrix= {{1,2},{4,5},{7,8}};
		System.out.println(isMatrixSortRecursive(matrix,matrix.length-1,matrix[0].length-1));
	}

	public static boolean isMatrixSortRecursive(int matrix[][],int row,int col){
		boolean answer;
		if(row==0 && col==0)
			return true;
		if(col==0) {
			answer=isMatrixSortRecursive(matrix, row-1,matrix[0].length);
			if(row<matrix.length) {
			if(matrix[row][col]<=matrix[row-1][matrix[0].length-1]) {
				return false;
			}
			}
			return answer;
			
		}
		answer=isMatrixSortRecursive(matrix, row, col-1);
		if(col<matrix[0].length) {
		if(matrix[row][col]<matrix[row][col-1]) {
			return false;
		}
		}
		return answer;
	}
}