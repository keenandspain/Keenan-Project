package mze;


import java.util.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;



import java.awt.FlowLayout;
import java.awt.Font;
import java.io.*;

/**
 * @author keenandspain
 * Maze represents a maze of characters. The goal is to get from the
 * top left corner to the bottom right, following a path of ABC's. Each letter represents the number of moves it takes to be solved. 
 *	Arbitrary
 * constants are used to represent locations in the maze that have been TRIED
 * and that are part of the solution PATH.
 *
 * 
 */
public class Maze
{  
    private static final String TRIED = "2";
    private static final String PATH = "K";
    boolean go = true;
   
    
    
    View v = new View();

    int initialRows, initialColumns, finalRows, finalColumns;
    int k = -1; int n = 0;int z;
    
   private int numberRows, numberColumns;
  // private int[][] grid;
   private String[][]grid;
   
   private String [] letters = {"Z","Y","X","W","U","T","S","R","Q","P","O","N","M","L","K","J","I","H","G","F","E","D","C","B","A"};


    
    
   /**
    * Maze inputs a string with the filename inputed in the JTextField 
    * @param filename
    * @throws FileNotFoundException
    */
    public Maze(String filename) throws FileNotFoundException
    {   
        Scanner scan = new Scanner(new File(filename));
        numberRows = scan.nextInt();
        numberColumns = scan.nextInt();
        initialRows = scan.nextInt() - 1;
        initialColumns = scan.nextInt() - 1;
        finalRows = scan.nextInt() - 1;
        finalColumns = scan.nextInt() -1;
        
       
       // grid = new int[numberRows][numberColumns];
        grid = new String[numberRows][numberColumns];
        for (int i = 0; i < numberRows; i++)
        
        		for (int j = 0; j < numberColumns; j++)
        			//grid[i][j] = scan.nextInt();
        			grid[i][j] = scan.next();

         
    }
    
 
    
    
    /**
     * Marks the specified position in the maze as TRIED
     *
     * @param row the index of the row to try
     * @param col the index of the column to try 
     */
    public void tryPosition(int row, int col)
    {
        grid[row][col] = TRIED;
        
    
    }		

    /**
     * Return the number of rows in this maze
     *
     * @return the number of rows in this maze
     */
    public int getRows()
    {
        return grid.length;
    }
    
    /**
     * Return the number of columns in this maze
     *
     * @return the number of columns in this maze
     */
    public int getColumns()
    {
        return grid[0].length;
    }
    
    /**
     * Marks a given position in the maze as part of the PATH
     *
     * @param row the index of the row to mark as part of the PATH
     * @param col the index of the column to mark as part of the PATH 
     */
    public void markPath(int row, int col)
    {
    		
        //grid[row][col] = PATH;
   if(go)
   {
    		z =25-n;
    		go = false;
   }
   
    		//if()
    		
    		//for(int k;k<)
    		
    		grid[row][col] = letters[z++];
    		System.out.println(n);
    }	

    /**
     * Determines if a specific location is valid. A valid location
     * is one that is on the grid, is not blocked, and has not been TRIED.
     *
     * @param row the row to be checked
     * @param column the column to be checked
     * @return true if the location is valid    
     */
    public boolean validPosition(int row, int column)
    {
        boolean result = false;
 
        // check if cell is in the bounds of the matrix 
        if (row >= 0 && row < grid.length &&
            column >= 0 && column < grid[row].length)
	        {
        			if (grid[row][column].equals("."))
        			{
  
        	    		
        				result = true;
        			}
        				
        					
        					
	        }
            //  check if cell is not blocked and not previously tried 
           // if (grid[row][column] == 1)
        
        	
              

        return result;
    }		

    
    /**
     * Returns the maze as a string.
     * 
     * @return a string representation of the maze
     */
    public String toString()
    {
        String result = "\n";

        for (int row=0; row < grid.length; row++)
        {
            for (int column=0; column < grid[row].length; column++)
                result += grid[row][column] + "";
            result += "\n";
        }

        return result;
    }
    public void quit()
    {
    	
    	System.exit(0);
    }

}
