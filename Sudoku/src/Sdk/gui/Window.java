package Sdk.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;

import Sdk.logic.Game;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class Window {

	private JFrame frmSudoku;
	private Game game = new Game();
	private JTable gameScreen;
	private String[] c = {"Column 1","Column 2","Column 3","Column 4", "Column 5", "Column 6", "Column 7", "Column 8", "Column 9"};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmSudoku.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frmSudoku.
	 */
	private void initialize() {
		frmSudoku = new JFrame();
		frmSudoku.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmSudoku.setBounds(100, 100, 764, 752);
		frmSudoku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSudoku.getContentPane().setLayout(null);
		
		JLabel lblSudoku = new JLabel("Sudoku ");
		lblSudoku.setHorizontalAlignment(SwingConstants.CENTER);
		lblSudoku.setForeground(Color.BLACK);
		lblSudoku.setBackground(Color.ORANGE);
		lblSudoku.setFont(new Font("Monotype Corsiva", Font.ITALIC, 75));
		lblSudoku.setBounds(226, 13, 245, 111);
		frmSudoku.getContentPane().add(lblSudoku);
		
		JButton button_1 = new JButton("1");
		button_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		button_1.setEnabled(false);
		button_1.setBounds(544, 276, 53, 35);
		frmSudoku.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		button_2.setEnabled(false);
		button_2.setBounds(605, 276, 53, 35);
		frmSudoku.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		button_3.setEnabled(false);
		button_3.setBounds(670, 276, 53, 35);
		frmSudoku.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		button_4.setEnabled(false);
		button_4.setBounds(544, 324, 53, 35);
		frmSudoku.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		button_5.setEnabled(false);
		button_5.setBounds(605, 324, 53, 35);
		frmSudoku.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		button_6.setEnabled(false);
		button_6.setBounds(670, 324, 53, 35);
		frmSudoku.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		button_7.setEnabled(false);
		button_7.setBounds(544, 372, 53, 35);
		frmSudoku.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		button_8.setEnabled(false);
		button_8.setBounds(605, 372, 53, 35);
		frmSudoku.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		button_9.setEnabled(false);
		button_9.setBounds(670, 372, 53, 35);
		frmSudoku.getContentPane().add(button_9);
		
		JButton btnFill = new JButton("Fill");
		btnFill.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		btnFill.setEnabled(false);
		btnFill.setBounds(595, 438, 79, 35);
		frmSudoku.getContentPane().add(btnFill);
		
		JButton btnTester = new JButton("TESTER");
		btnTester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game = new Game();

				button_1.setEnabled(true);
				button_2.setEnabled(true);
				button_3.setEnabled(true);
				button_4.setEnabled(true);
				button_5.setEnabled(true);
				button_6.setEnabled(true);
				button_7.setEnabled(true);
				button_8.setEnabled(true);
				button_9.setEnabled(true);
				btnFill.setEnabled(true);
				
				gameScreen.setModel(new DefaultTableModel(game.getPuzzle(),c));
				frmSudoku.repaint();
			}
		});
		btnTester.setBounds(577, 100, 97, 25);
		frmSudoku.getContentPane().add(btnTester);
		
		gameScreen = new JTable(game.getPuzzle(),c);
		gameScreen.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		gameScreen.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		gameScreen.setCellSelectionEnabled(true);
		gameScreen.setBackground(new Color(153, 153, 153));
		
		gameScreen.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(0, 6, 10, 6)));
		
		//this 2 doesn't work...
		gameScreen.setAlignmentX(Component.CENTER_ALIGNMENT);
		gameScreen.setAlignmentY(Component.CENTER_ALIGNMENT);
		
		gameScreen.setRowHeight(55);
		
		gameScreen.setBounds(24, 153, 500, 500);
		frmSudoku.getContentPane().add(gameScreen);
		
		JMenuBar menuBar = new JMenuBar();
		frmSudoku.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnNewMenu = new JMenu("New");
		mnFile.add(mnNewMenu);
		
		JMenuItem mntmNewGme = new JMenuItem("New game");
		mnNewMenu.add(mntmNewGme);
		
		JMenuItem mntmQuitGame = new JMenuItem("Quit Game");
		mnFile.add(mntmQuitGame);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenu mnDifficult = new JMenu("Difficult");
		mnFile.add(mnDifficult);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
	}
	
	public String printPuzzle(int [][] puzzle)
	{
		String result = "";
		
		for(int[] line : puzzle)
		{
			for(int cell : line)
			{
				if(cell != 0)
					result += cell + " ";
				else
					result += "  ";
			}
			result += "\n";
		}
		
		return result;
	}
}
