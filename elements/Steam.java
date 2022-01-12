import java.util.Random;

public class Steam extends Element {
	private static int row;
	private static int column;
	private static int grid[][];
	
		public Steam(int row, int column, int grid[][]) {
			Steam.setRow(row);
			Steam.setColumn(column);
			Steam.setGrid(grid);
		}
		public static void steamBehavior(int row, int column, int grid[][]) {
			//rand.nextDouble() allows for steam to rise slower than fire
			Random rand = new Random();
				  if (rand.nextDouble() < 0.1) {
				  if(row == 0) {
					  grid[row][column] = EMPTY;		  
				  }
			  else if(row > 0 && grid[row - 1][column] == EMPTY){
				  grid[row][column] = EMPTY;
				  grid[row - 1][column] = STEAM;
				  }
			  else if(column + 1 < grid[row].length && grid[row][column + 1] == EMPTY){
						  grid[row][column] = EMPTY;
						  grid[row][column + 1] = STEAM;
						      }
				  else if(column > 0 && grid[row][column - 1] == EMPTY){
						  grid[row][column] = EMPTY;
						  grid[row][column - 1] = STEAM;
						      }
				  else if(row > 0 && grid[row - 1][column] == WATER) {
					  grid[row][column] = WATER;
					  grid[row - 1][column] = STEAM; 
				  			}
				  		}
			
		}
		public static int getRow() {
			return row;
		}
		public static void setRow(int row) {
			Steam.row = row;
		}
		public static int getColumn() {
			return column;
		}
		public static void setColumn(int column) {
			Steam.column = column;
		}
		public static int[][] getGrid() {
			return grid;
		}
		public static void setGrid(int grid[][]) {
			Steam.grid = grid;
		}	
	}
