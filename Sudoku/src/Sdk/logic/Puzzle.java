package Sdk.logic;

import java.util.Random;

public class Puzzle {

	private static int type;


	public int getType()
	{
		return type;
	}

	public static Object[][] puzzleStandardEasy()
	{
		Object[][] puzzle = { 
				{"4","0","5", "2","0","9", "6","0","0"},
				{"3","0","0", "0","5","0", "0","0","0"},
				{"0","1","6", "8","0","4", "0","3","0"},

				{"1","0","8", "0","0","0", "5","0","0"},
				{"0","2","0", "5","0","6", "0","9","0"},
				{"0","0","3", "0","0","0", "4","0","6"},

				{"0","3","0", "4","0","2", "7","5","0"},
				{"0","0","0", "0","8","0", "0","0","4"},
				{"0","0","2", "1","0","7", "3","0","8"}				
		};
		return puzzle;
	}
	public static Object[][] puzzleStandardMedium()
	{
		Object[][] puzzle = { 
				{"3","0","0", "6","5","0", "1","0","0"},
				{"0","2","0", "4","0","0", "5","0","0"},
				{"7","0","6", "2","0","0", "0","0","0"},

				{"9","0","0", "0","0","0", "0","1","0"},
				{"0","1","0", "3","0","2", "0","7","0"},
				{"0","8","0", "0","0","0", "0","0","9"},

				{"0","0","0", "0","0","5", "9","0","6"},
				{"0","0","5", "0","0","6", "0","2","0"},
				{"0","0","2", "0","8","3", "0","0","1"}
		};
		return puzzle;
	}
	public static Object[][] puzzleStandardHard()
	{
		Object[][] puzzle = { 
				{"0","5","0", "0","2","0", "0","0","0"},
				{"0","0","2", "4","6","0", "0","0","0"},
				{"0","1","4", "0","0","0", "3","0","0"},

				{"9","3","0", "0","5","0", "1","0","0"},
				{"0","0","0", "2","0","3", "0","0","0"},
				{"0","0","6", "0","7","0", "0","3","8"},

				{"0","0","1", "0","0","0", "9","6","0"},
				{"0","0","0", "0","1","8", "2","0","0"},
				{"0","0","0", "0","9","0", "0","7","0"}
		};
		return puzzle;
	}
	public static Object[][] puzzleStandardEvil()
	{
		Object[][] puzzle = { 
				{"0","0","0", "2","0","0", "0","0","0"},
				{"0","6","8", "0","0","5", "0","2","0"},
				{"0","0","9", "0","0","0", "8","0","7"},

				{"0","0","0", "0","6","0", "0","4","8"},
				{"0","5","0", "3","0","7", "0","1","0"},
				{"6","4","0", "0","8","0", "0","0","0"},

				{"1","0","7", "0","0","0", "3","0","0"},
				{"0","9","0", "7","0","0", "1","8","0"},
				{"0","0","0", "0","0","3", "0","0","0"}
		};
		return puzzle;
	}


	public static Object[][] createRandomPuzzle() {

		Object[][] puzzle = new Object[9][9];

		// TODO Auto-generated method stub
		Random nr = new Random();
		int num = nr.nextInt(4); // "0"(easy), "1"(medium), "2"(hard) and "3"(evil)

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
