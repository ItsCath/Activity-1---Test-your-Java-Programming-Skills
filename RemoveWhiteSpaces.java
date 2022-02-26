package RemoveWhiteSpaces;

public class RemoveWhiteSpaces {

public static void main(String[] arg) {
String str = "  He  ll  o  s  ta  r  ";
String str1 = str.replaceAll("\\s", "");
System.out.println(str1);

}

}
