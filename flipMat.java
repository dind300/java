
public class flipMat {
public static void main(String[] args) {
	int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
	flipMatrix(matrix);
	for (int row = 0; row < matrix.length; row++) {
		for (int col = 0; col < matrix[0].length; col++) {
			System.out.print(matrix[row][col]+ " ");
		}
		System.out.print("\n");
	}
}
public static void flipMatrix(int[][] matrix) {
	for (int row = 0; row < matrix.length; row++) {
		for (int col = 0; col < matrix.length; col++) {
			if(row>col) {
			flip(matrix, row, col);
			}
		}
		
	}
}
public static void flip(int[][] matrix,int row,int col) {
	int temp;
	temp=matrix[col][row];
	matrix[col][row]=matrix[row][col];
	matrix[row][col]=temp;
}
}
