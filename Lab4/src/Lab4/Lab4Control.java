package Lab4;

import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;


/**
 * This Control class contains the main method and implements actionListeners that are associated with methods.
 * @author keenandspain
 *
 */
	public class Lab4Control extends Lab4View implements ActionListener
	{
		File inputFile = null;
		File outputFile =null;
		public int key;
		boolean verbose;
		
		Lab4Model m = new Lab4Model(this);
		
		public Lab4Control()
		{
			read.addActionListener(this);
			encrypt.addActionListener(this);
			reset.addActionListener(this);
			decrypt.addActionListener(this);
			
		}
		/**
		 * Public Methods used to encrypt files.
		 */
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == read)
			{
				inputFile=m.readMethod();
			}
			else if (e.getSource() == encrypt)
			{
				verbose=true;
				outputFile=m.save();
				try {
					m.encryptFile(inputFile, outputFile ,key);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if (e.getSource() == reset)
			{
				m.resetMethod();
			}
			else if (e.getSource() == decrypt)
			{
				verbose =false;
				outputFile=m.save();
				try {
					m.encryptFile(inputFile, outputFile ,key);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
		
		public static void main(String[] args)
		{    
			new Lab4Control();  
		}
	}
