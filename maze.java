public class maze {
	public static void main(String[] args) {
		boolean[][] matrix = {  { true, true, false, true, true, true }, 
								{ false, false, false, true, false, true },
								{ false, false, false, false, false, true }, 
								{ false, true, true, true, false, true },
								{ false, true, false, true, false, true }, 
								{ false, true, true, true, true, true } };

		System.out.println(isMazeSolved(matrix));
	}

	public static boolean isMazeSolved(boolean[][] matrix) {
		return findTheExit(matrix, matrix.length - 1, matrix[0].length - 1);
	}

	public static boolean findTheExit(boolean[][] matrix, int row, int col) {
		if (row == 0 && col == 0) {// base condition
			System.out.print(row + "," + col + " -> ");
			return true;
		}
		if (!matrix[row][col]) {// base condition
			return false;
		}
		matrix[row][col]=false;
		if (col > 0) { // check out of bounds
			
				if (findTheExit(matrix, row, col - 1)) {// check left step
					System.out.print(row + "," + col + " -> ");
					return true;
				}
			
		}
		if (row > 0) { // check out of bounds
			
				if (findTheExit(matrix, row - 1, col)) {// check up step
					System.out.print(row + "," + col + " -> ");
					return true;
				}
			
		}

		if (col < matrix[0].length - 1) { // check out of bounds
			
				if (findTheExit(matrix, row, col + 1)) {// check right step
					System.out.print(row + "," + col + " -> ");
					return true;
				}
			
		}
		if (row < matrix.length - 1) { // check out of bounds
			
				if (findTheExit(matrix, row + 1, col)) {// check down step
					System.out.print(row + "," + col + " -> ");
					return true;
				}
		}

		return false;// if all not work return false.
	}

}

