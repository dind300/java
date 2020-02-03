
public class maze {
	public static void main(String[] args) {
		boolean[][] matrix = { { true, true, false, true,true}, {true, true,false, false,true },
				{true,false,false, true,true }, { true, false,false,false,true },{true,true,true,true,true} };

		System.out.println(findTheExit(matrix, 0, 0));
	}

	public static boolean findTheExit(boolean[][] matrix, int row, int col) {
		if (row == matrix.length - 1 && col == matrix[0].length - 1) {
			System.out.print(row + " " + col+" <- ");
			return true;
		}
		if (!matrix[row][col]) {
			matrix[row][col] = false;
			return false;
		}

		if (col < matrix[0].length - 1) {
			if (findTheExit(matrix, row, col + 1)) {

					System.out.print(row + " " + col+" <- ");
					return true;
				}
			}
		if (row < matrix.length) {
			if (findTheExit(matrix, row + 1, col)) {
					System.out.print(row + " " + col+" <- ");
					return true;

				}
			}
		matrix[row][col]=false;
		if (col > 0) {
			if (findTheExit(matrix, row, col - 1) ) {
				System.out.println(row + " " + col+ " <- ");
				return true;

			}
		}
		if (row > 0) {
			if (findTheExit(matrix, row - 1, col)) {
					System.out.println(row + " " + col+ "<-");
					return true;
				
			
				}
			}
		return false;
	}

}
