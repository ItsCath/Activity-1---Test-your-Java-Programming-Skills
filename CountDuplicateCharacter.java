package CountDuplicateCharacter;

public class CountDuplicateCharacter {

public static void main(String [] args) {
  String str = "JavaJavaEEu";
  int length = str.length();
  char[] ch = str.toCharArray();
  for(int i=0;i<length;i++)
  {
    for(int j=i+1;j<length;j++) 
    {
      if(ch[i]==ch[j])
      {
        System.out.println("Duplicate characters are:    "+ch[j]);
        break; 
      }
    }
  }
}

}
