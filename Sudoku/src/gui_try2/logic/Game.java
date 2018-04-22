package Sdk.logic;

public class Game {

	protected Object[][] sudokuPuzzle = { };
	
	public Game() {
		// TODO Auto-generated constructor stub
		sudokuPuzzle = Puzzle.createRandomPuzzle(); 
	}
	
	public Game(int type) {
		// TODO Auto-generated constructor stub
		sudokuPuzzle = Puzzle.createRandomPuzzle(type); 
	}
	
	public Object[][] getPuzzle()
	{
		return sudokuPuzzle;
	}

}
