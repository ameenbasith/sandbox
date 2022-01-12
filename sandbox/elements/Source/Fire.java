public class Fire extends Element {
	private static int row;
	private static int column;
	private static int grid[][];
	
		public Fire(int row, int column, int grid[][]) {
			Fire.setRow(row);
			Fire.setColumn(column);
			Fire.setGrid(grid);
		}
		
		public static void fireBehavior(int row, int column, int grid[][]) {
			//fire behavior 

				  if (row == 0){
					  grid[row][column] = EMPTY;
					  }
				  else if(row - 1 >= 0 && grid[row - 1][column] == EMPTY){
					  grid[row][column] = EMPTY;
					  grid[row - 1][column] = FIRE;
				      }
			  //fire interactions with ice and water
				  else if(row + 1 < grid.length && grid[row + 1][column] == ICE) {
					  grid[row][column] = WATER;
					  grid[row + 1][column] = WATER;
				  	}
				  else if(row + 1 < grid.length && grid[row + 1][column] == WATER)
				  	{
				  	grid[row + 1][column] = WATER;
				  	grid[row][column] = STEAM;
				  	}
				  else if((row > 0 && grid[row - 1][column] == WATER) || 
						  (column > 0 && grid[row][column - 1] == WATER) ||
						  (column + 1 < grid[row].length && grid[row][column + 1] == WATER)) {
					  grid[row][column] = STEAM;  
				  }
			 //fire interaction with metal
				  else if(row > 0 && grid[row - 1][column] == METAL){
						  grid[row][column] = EMPTY;
						  grid[row - 1][column] = LAVA;
						      }
				  else if(column > 0 && grid[row][column - 1] == EMPTY) {
					  	grid[row][column - 1] = FIRE;
					    grid[row][column] = EMPTY;
					    }
				  else if(column + 1 < grid[row].length && grid[row][column + 1] == EMPTY) {
					  	grid[row][column + 1] = FIRE;
					    grid[row][column] = EMPTY;
					    }
			
		}

		public static int getRow() {
			return row;
		}

		public static void setRow(int row) {
			Fire.row = row;
		}

		public static int getColumn() {
			return column;
		}

		public static void setColumn(int column) {
			Fire.column = column;
		}

		public static int[][] getGrid() {
			return grid;
		}

		public static void setGrid(int grid[][]) {
			Fire.grid = grid;
		}	
		}
