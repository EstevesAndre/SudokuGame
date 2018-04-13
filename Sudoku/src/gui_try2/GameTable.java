package gui_try2;

import java.awt.Color;
import javax.swing.JPanel;

public class GameTable extends JPanel{

	public GameTable(Object[][] vals) {
		super();

		setBackground(Color.BLACK);
		setLayout(null);
		this.setBounds(0, 0, 700, 700);

		int x = 5, y = 5;
		int size = 75;
		float space = (float) 2.5;
		int counterx = 1;

		for(Object[] line : vals)
		{
			int countery = 1;
			
			for(Object c : line)
			{
				System.out.println(c);
				Cell cell = new Cell(true,c);
				cell.setBounds(x, y, size, size);
				add(cell);
				x += space + size;
				
				if(countery % 3 == 0 && countery != 0)
				{
					x += 5;
					countery = 0;
				}
				
				countery++;
			}
			x = 5;
			y += space + size;
			if(counterx % 3 == 0 && counterx != 0)
			{
				y += 5;
				counterx = 0;
			}

			counterx++;
		}


		// TODO Auto-generated constructor stub
	}
}
