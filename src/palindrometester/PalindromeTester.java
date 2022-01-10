/*
 * 6159250
Title: :Linked List Palindrom
Semester: Fall 2019
Description: this program loads a file and checks wheter a file is a palindrome of not
 */
package palindrometester;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author mtsguest
 */
public class PalindromeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        File myFile;
        Scanner inFile = null;
        String word;
        
        LinkedList<String> possiblePal;
        LinkedList<String> pal;
        HelperPal myPalHelp = new HelperPal();
        
        try
        {
            myFile = new File("candidates.txt");
            inFile = new Scanner(myFile);
            while (inFile.hasNext())
            {
                word = inFile.next();
                
                possiblePal = makeLinkedList(word);
                populateList(possiblePal, word);
                pal = makeLinkedList(word);
                populateReverse(pal, word, possiblePal);
             
                
                
                
                if (myPalHelp.isPalindrome(possiblePal, pal))
                {
                    System.out.println(word + " is a Palindrome.");
                    
                }
                else
                {
                    System.out.println(word + " is NOT a Palindrome.");
                }
        
            }
      
        }
        catch (IOException e)
        {
            System.out.println("Sorry, wrong file.  Come back later.");
        }
        finally
        {
            if (inFile != null)
                inFile.close();
        }
        
    }
    
    public static LinkedList<String> makeLinkedList(String word)
    {
       
        return new LinkedList<String>();
    }
    
    public static void populateList(LinkedList possiblePal,String word)
    {
         for(int i=0; i< word.length(); i++)
        {
        possiblePal.push(word.charAt(i));
        }
         System.out.println(possiblePal);
    }
    public static void populateReverse( LinkedList pal,String word, LinkedList possiblePal)
    {
        for(int i= word.length()-1; i>= 0; i--)
        {
         pal.push(word.charAt(i)); 
        }
        System.out.println(pal + "rev" );
    }
    
    
}
