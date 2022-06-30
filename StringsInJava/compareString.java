package StringsInJava;
public class compareString{
          public static void main(String args[]) {
                    String str1 = "Strings are immutable";

                    String str2 = new String("Strings are immutable");
                    System.out.println(str2.length());
                    
                    String str3 = new String("Integers are not immutable and are not really good!");
                    System.out.println(str3.length());
                    int result = str1.compareTo( str2 );
                    System.out.println(result);

                    result = str2.compareTo( str3 );
                    System.out.println(result);

                    System.out.println(str3.length());
                    System.out.println(str2.length());
                    }
                    
}
