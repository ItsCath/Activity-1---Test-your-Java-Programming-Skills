/*

* Find firat non-repeated character in a string.
*
* Input = AABCDEFBCH
* Output = D (it is the first non-repeated character)
*/
package FindFirstNonRepeatedCharacter;

import java.util.*;
import java.util.Scanner;

public class FindFirstNonRepeatedCharacter {

/**
* @cath args the command line arguments
*/
public static void main(String[] args) {
  
  System.out.println("Please enter an input string");
  
  // Take a input
  Scanner in = new Scanner(System.in);
  
  // Asign value into str
  String str = in.nextLine();
  
  // Length of a string
  int len = str.length();
  
  // Using HashMap
  HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();
  
  Character ch;
  
  /* Traverse a string and create a hash table for character and its's count.
  If there is no value stored for a character then set it to 1.
  Else we increment the character value by 1 */
  
  for(int i = 0; i < len; i++) {
    
    ch = str.charAt(i);
    
    // If character is already exist then increment it's count by 1
    if(charcount.containsKey(ch)) {
      
      charcount.put(ch, charcount.get(ch)+1);
      
    }else {
      
      // If no value stored for a character then set it to 1
      charcount.put(ch, 1);
    }
  }
  
  for (int j = 0; j < len; j++) {
    
    ch = str.charAt(j);
    
    if(charcount.get(ch) == 1){
      
      System.out.println("First non-repeated character is " + ch );
      break;
    }
  }
}


}
