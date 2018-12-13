
/**
 * Class has two methods. One loads the array and the second prints the 
 * contents of the array.
 *
 * Eddie Orellana
 * November 14, 2018
 */

import java.util.*;
import java.io.*;

public class LoadArray
{
    private String fileName;
    
    // default constructor
    public LoadArray()
    {
        this.fileName = fileName;
    }
    
    // pass in a file of words to load into a 2
    public void LoadArray(String[][] wordsArray, String fileName) throws java.io.IOException 
    {
        
        Scanner input = new Scanner(new File(fileName));
                
        for(int row = 0; row < wordsArray.length; row++)
        {
            for(int col = 0; col < wordsArray[row].length; col++)
            {
                if(input.hasNextLine())
                {
                    wordsArray[row][col] = input.nextLine();
                }
            }
        }     
    }
    
    // used for testing
    public void printArray(String[][] wordsArray)
    {
        for(int row = 0; row < wordsArray.length; row++)
        {
            for(int col = 0; col < wordsArray[row].length; col++)
            {
                
                    System.out.println(wordsArray[row][col] + " ");
                
            }
        }     
        
        
    }
    
} // end of class

   
