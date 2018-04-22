package Sdk.logic;

import java.util.Random;

public class Puzzle {

	private static int type;
	private final int[][] grid;
	
	public Puzzle(int [][] x)
	{
		grid = x;
	}
	

	public int getType()
	{
		return type;
	}

	public static Object[][] puzzleStandardEasy()
	{
		Object[][] puzzle = { 
				{"   4","    ","   5", "   2","    ","   9", "   6","    ","    "},
				{"   3","    ","    ", "    ","   5","    ", "    ","    ","    "},
				{"    ","   1","   6", "   8","    ","   4", "    ","   3","    "},

				{"   1","    ","   8", "    ","    ","    ", "   5","    ","    "},
				{"    ","   2","    ", "   5","    ","   6", "    ","   9","    "},
				{"    ","    ","   3", "    ","    ","    ", "   4","    ","   6"},

				{"    ","   3","    ", "   4","    ","   2", "   7","   5","    "},
				{"    ","    ","    ", "    ","   8","    ", "    ","    ","   4"},
				{"    ","    ","   2", "   1","    ","   7", "   3","    ","   8"}				
		};
		return puzzle;
	}
	public static Object[][] puzzleStandardMedium()
	{
		Object[][] puzzle = { 
				{"   3","    ","    ", "   6","   5","    ", "   1","    ","    "},
				{"    ","   2","    ", "   4","    ","    ", "   5","    ","    "},
				{"   7","    ","   6", "   2","    ","    ", "    ","    ","    "},

				{"   9","    ","    ", "    ","    ","    ", "    ","   1","    "},
				{"    ","   1","    ", "   3","    ","   2", "    ","   7","    "},
				{"    ","   8","    ", "    ","    ","    ", "    ","    ","   9"},

				{"    ","    ","    ", "    ","    ","   5", "   9","    ","   6"},
				{"    ","    ","   5", "    ","    ","   6", "    ","   2","    "},
				{"    ","    ","   2", "    ","   8","   3", "    ","    ","   1"}
		};
		return puzzle;
	}
	public static Object[][] puzzleStandardHard()
	{
		Object[][] puzzle = { 
				{"    ","   5","    ", "    ","   2","    ", "    ","    ","    "},
				{"    ","    ","   2", "   4","   6","    ", "    ","    ","    "},
				{"    ","   1","   4", "    ","    ","    ", "   3","    ","    "},

				{"   9","   3","    ", "    ","   5","    ", "   1","    ","    "},
				{"    ","    ","    ", "   2","    ","   3", "    ","    ","    "},
				{"    ","    ","   6", "    ","   7","    ", "    ","   3","   8"},

				{"    ","    ","   1", "    ","    ","    ", "   9","   6","    "},
				{"    ","    ","    ", "    ","   1","   8", "   2","    ","    "},
				{"    ","    ","    ", "    ","   9","    ", "    ","   7","    "}
		};
		return puzzle;
	}
	public static Object[][] puzzleStandardEvil()
	{
		Object[][] puzzle = { 
				{"    ","    ","    ", "   2","    ","    ", "    ","    ","    "},
				{"    ","   6","   8", "    ","    ","   5", "    ","   2","    "},
				{"    ","    ","   9", "    ","    ","    ", "   8","    ","   7"},

				{"    ","    ","    ", "    ","   6","    ", "    ","   4","   8"},
				{"    ","   5","    ", "   3","    ","   7", "    ","   1","    "},
				{"   6","   4","    ", "    ","   8","    ", "    ","    ","    "},

				{"   1","    ","   7", "    ","    ","    ", "   3","    ","    "},
				{"    ","   9","    ", "   7","    ","    ", "   1","   8","    "},
				{"    ","    ","    ", "    ","    ","   3", "    ","    ","    "}
		};
		return puzzle;
	}


	public static Object[][] createRandomPuzzle() {

		Object[][] puzzle = new Object[9][9];

		// TODO Auto-generated method stub
		Random nr = new Random();
		int num = nr.nextInt(4); // " "(easy), "1"(medium), "2"(hard) and "3"(evil)

		type = num;
		
		switch(num)
		{
		case 0:
			puzzle = puzzleStandardEasy();
			break;
		case 1:
			puzzle = puzzleStandardMedium();
			break;
		case 2:
			puzzle = puzzleStandardHard();
			break;
		case 3:
			puzzle = puzzleStandardEvil();
			break;
		default:
		}

		return puzzle;
	}

	public static Object[][] createRandomPuzzle(int type2) {
		// TODO Auto-generated method stub
		Object[][] puzzle = new Object[9][9];

		type = type2;
		
		switch(type2)
		{
		case 0:
			puzzle = puzzleStandardEasy();
			break;
		case 1:
			puzzle = puzzleStandardMedium();
			break;
		case 2:
			puzzle = puzzleStandardHard();
			break;
		case 3:
			puzzle = puzzleStandardEvil();
			break;
		default:
		}

		return puzzle;
	}

}
