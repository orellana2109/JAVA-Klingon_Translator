
/** Main method - program takes user input from keyboard to translate
 *  an English sentence and translates it into Klingon.
 * 
 *
 * Eddie Orellana
 * November 12, 2018
 * Problem Set 9
 */

import java.util.*;
import java.io.*;


public class Klingon
{
      public static void main(String[] args)throws java.io.IOException    
      {         
        
        String[][] wordsArray = new String[16][2];
        String fileName = " ";
        boolean found = false;
        
        // Create OpenFile object to use methods
        OpenFile file = new OpenFile();
        
        // Open file from user input and if not found it will keep looping
        // NAME OF THE FILE IS words.txt
        while(found == false)
        {
            fileName = file.prompt();
            file.setFile(fileName);
            found = file.fileFound(file.getFile());
        }
        
        // Create LoadArray object to use methods
        LoadArray array = new LoadArray();
        
        // Load an array from the file that was opened
        array.LoadArray(wordsArray, file.getFile());
        
        // Create Translator object to use methods
        Translator translate = new Translator();
        
        // call the method and pass the array
        translate.translateKlingon(wordsArray);
        
      }
}
