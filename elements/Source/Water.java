public class Water extends Element {
	private static int row;
	private static int column;
	private static int grid[][];
	
	public Water(int row, int column, int grid[][]) {
		Water.setRow(row);
		Water.setColumn(column);
		Water.setGrid(grid);
	}
	
	public static void waterBehavior(int row, int column, int grid[][]) {
		//water behavior for moving down, right, and left, respectively
		  if(row + 1 < grid.length && grid[row + 1][column] == EMPTY){
			  grid[row][column] = EMPTY;
			  grid[row + 1][column] = WATER;
			      }

		  else if(column + 1 < grid[row].length && grid[row][column + 1] == EMPTY){
			  grid[row][column] = EMPTY;
			  grid[row][column + 1] = WATER;
			      }
	  
		  else if(column - 1 > -1 && grid[row][column - 1] == EMPTY){
			  grid[row][column] = EMPTY;
			  grid[row][column - 1] = WATER;
			      }
		
	}

	public static int getRow() {
		return row;
	}

	public static void setRow(int row) {
		Water.row = row;
	}

	public static int getColumn() {
		return column;
	}

	public static void setColumn(int column) {
		Water.column = column;
	}

	public static int[][] getGrid() {
		return grid;
	}

	public static void setGrid(int grid[][]) {
		Water.grid = grid;
	}	
}
