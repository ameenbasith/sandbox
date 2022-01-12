public class Sand extends Element {
	private static int row;
	private static int column;
	private static int grid[][];
	
	public Sand(int row, int column, int grid[][]) {
		Sand.setRow(row);
		Sand.setColumn(column);
		Sand.setGrid(grid);
	}
	public static void sandBehavior(int row, int column, int grid[][]) {
	//sand falls and moves below water
	  if(row + 1 < grid.length && grid[row + 1][column] == EMPTY){
		  grid[row][column] = EMPTY;
		  grid[row + 1][column] = SAND;
		      }
	  else if(row + 1 < grid.length && grid[row + 1][column] == WATER) {
		  grid[row][column] = WATER;
		  grid[row + 1][column] = SAND;
	  		  }
	
	}
	public static int getRow() {
		return row;
	}
	public static void setRow(int row) {
		Sand.row = row;
	}
	public static int getColumn() {
		return column;
	}
	public static void setColumn(int column) {
		Sand.column = column;
	}
	public static int[][] getGrid() {
		return grid;
	}
	public static void setGrid(int grid[][]) {
		Sand.grid = grid;
	}
}
