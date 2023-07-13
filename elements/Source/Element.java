public class Element {
	public static final int EMPTY = 0;
	public static final int METAL = 1;
	public static final int SAND = 2;
	public static final int WATER = 3;
	public static final int ICE = 4;
	public static final int FIRE = 5;
	public static final int STEAM = 6;
	public static final int RUST = 7;
	public static final int LAVA = 8;
	public static final int ROCK = 9;
	
	public static void behavior(int row, int column, int grid[][]) {
		switch (grid[row][column]) {
		case EMPTY:
			break;
		case METAL:
			Metal.metalBehavior(row, column, grid);
			break;
		case SAND:
			Sand.sandBehavior(row, column, grid);
			break;
		case WATER:
			Water.waterBehavior(row, column, grid);
			break;
		case ICE:
			Ice.iceBehavior(row, column, grid);
			break;
		case FIRE:
			Fire.fireBehavior(row, column, grid);
			break;
		case STEAM:
			Steam.steamBehavior(row, column, grid);
			break;
		case LAVA:
			Lava.lavaBehavior(row, column, grid);
			break;
		case ROCK:
			Rock.rockBehavior(row, column, grid);
			break;	
		default:
			break;
		}
	}
}
