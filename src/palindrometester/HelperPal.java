/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrometester;

import java.util.LinkedList;

/**
 *
 * @author mtsguest
 */
public class HelperPal 
{
    
    public boolean isPalindrome(LinkedList<String> aLL, LinkedList<String> aLL2)
    {
       if(aLL.equals(aLL2))
        return true;
       else
           return false;
    }
    
    public LinkedList<String> reverse(LinkedList<String> inputLL)
    {
        return new LinkedList<String>();
    }
    
    public boolean isEqual(LinkedList<String> aLL1, LinkedList<String> aLL2)
    {
        if (aLL1.equals(aLL2))
            return true;
        else
            return false;
    }
    
    
}
