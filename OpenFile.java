
/** Class opens a file from user input and validates 
 *  if the file exist. Provides feedback in both cases
 * 
 *
 * Eddie Orellana
 * November 12, 2018
 * Problem Set 9
 */

import java.io.*;
import java.util.*;

public class OpenFile
{
    private String inputFile;

    // default constructor
    public OpenFile()
    {
        this.inputFile = inputFile;
      
    }
    
    public OpenFile(String x)
    {
        inputFile = x;
        
    }
    
    // ask user for the file name that holds the words
    public String prompt()
    {
        Scanner userInput = new Scanner(System.in);
        String fileName;
        
        OpenFile x = new OpenFile();
        
        System.out.println("Input file name: (words.txt)");
        fileName = userInput.nextLine().trim();
        
        return fileName;
    }
    
    // file found validation
    public boolean fileFound(String inputFile)
    {
        File input = new File(inputFile);
        
        if(input.exists())
        {
            System.out.println("File Found\n");
            return true;
        } else
        {
            System.out.println("File not found\n");
            return false;
        }
    }
    
    //MUTATOR METHOD
    public void setFile(String x)
    {
        inputFile = x;
    }
    
    //SELECTOR METHOD
    public String getFile()
    {
        return inputFile;
    }
          
          
}
