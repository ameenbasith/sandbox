import java.awt.*;
import java.util.*;

public class SandLab
{
  public static void main(String[] args)
  {
    SandLab lab = new SandLab(120, 80);
    lab.run();
  }
  
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
  
  
  private int[][] grid;
  private SandDisplay display;
  
  public SandLab(int numRows, int numCols)
  {
    String[] names;
    names = new String[10];
    names[EMPTY] = "Empty";
    names[METAL] = "Metal";
    names[SAND] = "Sand";
    names[WATER] = "Water";
    names[ICE] = "Ice";
    names[FIRE] = "Fire";
    names[STEAM] = "Steam";
    names[RUST] = "Rust";
    names[LAVA] = "Lava";
    names[ROCK] = "Rock";
    display = new SandDisplay("Falling Sand", numRows, numCols, names);
    grid = new int[numRows][numCols];
  }
  
  private void locationClicked(int row, int col, int tool) {
	  grid[row][col] = tool;
  }

  public void updateDisplay() {
	  for (int i = 0; i < grid.length; i++) {
		  for (int j = 0; j < grid[0].length; j++) {
			  
			  if (grid[i][j] == EMPTY) {
				  display.setColor(i, j, Color.BLACK);
			  }
			  if (grid[i][j] == METAL) {
				  display.setColor(i, j, Color.GRAY);
			  }
			  if (grid[i][j] == SAND) {
				  display.setColor(i,  j, Color.YELLOW);
			  }
			  if (grid[i][j] == WATER) {
				  display.setColor(i, j, Color.BLUE);	  
			  }
			  if (grid[i][j] == ICE) {
				  display.setColor(i,  j, Color.CYAN);
			  }
			  if (grid[i][j] == FIRE) {
				  display.setColor(i,  j, Color.RED);
			  }
			  if (grid[i][j] == STEAM) {  
				  display.setColor(i,  j, Color.WHITE);
			  }
			  if (grid[i][j] == RUST) {
				  display.setColor(i,  j, Color.ORANGE);
			  }
			  if (grid[i][j] == LAVA) {
				  display.setColor(i,  j, new Color(111, 0, 0));
			  }
			  if (grid[i][j] == ROCK) {
				  display.setColor(i, j, new Color(69,69,69));
			  }
		   }
		  
	   }
   }

  public void step()
  {
	  Random rand = new Random();
	  int row = rand.nextInt(grid.length);
	  int column = rand.nextInt(grid[0].length);
	  
	  Element.behavior(row, column, grid);
	  	 
  }

  public void run()
  {
    while (true)
    {
      for (int i = 0; i < display.getSpeed(); i++)
        step();
      updateDisplay();
      display.repaint();
      display.pause(1);  //wait for redrawing and for mouse
      int[] mouseLoc = display.getMouseLocation();
      if (mouseLoc != null)  //test if mouse clicked
        locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
     }
  }
  
}

