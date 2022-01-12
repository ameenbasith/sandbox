
	public class Metal extends Element {
		private static int row;
		private static int column;
		private static int grid[][];
		
		public Metal(int row, int column, int grid[][]) {			
			Metal.setRow(row);
			Metal.setColumn(column);
			Metal.setGrid(grid);
		}
		public static void metalBehavior(int row, int column, int grid[][]) {
			//Metal rusts in the presence of water
			  if((column - 1 > -1 && grid[row][column - 1] == WATER) || (column + 1 < grid[row].length && grid[row][column + 1] == WATER) || 
					  (row - 1 > -1 && grid[row - 1][column] == WATER) || (row + 1 < grid.length && grid[row + 1][column] == WATER)){
				  grid[row][column] = RUST;
				      }  
	}
		public static int[][] getGrid() {
			return grid;
		}
		public static void setGrid(int grid[][]) {
			Metal.grid = grid;
		}
		public static int getColumn() {
			return column;
		}
		public static void setColumn(int column) {
			Metal.column = column;
		}
		public static int getRow() {
			return row;
		}
		public static void setRow(int row) {
			Metal.row = row;
		}
		
		
}
