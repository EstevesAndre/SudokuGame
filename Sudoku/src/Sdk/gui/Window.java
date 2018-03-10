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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.CardLayout;
import java.awt.Label;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;

public class Window {

	private JFrame frmSudoku;
	private Game game = new Game();
	private JTable gameScreen;
	private String[] c = {"Column 1","Column 2","Column 3","Column 4", "Column 5", "Column 6", "Column 7", "Column 8", "Column 9"};
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;

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
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setRowSelectionAllowed(false);
		table.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(3, 3, 3, 3)));
		table.setBackground(Color.GRAY);
		table.setBounds(23, 150, 170, 170);
		frmSudoku.getContentPane().add(table);
		// END - Button Fill

		JSeparator Divison1Vertical = new JSeparator();
		Divison1Vertical.setOrientation(SwingConstants.VERTICAL);
		Divison1Vertical.setBackground(new Color(0, 0, 0));
		Divison1Vertical.setForeground(new Color(0, 0, 0));
		Divison1Vertical.setBounds(191, 153, 10, 500);
		frmSudoku.getContentPane().add(Divison1Vertical);

		JSeparator Division2Vertical = new JSeparator();
		Division2Vertical.setOrientation(SwingConstants.VERTICAL);
		Division2Vertical.setForeground(Color.BLACK);
		Division2Vertical.setBackground(Color.BLACK);
		Division2Vertical.setBounds(357, 153, 10, 500);
		frmSudoku.getContentPane().add(Division2Vertical);

		JSeparator Division1Horizontal = new JSeparator();
		Division1Horizontal.setForeground(Color.BLACK);
		Division1Horizontal.setBackground(Color.BLACK);
		Division1Horizontal.setBounds(24, 317, 500, 10);
		frmSudoku.getContentPane().add(Division1Horizontal);

		JSeparator Division2Horizontal = new JSeparator();
		Division2Horizontal.setForeground(Color.BLACK);
		Division2Horizontal.setBackground(Color.BLACK);
		Division2Horizontal.setBounds(24, 483, 500, 10);
		frmSudoku.getContentPane().add(Division2Horizontal);	

		// START - Button TESTER
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

				/*gameScreen.setModel(
						new DefaultTableModel(game.getPuzzle(),c)
						{
							private static final long serialVersionUID = 1L;
							boolean[] columnEditables = new boolean[] 
									{
											false, false, false, false, false, false, false, false, false
									};
							public boolean isCellEditable(int row, int column) 
							{
								return columnEditables[column];
							}
						}
						);

				frmSudoku.repaint();*/
			}
		});
		// END - Button TESTER

/*
		// START - GAME SCREEN (TABLE)		
		gameScreen = new JTable(game.getPuzzle(),c);
		gameScreen.setColumnSelectionAllowed(true);
		gameScreen.setRowSelectionAllowed(false);

		gameScreen.setModel
		(new DefaultTableModel(new Object[][] {},	new String[] {"Column 1", "Column 2", "Column 3", "Column 4", "Column 5", "Column 6", "Column 7", "Column 8", "Column 9"}) 
		{
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] 
					{
							false, false, false, false, false, false, false, false, false
					};
			public boolean isCellEditable(int row, int column) 
			{
				return columnEditables[column];
			}
		}
				);

		gameScreen.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = -7911323175503878313L;

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
				final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

				if (column == table.getSelectedColumn()) {
					c.setBackground(new Color (57, 105, 138));
					c.setForeground(new Color (153, 153,153));
				} else if (row == table.getSelectedRow()) {
					c.setBackground(new Color (57, 105, 138));
					c.setForeground(new Color (153, 153,153));
				} else {
					if (row % 2 == 0) {
						c.setBackground(new Color (153, 153,153));
						c.setForeground(Color.black);
					} else {
						c.setBackground(new Color (153, 153,153));
						c.setForeground(Color.black);
					}
				}
				return c;

			}
		}
				);

		gameScreen.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		gameScreen.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		gameScreen.setBackground(new Color(153, 153, 153));

		gameScreen.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(0, 6, 10, 6)));

		gameScreen.setRowHeight(55);

		gameScreen.setBounds(24, 153, 500, 500);
		frmSudoku.getContentPane().add(gameScreen);
	*/	
		
		btnTester.setBounds(577, 100, 97, 25);
		frmSudoku.getContentPane().add(btnTester);
		
		table_1 = new JTable();
		table_1.setRowSelectionAllowed(false);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(3, 3, 3, 3)));
		table_1.setBackground(Color.GRAY);
		table_1.setBounds(191, 150, 170, 170);
		frmSudoku.getContentPane().add(table_1);
		
		table_2 = new JTable();
		table_2.setRowSelectionAllowed(false);
		table_2.setColumnSelectionAllowed(true);
		table_2.setCellSelectionEnabled(true);
		table_2.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(3, 3, 3, 3)));
		table_2.setBackground(Color.GRAY);
		table_2.setBounds(357, 150, 170, 170);
		frmSudoku.getContentPane().add(table_2);
		
		table_3 = new JTable();
		table_3.setRowSelectionAllowed(false);
		table_3.setColumnSelectionAllowed(true);
		table_3.setCellSelectionEnabled(true);
		table_3.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(3, 3, 3, 3)));
		table_3.setBackground(Color.GRAY);
		table_3.setBounds(23, 317, 170, 170);
		frmSudoku.getContentPane().add(table_3);
		
		table_4 = new JTable();
		table_4.setRowSelectionAllowed(false);
		table_4.setColumnSelectionAllowed(true);
		table_4.setCellSelectionEnabled(true);
		table_4.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(3, 3, 3, 3)));
		table_4.setBackground(Color.GRAY);
		table_4.setBounds(191, 317, 170, 170);
		frmSudoku.getContentPane().add(table_4);
		
		table_5 = new JTable();
		table_5.setRowSelectionAllowed(false);
		table_5.setColumnSelectionAllowed(true);
		table_5.setCellSelectionEnabled(true);
		table_5.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(3, 3, 3, 3)));
		table_5.setBackground(Color.GRAY);
		table_5.setBounds(357, 317, 170, 170);
		frmSudoku.getContentPane().add(table_5);
		
		table_6 = new JTable();
		table_6.setRowSelectionAllowed(false);
		table_6.setColumnSelectionAllowed(true);
		table_6.setCellSelectionEnabled(true);
		table_6.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(3, 3, 3, 3)));
		table_6.setBackground(Color.GRAY);
		table_6.setBounds(23, 483, 170, 170);
		frmSudoku.getContentPane().add(table_6);
		
		table_7 = new JTable();
		table_7.setRowSelectionAllowed(false);
		table_7.setColumnSelectionAllowed(true);
		table_7.setCellSelectionEnabled(true);
		table_7.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(3, 3, 3, 3)));
		table_7.setBackground(Color.GRAY);
		table_7.setBounds(191, 483, 170, 170);
		frmSudoku.getContentPane().add(table_7);
		
		table_8 = new JTable();
		table_8.setRowSelectionAllowed(false);
		table_8.setColumnSelectionAllowed(true);
		table_8.setCellSelectionEnabled(true);
		table_8.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), new EmptyBorder(3, 3, 3, 3)));
		table_8.setBackground(Color.GRAY);
		table_8.setBounds(357, 483, 170, 170);
		frmSudoku.getContentPane().add(table_8);

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
}
