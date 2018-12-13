/** Method takes in a 2D array as a parameters.
  * Prompts user for a sentence to translate, and uses tokens
  * to parse the sentence. Once parsed each token is used to 
  * check for the word in the array. If the word is found the translated
  * word is printed. If not found the original word is printed. 
  * 
  * Eddie Orellana
  * November 15, 2018
  * Problem Set 9
**/

import java.util.*;
import java.io.*;

public class Translator 
{
    
    public void translateKlingon(String[][] wordsArray)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence to translate: ");
        String sentence = input.nextLine();
                
        StringTokenizer string1 = new StringTokenizer(sentence);    
        String s1 = " ";
        boolean found = false;
        String wordFound = " ";
        
        System.out.println("\nSentenced translated to Klingon is: ");
        
        while(string1.hasMoreTokens())
        {               
            s1 = string1.nextToken();
           
            for (int row = 0; row < wordsArray.length; row++)        
            {   
                for (int col = 0; col < wordsArray[row].length; col++)     
                {
                    if(s1.equalsIgnoreCase(wordsArray[row][col]))
                    {    
                        found = true;
                        wordFound = wordsArray[row][1];   
                    } // end of if 
                } // end of inner loop 
            } // end of outer loop
            
            if(found == true)
            {
               System.out.print(wordFound + " ");
               found = false;    
            } 
            else 
            {
               System.out.print(s1 + " ");
            }
        } // end of while loop
    } // end of method
} // end of class
    


