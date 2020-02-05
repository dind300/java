public class maze {
	public static void main(String[] args) {
		boolean[][] matrix = { { true, true, false, true, true, true }, 
				       { true, false, false, true, false, true },
				       { true, true, true, true, false, true },
				       { false, false, false, false, true, true },
				       { false, false, false, false, false, true }, 
				       { true, true, true, true, true, true } };
 
		System.out.println(isMazeSolved(matrix));
	}

	public static boolean isMazeSolved(boolean[][] matrix) {
		return findTheExit(matrix, matrix.length - 1, matrix[0].length - 1, "matrix");
	}

	public static boolean findTheExit(boolean[][] matrix, int row, int col, String path) {
		if (row == 0 && col == 0) {// base condition
			System.out.print(row + "," + col + " -> ");
			return true;
		}
		if (!matrix[row][col]) {// base condition
			return false;
		}

		if (col < matrix[0].length - 1) { // check out of bounds
			if (path != "right") {// check if not backtracking
				if (findTheExit(matrix, row, col + 1, "left")) {// check right step
					System.out.print(row + "," + col + " -> ");
					return true;
				}
			}
		}
		if (row < matrix.length - 1) { // check out of bounds
			if (path != "down") {// check if not backtracking
				if (findTheExit(matrix, row + 1, col, "up")) {// check down step
					System.out.print(row + "," + col + " -> ");
					return true;
				}
			}
		}

		if (col > 0) { // check out of bounds
			if (path != "left") {// check if not backtracking
				if (findTheExit(matrix, row, col - 1, "right")) {// check left step
					System.out.print(row + "," + col + " -> ");
					return true;
				}
			}
		}
		if (row > 0) { // check out of bounds
			if (path != "up") {// check if not backtracking
				if (findTheExit(matrix, row - 1, col, "down")) {// check up step
					System.out.print(row + "," + col + " -> ");
					return true;
				}
			}
		}
		return false;// if all not work return false.
	}

}
