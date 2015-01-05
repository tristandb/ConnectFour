package connectfour.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import connectfour.board.Board;
import connectfour.player.Player;

import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Gui extends JFrame {
	private List<JButton> buttonList = new ArrayList<JButton>();
	private List<GridBagConstraints> gridBagconstraints = new ArrayList<GridBagConstraints>();
	private JPanel contentPane;
	/**
	 * Create the grid
	 */
	public void setGrid(){
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
	}
	/**
	 * Set the JFrame variables.
	 */
	public void setFrameVariables(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	}
	/**
	 * Add buttons to the top
	 */
	public void addButtons(){
		for(int i = 0; i < Board.WIDTH; i++){
			buttonList.add(i, new JButton("Drop Mark"));
			gridBagconstraints.add(i, new GridBagConstraints());
			gridBagconstraints.get(i).insets = new Insets(0, 0, 0, 5);
			gridBagconstraints.get(i).gridx = i;
			gridBagconstraints.get(i).gridy = 0;
			contentPane.add(buttonList.get(i), gridBagconstraints.get(i));
		}
	}
	/**
	 * Create the frame.
	 */
	public Gui() {
		setFrameVariables();
		setGrid();
		addButtons();
	}
	
	public void addFields(){
		
	}
	
	public void setField(int field, Mark mark){
		
	}
	
	
}
