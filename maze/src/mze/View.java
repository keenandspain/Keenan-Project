package mze;
import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author keenandspain
 *View class provides a console with buttons. The user types in the file name and the maze appears in the console.
 */


public class View extends JFrame
{


		JTextArea console = new JTextArea(10,10);
		JScrollPane scroll = new JScrollPane(console);
		JButton solve = new JButton("Solve Maze");
		JButton open = new JButton("Open TextFile");
		JPanel p1 = new JPanel(new GridLayout(1,4));
		JButton clear = new JButton("Clear");
		JButton quit = new JButton("Quit");
		JTextField field = new JTextField(6);
		Font font = new Font("Verdana", Font.PLAIN, 15);
		
		
		
		public void go()
		{
			this.setLayout(new BorderLayout());
			this.setBounds(400,300,610,455);
			this.add(scroll,BorderLayout.CENTER);
			console.setBackground(Color.black);
			console.setForeground(Color.WHITE);
			console.setEditable(false);
			
			this.add(p1, BorderLayout.SOUTH);
			p1.setBackground(Color.black);
			p1.add(field);
			field.setForeground(Color.black);
			p1.add(clear);
			p1.add(quit);
			p1.add(solve);
			
			this.setTitle("Maze Sequence");
			this.setVisible(true);
			
		}
		
		
	}

