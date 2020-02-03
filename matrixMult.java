
public class matrixMult {
	public static void main(String[] args) {

		int[][] matrix1= {{2,1,3},{2,2,2}};
		int[][] matrix2= {{2,1},{1,2},{3,4}};
		int[][] matrix;
		matrix=matrixMultiple(matrix1, matrix2);
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col]+ " ");
			}
			System.out.print("\n");
			
		}
	}


	public static int[][] matrixMultiple(int[][] matrix1,int[][] matrix2) {
		int[][] matrix=new int[matrix1.length][matrix2[0].length];
		if(matrix1[0].length!=matrix2.length) {
			return matrix;
		}
		int sum=0;
		int index1=0;
		int index2=0;
		for (int row = 0; row < matrix1.length; row++) {
			index1=0;
			index2=0;
			while(index1<matrix2[0].length) {
				sum=0;
			for (int col = 0; col < matrix2.length; col++) {
			sum=sum+matrix1[row][col]*matrix2[col][index2];
			}
			matrix[row][index2]=sum;
			index2++;
			index1++;
			}
		}
		return matrix;
		
	}
}
