package com.peckVsTrain.OneDirectionCoders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyWindow extends JComponent 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	public MyWindow()
	{
		super();
		initialize();
	}
	public void initialize()
	{
		frame = new JFrame();
		Dimension size = PeckUtils.getScreenSize();
		frame.setPreferredSize(new Dimension(size.width/2, size.height/2));
		frame.setTitle("Peck Vs. Train");
		JPanel contentArea = new JPanel();
		contentArea.setBackground(Color.white);
		contentArea.setName(frame.getRootPane().getName() + ".contentArea");
		contentArea.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setContentPane(contentArea);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(size.width/2, 0);
	}
	public static void main(String [] args)
	{
		MyWindow test = new MyWindow();
		test.setVisible(true);
	}
}
