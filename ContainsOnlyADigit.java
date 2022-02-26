package checkifstringcontainsonlyadigit;

public class ContainsOnlyADigit {

public static boolean isEmpty( CharSequence cs){
  
  return cs == null || cs.length() == 0;
}


 public static boolean isNumeric(CharSequence cs){
   if(isEmpty(cs)){
     return false;
   }
   
   int len = cs.length();
   for(int i=0; i<len; i++){
     if( ! Character.isDigit(cs.charAt(i))){
       return false;
     }
   }
   
   return true;
   
 }
 
 
 
 
 
 public static void main(String[] args) {
   
   
   System.out.println(isNumeric("9"));
   System.out.println(isNumeric("ab"));
   System.out.println(isNumeric("1001"));
   System.out.println(isNumeric("cath"));
   System.out.println(isNumeric("5"));
   
 }
}
