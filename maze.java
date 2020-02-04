public class maze {
	public static void main(String[] args) {
		boolean[][] matrix = { { true, true,false,true,true,true}, {true, false,false,true, false,true },
				{true,true,true,true,false,true }, {false,false, false,false,true,true },{false,false,false,false,false,true},{true,true,true,true,true,true} };

		System.out.println(findTheExit(matrix, 0, 0,"matrix"));
	}

	public static boolean findTheExit(boolean[][] matrix, int row, int col,String path) {
		if (row == matrix.length - 1 && col == matrix[0].length - 1) {
			System.out.print(row + "," + col+" <- ");
			return true;
		}
		if (!matrix[row][col]) {
				return false;
		}
		
		if (col < matrix[0].length - 1) {
			if (findTheExit(matrix, row, col + 1,"left")) {
					System.out.print(row + "," + col+" <- ");
					return true;
				}
			}
		if (row < matrix.length) {
			if (findTheExit(matrix, row + 1, col,"up")) {
					System.out.print(row + "," + col+" <- ");
					return true;
				}
			}
		
		 if (col > 0) {
			if(path!="left") {
				matrix[row][col]=false;
			if (findTheExit(matrix, row, col - 1,"right") ) {
				System.out.print(row + "," + col+ " <- ");
				return true;
			}
			}
		}
		if (row > 0) {
			if(path!="up") {
			matrix[row][col]=false;
			if (findTheExit(matrix, row - 1, col,"down")) {
					System.out.print(row + "," + col+ " <- ");
					return true;
				}
			}
		}
		return false;
	}

}
