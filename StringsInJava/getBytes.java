package StringsInJava;

import java.io.*;

public class getBytes {
          public static void main(String args[]){
                    String Str1 = new String("Welcome to CPC Training at CCIT");
                    try{
                    byte[] Str2 = Str1.getBytes();
                    System.out.println("Returned Value " + Str2 );
                    }catch( Exception e){
                    System.out.println("Unsupported character set: "+ e.toString());
                    }
                    }
                    
}
