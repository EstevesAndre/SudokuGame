package gui_try2;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Cell extends JButton{

	public Cell(boolean editable, Object text) {
		super();
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent key) {

				switch(key.getKeyCode())
				{
				case KeyEvent.VK_1:
				case KeyEvent.VK_NUMPAD1:
				{
					setText("1");			
					break;
				}
				case KeyEvent.VK_2:
				case KeyEvent.VK_NUMPAD2:
				{
					setText("2");			
					break;
				}
				case KeyEvent.VK_3:
				case KeyEvent.VK_NUMPAD3:
				{
					setText("3");			
					break;
				}
				case KeyEvent.VK_4:
				case KeyEvent.VK_NUMPAD4:
				{
					setText("4");			
					break;
				}
				case KeyEvent.VK_5:
				case KeyEvent.VK_NUMPAD5:
				{
					setText("5");			
					break;
				}
				case KeyEvent.VK_6:
				case KeyEvent.VK_NUMPAD6:
				{
					setText("6");			
					break;
				}
				case KeyEvent.VK_7:
				case KeyEvent.VK_NUMPAD7:
				{
					setText("7");			
					break;
				}
				case KeyEvent.VK_8:
				case KeyEvent.VK_NUMPAD8:
				{
					setText("8");
					break;
				}
				case KeyEvent.VK_9:
				case KeyEvent.VK_NUMPAD9:
				{
					setText("9");
					break;
				}
				case KeyEvent.VK_BACK_SPACE:
				case KeyEvent.VK_0:
				case KeyEvent.VK_NUMPAD0:
				{
					setText("");
					break;
				}
				default:
					break;
				}
			}
		});
		addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				setBackground(Color.WHITE);
			}
			@Override
			public void focusGained(FocusEvent e) {
				setBackground(Color.BLACK);
			}
		});

		this.setEnabled(editable);

		//if(!isEnabled())
			setBackground(Color.WHITE);

		this.setBounds(0, 0, 300, 300);

		this.setForeground(Color.BLUE);
		System.out.println((String)text);
		this.setText((String)text);
		//this.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		

	}

}
