public class Ice extends Element {
	private static int row;
	private static int column;
	private static int grid[][];
	
		public Ice(int row, int column, int grid[][]) {
			Ice.setRow(row);
			Ice.setColumn(column);
			Ice.setGrid(grid);
		}
		
		public static void iceBehavior(int row, int column, int grid[][]) {
			
			//allows ice to fall
			  if(row + 1 < grid.length && grid[row + 1][column] == EMPTY){
				  grid[row][column] = EMPTY;
				  grid[row + 1][column] = ICE;
				      }
			  
			  //allows ice to interact realistically with water
			  else if(row > 0 && grid[row - 1][column] == WATER) {
				  grid[row][column] = WATER;
				  grid[row - 1][column] = ICE; 
			  }
			  else if(row > 0 && grid[row - 1][column] == ICE && 
					  column > 0 && grid[row][column - 1] == WATER) {
				  grid[row][column] = WATER;
				  grid[row][column - 1] = ICE;
				  
			  }
			  else if(row > 0 && grid[row - 1][column] == ICE && 
					  column + 1 < grid[row].length && grid[row][column + 1] == WATER) {
				  grid[row][column] = WATER;
				  grid[row][column + 1] = ICE;
			  }
			
		}

		public static int getRow() {
			return row;
		}

		public static void setRow(int row) {
			Ice.row = row;
		}

		public static int getColumn() {
			return column;
		}

		public static void setColumn(int column) {
			Ice.column = column;
		}

		public static int[][] getGrid() {
			return grid;
		}

		public static void setGrid(int grid[][]) {
			Ice.grid = grid;
		}	

}
