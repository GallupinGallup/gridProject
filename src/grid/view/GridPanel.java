package grid.view;

import javax.swing.*;

import grid.controller.GridController;

import java.awt.Color;
import java.awt.Dimension;



public class GridPanel extends JPanel 
{
	private JTextField rowField;
	private JTextField columnfield;
	private JTextField imputField;
	private SpringLayout baseLayout;

	public GridPanel(GridController baseController)
	{
		
		
		super();
		this.baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel() 
	{
		this.setPreferredSize(new Dimension(900, 600));
		this.setLayout(baseLayout);
	}

	private void setupLayout() 
	{
		
	}

	private void setupListeners() 
	{
		
	}

	public Object getBaseController() {
		// TODO Auto-generated method stub
		return null;
	}
}
