package DetermineWhetherTwoStringsAreAnagram;

import java.util.Arrays;

public class DetermineWhetherTwoStringsAreAnagram {

public static void main(String[] args){
  String str1 ="Team";
  String str2 ="Meat";
  
  str1=str1.toLowerCase(); //team
  str2=str2.toLowerCase(); //meat

  System.out.println("str1 in lower case - " +str1);
  System.out.println("str2 in lower case - " +str2);

  if(str1.length()!=str2.length()) {
    System.out.println("Not Anagram");
  }
  else {
    char[] string1=str1.toCharArray();
    char[] string2=str2.toCharArray();
    
    Arrays.sort(string1); // e t a m
    Arrays.sort(string2); // e t a m
 
    System.out.println("String 1 firstvalue " +string1[0]);
    System.out.println("String 1 secondvalue " +string1[1]);
    System.out.println("String 1 thirdvalue " +string1[2]);
       System.out.println("String 1 thirdvalue " +string1[3]);
    
    System.out.println("String 2 firstvalue " +string2[0]);
    System.out.println("String 2 secondvalue " +string2[1]);
    System.out.println("String 2 thirdvalue " +string2[2]);
    System.out.println("String 2 thirdvalue " +string2[3]);

    if(Arrays.equals(string1, string2)==true) {
     System.out.println("Both are anagram");
    }
    else {
      System.out.println("Not Anagram");
    }
  }

}

}
