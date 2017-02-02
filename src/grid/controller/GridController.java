package grid.controller;

import grid.modle.NumberPanel;
import grid.view.GridFrame;

public class GridController
{
	
	private GridFrame appFrame;
	

	private NumberPanel [][] grid;
	
	public GridController()
	{
		grid = new NumberPanel[5][5];
		fillGrid();
		this.appFrame = new GridFrame(this);
	}
	
	private void fillGrid()
	{
		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[0].length; col++)
			{
				grid[row][col] = new NumberPanel();
			}
		}
	}
	
	public void start()
	{
		
	}

	public NumberPanel[][] getGrid() 
	{
		return grid;
	}
	
	public GridFrame getFrame() 
	{
		return appFrame;
	}

	public void setFrame(GridFrame appFrame) 
	{
		this.appFrame = appFrame;
	}

	public void setGrid(NumberPanel[][] grid) 
	{
		this.grid = grid;
	}
}