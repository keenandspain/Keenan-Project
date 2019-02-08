package Lab4;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;

import javax.swing.JFileChooser;

/**
 * This program allows the user to select a file using a dialog box and then encrypt it.
 * The key that is used to encrypt the bytes of the selected file is 2.
 * The key used to decrypt the selected file is -2.
 * @author keenandspain
 *
 */

public class Lab4Model 
{
	private Lab4View v;
	private Lab4Control c;
	public Lab4Model(Lab4Control fromC) { c=fromC; }
	public Lab4VariableClass variable;
	/**
	 * Reads a file from the user by using input streams.
	 *@Exception prints e.printStackTrace();
	 *@return returns the file that the user is trying to encrypt.
	 */
	
	public File readMethod()
	{
		JFileChooser chooser = new JFileChooser();
		try 
		{
			FileInputStream in = null;
			chooser.setVisible(true);
		
			if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			{
					File inputFile = chooser.getSelectedFile();
					in = new FileInputStream(inputFile);
					c.inputTF.setText(chooser.getSelectedFile().getName());
			}
			//cancel button selected
			else
			{
				
			}
			
		}
			
			
		
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		return chooser.getSelectedFile();
	}
		
		/**
		 * Resets the program by setting the text fields to null.
		 */
	public void resetMethod()
	{
			c.inputTF.setText("");
			c.outputTF.setText("");
	}
	/**
	 * Saves the encrypted file to the specified location.
	 * @return returns the file that is going to be encrypted.
	 */
		public File save()
		{
			FileDialog save = new FileDialog(c,"save...",FileDialog.SAVE);
			save.setVisible(true);
			c.outputTF.setText(save.getFile());
			File fileOut = new File(save.getDirectory(),save.getFile());
			return fileOut;
		}
		/**
		 * creates input stream of the input file. Creates output stream of the output file.
		 * then calls the encryptStream method.
		 * @param inputFile The file that will be encrypted.
		 * @param outputFile The file that is encrypted.
		 * @param key The key that is used to encrypted.
		 * @throws IOException
		 */
	
	public void encryptFile(File inputFile,File outputFile,int key) throws IOException
	{
		InputStream in = null;
		OutputStream out = null;
		try
		{
			in = new FileInputStream(inputFile);
			out = new FileOutputStream(outputFile);
			encryptStream(in, out,key);
		}
		
		finally
		
		{
			if (in !=null)in.close();
			if(out !=null)out.close();
		}
	}
	/**
	 * Takes the file that will be encrypted and reads it byte by byte.
	 * Then it writes the encrypted byte to a file. Calls the encrypt method.
	 * @param in input stream of the file being encrypted.
	 * @param out outputStream of the file being 
	 * @param key The key that will be used to encrypt the file.
	 * @throws IOException
	 */
	public void encryptStream(InputStream in,OutputStream out,int key) 
	throws IOException
	{
		boolean done = false;
	      while (!done)
	      {
	         int next = in.read();
	         if (next == -1) done = true;
	         else
	         {
	            byte b = (byte) next;
	            byte c = encrypt(b,key);
	            out.write(c);
	            
	         }
	      }
	}
	/**
	 * Encrypts The file by adding the original byte of the file to the key.
	 * @param b The byte of the file being encrypted.
	 * @param key The key that is being added to the file.
	 * @return
	 */
	public byte encrypt(byte b,int key)
	{
		if(c.verbose)
		{	
			key = 2;
		}
		else
		{
			key= -2;
		}
		return (byte) (b+key);
	}
}
