package gui_try2;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Sdk.logic.Game;

public class Graph {

	private JFrame frame;
	private Game game = new Game();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graph graph = new Graph();
					graph.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Graph() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		game = new Game();
		
		GameTable puzzle = new GameTable(game.getPuzzle());
		puzzle.setBounds(100, 100, 700, 700);
		
		frame.add(puzzle);
		
		System.out.println("SAD");
		
	}

}
