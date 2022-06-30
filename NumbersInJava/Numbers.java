package NumbersInJava;
public class Numbers {
          public static void main(String args[])
          {
                    Integer x = 5;
                    // Returns byte primitive data type      
                    System.out.println( x.byteValue() );
                    // Returns double primitive data type
                    System.out.println(x.doubleValue());
                    // Returns long primitive data type
                    System.out.println( x.longValue() );

                    // public int compareTo( NumberSubClass referenceName )
                    Integer y = 5;
                    System.out.println(y.compareTo(3));
                    System.out.println(y.compareTo(5));
                    System.out.println(y.compareTo(8));

// public boolean equals(Object o)
                    Integer a = 5;
                    Integer b = 10;
                    Integer c = 5;
                    Short d = 5;
                    System.out.println(a.equals(b));
                    System.out.println(a.equals(d));
                    System.out.println(a.equals(c));
          }
}
                    
