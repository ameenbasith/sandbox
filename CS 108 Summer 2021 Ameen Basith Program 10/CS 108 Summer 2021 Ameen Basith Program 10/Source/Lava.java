import java.util.Random;

public class Lava extends Element {
	private static int row;
	private static int column;
	private static int grid[][];
	
		public Lava(int row, int column, int grid[][]) {
			Lava.setRow(row);
			Lava.setColumn(column);
			Lava.setGrid(grid);
		}
		
		public static void lavaBehavior(int row, int column, int grid[][]) {
			Random rand = new Random(); 
			//<0.04 controls the rate of the fall
			  if(rand.nextDouble() < 0.04) {
					  if(row + 1 < grid.length && grid[row + 1][column] == EMPTY){
						  grid[row][column] = EMPTY;
						  grid[row + 1][column] = LAVA;
					      	}
					  else if(row + 1 < grid.length && grid[row + 1][column] == WATER) {
						  grid[row][column] = STEAM;
						  grid[row + 1][column] = ROCK;  
				  	}
					  else if(row - 1 < grid.length && grid[row - 1][column] == WATER) {
						  grid[row][column] = ROCK;
						  grid[row - 1][column] = STEAM; 	  
					  }
					  else if(row + 1 < grid.length && grid[row + 1][column] == ICE) {
						  grid[row][column] = STEAM;
						  grid[row + 1][column] = STEAM;  
				  	}
					  //since this lava is so incredibly hot, it turns ice directly to steam upon contact
					  else if(column + 1 < grid[row].length && grid[row][column + 1] == ICE){
						  grid[row][column] = STEAM;
						  grid[row][column + 1] = STEAM;
						      }
					  else if(column > 0 && grid[row][column - 1] == ICE){
						  grid[row][column] = STEAM;
						  grid[row][column - 1] = STEAM;
						      }
					  //in the event that lava reaches the top of rocks under water, the pixels will search for the next available area to drop down and become rock
					  else if (rand.nextDouble() < 0.05) {
						   if(column + 1 < grid[row].length && grid[row][column + 1] == EMPTY){
							  grid[row][column] = EMPTY;
							  grid[row][column + 1] = LAVA;
							      }
						  else if(column > 0 && grid[row][column - 1] == EMPTY){
							  grid[row][column] = EMPTY;
							  grid[row][column - 1] = LAVA;
							      }
					 
					  		}
					  }
			
		}

		public static int getRow() {
			return row;
		}

		public static void setRow(int row) {
			Lava.row = row;
		}

		public static int getColumn() {
			return column;
		}

		public static void setColumn(int column) {
			Lava.column = column;
		}

		public static int[][] getGrid() {
			return grid;
		}

		public static void setGrid(int grid[][]) {
			Lava.grid = grid;
		}	

}
