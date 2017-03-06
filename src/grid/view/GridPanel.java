package grid.view;

import javax.swing.JPanel;
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import grid.controller.GridController;
import javax.swing.table.*;
import java.awt.color.*;


public class GridPanel extends JPanel 
{
	private GridController baseController;
	private SpringLayout baseLayout;
	private JLabel xLabel;
	private JLabel yLabel;
	private JLabel TitleLabel;
	private JLabel ChangeQuestion;
	private JLabel myProject;
	private JTextField footer;
	private JTextField XNum;
	private JTextField YNumber;
	private JButton chooseButton;
	
	
	private JScrollPane gridPane;
	private JTable gridTable;
	
	public GridPanel(GridController baseController)
	{
		this.baseController = baseController;
		this.XNum = new JTextField(3);
		this.xLabel = new JLabel("X");
		this.yLabel = new JLabel("Y");
		this.chooseButton = new JButton("Make your changes here!");
		this.baseLayout = new SpringLayout();
		
		this.TitleLabel = new JLabel("What is your power level!");
		baseLayout.putConstraint(SpringLayout.SOUTH, TitleLabel, -249, SpringLayout.SOUTH, this);
		
		this.ChangeQuestion = new JLabel("Type What the power level is!");
		
		this.footer = new JTextField(20);
		baseLayout.putConstraint(SpringLayout.NORTH, footer, 264, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, footer, -10, SpringLayout.EAST, this);
		

		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String [] {"1","2","3","4","5","6","7","8","9"});
		gridTable = new JTable();
		
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 100, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chooseButton, -30, SpringLayout.NORTH, gridPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -3, SpringLayout.NORTH, footer);
		
		
		
		gridPane.setViewportView(gridTable);
		this.YNumber = new JTextField(3);
		gridPane.setColumnHeaderView(YNumber);
		
		
	}
	
	private void setupPanel()
	{
	this.setLayout(baseLayout);
	this.setBackground(Color.BLUE);
	this.add(XNum);
	this.add(gridPane);
	this.add(xLabel);
	this.add(yLabel);
	this.add(chooseButton);
	this.add(TitleLabel);
	this.add(ChangeQuestion);
	this.add(footer);
	}
	private void setupLayout()
	{
		gridTable.setBackground(Color.ORANGE);
		baseLayout.putConstraint(SpringLayout.WEST, TitleLabel, 34, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, YNumber, 6, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, XNum, 6, SpringLayout.SOUTH, gridPane);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 26, SpringLayout.EAST, yLabel);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, -34, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, YNumber, 211, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, ChangeQuestion, 5, SpringLayout.NORTH, footer);
		baseLayout.putConstraint(SpringLayout.EAST, ChangeQuestion, -6, SpringLayout.WEST, footer);
		baseLayout.putConstraint(SpringLayout.EAST, XNum, -27, SpringLayout.WEST, ChangeQuestion);
		baseLayout.putConstraint(SpringLayout.WEST, chooseButton, 106, SpringLayout.EAST, TitleLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, yLabel, 31, SpringLayout.SOUTH, TitleLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, chooseButton, 9, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chooseButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, yLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, xLabel, 5, SpringLayout.NORTH, XNum);
		baseLayout.putConstraint(SpringLayout.EAST, xLabel, -20, SpringLayout.WEST, XNum);
		
	}
	private void setupListeners()
	{
		chooseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent click)
			{
				String xString = XNum.getText();
				String yString = YNumber.getText();
				int xInt = Integer.parseInt(xString);
				int yInt = Integer.parseInt(yString);
				if(yInt < 10 || xInt < 10 || xInt > 1 || yInt > 1)
				{
				gridTable.setValueAt(footer.getText(), xInt - 1, yInt - 1);
					
				}
				else
				{
					System.out.println("That doesn't work try again");
				}
			
			}
		});
	}
	
	public GridController getBaseController() 
	{
		return baseController;
	}

	public void setBaseController(GridController baseController) 
	{
		this.baseController = baseController;
	}
	
	
	
	
	
}