//Olivia Watt
import java.awt.*;

public class SandLab
{
  public static void main(String[] args)
  {
    SandLab lab = new SandLab(120, 80);
    lab.run();
  }
  
  //add constants for particle types here
  public static final int EMPTY = 0;
  public static final int BLOOD  = 1;
  public static final int ORANGEJUICE = 2;
  public static final int SAND = 3;
  public static final int GRASS = 4;
  public static final int WATER =  5;
  public static final int GRAPES = 6;
  public static final int FLOWERPARTICLES = 7;
  public static final int METAL = 8;

  //colors
  Color black = new Color(0, 0, 0);
  Color red = new Color(255, 18, 5);
  Color orange = new Color(255, 130, 5);
  Color yellow = new Color(245, 227, 125);
  Color green = new Color(124, 252, 0);
  Color blue = new Color(125, 249, 255);
  Color purple = new Color(90, 28, 176);
  Color pink = new Color(255, 181, 240);
  Color grey = new Color(220, 220, 220);
  
  //do not add any more fields
  private int[][] grid;
  private SandDisplay display;
  
  public SandLab(int numRows, int numCols)
  {
    String[] names;
    names = new String[9];
    names[EMPTY] = "Empty";
    names[BLOOD] = "Blood";
    names[ORANGEJUICE] = "Orange Juice";
    names[SAND] = "Sand";
    names[GRASS] = "Grass";
    names[WATER] = "Water";
    names[GRAPES] = "Grapes";
    names[FLOWERPARTICLES] = "Peony Particles";
    names[METAL] = "Metal";

    display = new SandDisplay("Falling Sand", numRows, numCols, names);
    grid = new int[numRows][numCols];
  }
  
  //called when the user clicks on a location using the given tool
  private void locationClicked(int row, int col, int tool)
  {
    grid[row][col] = tool;
  }

  //copies each element of grid into the display
  public void updateDisplay()
  {
    for(int r = 0; r < grid.length; r++) {
      for(int c = 0; c < grid[r].length; c++) {
        if(grid[r][c] == METAL) {
          display.setColor(r, c, grey);
        }
        else if(grid[r][c] == BLOOD) {
          display.setColor(r, c, red);
        }
        else if(grid[r][c] == ORANGEJUICE) {
          display.setColor(r, c, orange);
        }
        else if(grid[r][c] == SAND) {
          display.setColor(r, c, yellow);
        }
        else if(grid[r][c] == GRASS) {
          display.setColor(r, c, green);
        }
        else if(grid[r][c] == WATER) {
          display.setColor(r, c, blue);
        }
        else if(grid[r][c] == GRAPES) {
          display.setColor(r, c, purple);
        }
        else if(grid[r][c] == FLOWERPARTICLES) {
          display.setColor(r, c, pink);
        }
        else {
          display.setColor(r, c, black);
        }
      }
    }
  }

  //called repeatedly.
  //causes one random particle to maybe do something.
  public void step()
  {
    int down = 0;
    int left = 1;
    int right = 2;
    int d = (int)(Math.random() * 3);
    int r = (int)(Math.random() * 119);
    int c = (int)(Math.random() * 80);
    int c2 = (int)((Math.random() * 79) + 1);
    int c3 = (int)(Math.random() * 79);

    //sand
    if((grid[r][c] == SAND && grid[r + 1][c] == EMPTY) || (grid[r][c] == SAND && grid[r + 1][c] == WATER)) {
      int temp = grid[r + 1][c];
      grid[r + 1][c] = grid[r][c];
      grid[r][c] = temp;
    }

    //grapes
    if((grid[r][c] == GRAPES && grid[r + 1][c] == EMPTY)) {
      int temp = grid[r + 1][c];
      grid[r + 1][c] = grid[r][c];
      grid[r][c] = temp;
    }

    //water
    if(d == down && grid[r][c] == WATER && grid[r + 1][c] == EMPTY) {
      int temp = grid[r + 1][c];
      grid[r + 1][c] = grid[r][c];
      grid[r][c] = temp;
      }
    if(d == left && grid[r][c2] == WATER && grid[r][c2 - 1] == EMPTY) {
      int temp = grid[r][c2 - 1];
      grid[r][c2 - 1] = grid[r][c2];
      grid[r][c2] = temp;
    }
    if(d == right && grid[r][c3] == WATER && grid[r][c3 + 1] == EMPTY) {
      int temp = grid[r][c3 + 1];
      grid[r][c3 + 1] = grid[r][c3];
      grid[r][c3] = temp;
    }

    //blood
    if(d == down && grid[r][c] == BLOOD && grid[r + 1][c] == EMPTY) {
      int temp = grid[r + 1][c];
      grid[r + 1][c] = grid[r][c];
      grid[r][c] = temp;
      }
    if(d == left && grid[r][c2] == BLOOD && grid[r][c2 - 1] == EMPTY) {
      int temp = grid[r][c2 - 1];
      grid[r][c2 - 1] = grid[r][c2];
      grid[r][c2] = temp;
    }
    if(d == right && grid[r][c3] == BLOOD && grid[r][c3 + 1] == EMPTY) {
      int temp = grid[r][c3 + 1];
      grid[r][c3 + 1] = grid[r][c3];
      grid[r][c3] = temp;
    }

    //orange juice
    if(d == down && grid[r][c] == ORANGEJUICE && grid[r + 1][c] == EMPTY) {
      int temp = grid[r + 1][c];
      grid[r + 1][c] = grid[r][c];
      grid[r][c] = temp;
      }
    if(d == left && grid[r][c2] == ORANGEJUICE && grid[r][c2 - 1] == EMPTY) {
      int temp = grid[r][c2 - 1];
      grid[r][c2 - 1] = grid[r][c2];
      grid[r][c2] = temp;
    }
    if(d == right && grid[r][c3] == ORANGEJUICE && grid[r][c3 + 1] == EMPTY) {
      int temp = grid[r][c3 + 1];
      grid[r][c3 + 1] = grid[r][c3];
      grid[r][c3] = temp;
    }
  }
  
  //do not modify
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