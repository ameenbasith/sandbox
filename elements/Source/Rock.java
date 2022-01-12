public class Rock extends Element {
	private static int row;
	private static int column;
	private static int grid[][];
	
		public Rock(int row, int column, int grid[][]) {
			Rock.setRow(row);
			Rock.setColumn(column);
			Rock.setGrid(grid);
		}
		
		public static void rockBehavior(int row, int column, int grid[][]) {
			  //rocks fall similarly to sand and sinks in water
			  if(row + 1 < grid.length && grid[row + 1][column] == EMPTY){
				  grid[row][column] = EMPTY;
				  grid[row + 1][column] = ROCK;
				      }
			  else if(row + 1 < grid.length && grid[row + 1][column] == WATER) {
				  grid[row][column] = WATER;
				  grid[row + 1][column] = ROCK; 
			  }
			
		}

		public static int getRow() {
			return row;
		}

		public static void setRow(int row) {
			Rock.row = row;
		}

		public static int getColumn() {
			return column;
		}

		public static void setColumn(int column) {
			Rock.column = column;
		}

		public static int[][] getGrid() {
			return grid;
		}

		public static void setGrid(int grid[][]) {
			Rock.grid = grid;
		}	
}
