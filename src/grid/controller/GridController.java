package grid.controller;

import grid.modle.NumberPanel;
import grid.view.GridFrame;

public class GridController
{
	
	private GridFrame appFrame;
	

	private NumberPanel [][] grid;
	
	public GridController()
	{
		this.appFrame = new GridFrame(this);
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