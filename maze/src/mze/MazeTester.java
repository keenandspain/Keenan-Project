package mze;


import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * @author keenandspain
 * MazeTester uses recursion to determine if a maze can be traversed.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class MazeTester extends View implements ActionListener 

{   
	public View v;
	
	public MazeTester(View view)
	{
		v = view;
		v.solve.addActionListener(this);
		v.clear.addActionListener(this);
		v.quit.addActionListener(this);
		
	}
	
	
	/**
     * Creates a new maze, prints its original form, attempts to
     * solve it, and prints out its final form.
     */
	
    public static void main(String[] args) throws FileNotFoundException
    {
    		View v = new View();
    		v.go();
    		Font font = new Font("Verdana", Font.PLAIN, 15);
    		v.console.setFont(font);
    		
    		v.console.append("Enter the name of the file containing the maze in the TextField below");
    		MazeTester mazetest = new MazeTester(v);
    		/*String fileinput = v.field.getText();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the file containing the maze: ");
        String filename = scan.nextLine();
        
        Maze labyrinth = new Maze(filename);
        
       
        System.out.println(labyrinth);
        
        MazeSolver solver = new MazeSolver(labyrinth);
        if (solver.traverse(labyrinth.initialRows,labyrinth.initialColumns ))
            System.out.println("The maze was successfully traversed!");
        else
            System.out.println("There is no possible path.");
        System.out.println(labyrinth);*/
    }

    public void actionPerformed(ActionEvent e)
    {
    	 //Scanner scan = new Scanner(System.in);
    
    	 if (e.getSource() == v.solve)
    	 {
    		 System.out.println("Button");
    		 try {
		    		//String filename = "file2.txt";
    			 	String filename = v.field.getText();
		    	    Maze labyrinth = new Maze(filename);
		    		String fileinput = v.field.getText();
		    	    //Scanner scan = new Scanner(System.in);
		    	    System.out.print("Enter the name of the file containing the maze: ");
		    	    // String filename = scan.nextLine();
		    	        
		    	    
		    	    System.out.println(labyrinth);
		    	    String mazeInitial = new String (labyrinth.toString());
		    	    v.console.append("Maze Input " + "\n" );
		    	    v.console.append(mazeInitial);
		    	        
		    	    MazeSolver solver = new MazeSolver(labyrinth);
		    	    		if (solver.traverse(labyrinth.initialRows,labyrinth.initialColumns ))
		    	    		{
		    	    			
		    	            System.out.println("The maze was successfully traversed!");
		    	    			System.out.println(labyrinth);
		    	    			v.console.append("The maze was successfully traversed!" + "\n");
		    	    			String mazeFinal = new String (labyrinth.toString());
		    	    			v.console.append(mazeFinal);
		    	    		}
		    	        else
		    	        {
		    	            System.out.println("There is no possible path.");
		    	            v.console.append("There is no possible path" + "\n");
		    	            String mazeFinal = new String (labyrinth.toString());
		    	            v.console.append(mazeFinal);
		    	    			System.out.println(labyrinth);
		    	    			
		    	        }
    		 	}
    		 catch(Exception e1)
    		 {
    			 e1.printStackTrace();
    			 System.out.println("error");
    		 }
    		 
    	 }
 if (e.getSource() == v.clear)
    	 {
    		 
    		 System.out.println("cleared");
    		 v.console.setText("");
    		 v.field.setText("");
    		 v.console.setText("Enter the name of the file containing the maze in the TextField below");
    		 
    	 }
 if (e.getSource()== v.quit)
 {
//	 Maze maze = new Maze;
//	 .quit();
	 	System.out.println("quit button pressed");
		System.exit(0);
 }
 
 
 
    	 
    }    
}
