package grid.view;

import javax.swing.JFrame;

import grid.controller.GridController;

import java.awt.Dimension;

public class GridFrame extends JFrame
{
	
	private GridController baseController;
	private GridPanel appPanel;
	public GridFrame(GridController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new GridPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(900, 600));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public Object getBaseController() {
		// TODO Auto-generated method stub
		return null;
	}
}
