package Lab4;

import javax.swing.*;
import java.awt.*;
/**
 * This view class creates a layout that allows users to select buttons to encrypt a file.
 * @author keenandspain
 *
 */
public class Lab4View extends JFrame
{
	JButton encrypt = new JButton("Encrypt");
	JButton read = new JButton("Read");
	JButton reset = new JButton("Reset");
	JButton decrypt = new JButton("Decrypt");
	JLabel inputLabel = new JLabel("Input");
	JLabel outputLabel = new JLabel("Output");
	JTextField inputTF = new JTextField(8);
	JTextField outputTF = new JTextField(8);
	JCheckBox box = new JCheckBox("Encryption");
	JFrame frame = new JFrame();
	
	Lab4View()
	{
		this.setLayout(new GridLayout(4,2));
		this.setBounds(400,400,375,150);
		this.add(read);
		this.add(reset);
		add(encrypt);
		add(decrypt);
		add(inputLabel);
		inputLabel.setForeground(Color.white);
		add(inputTF);
		inputTF.setBackground(Color.LIGHT_GRAY);
		add(outputLabel);
		outputLabel.setForeground(Color.WHITE);
		add(outputTF);
		outputTF.setBackground(Color.LIGHT_GRAY);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.setTitle("Encryption");
		this.setVisible(true);
	}

}
