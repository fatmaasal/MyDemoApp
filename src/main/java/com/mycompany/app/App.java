package com.mycompany.app;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static boolean search(ArrayList<Integer> array, Integer e, Integer f) {
        System.out.println("inside search");
        if (array == null) return false;
	if ((e == null)||(f == null)) return false;
	Integer mul=e*f;
	for (Integer elt : array) {
          if (elt == mul) return true;
        }
        return false;
    }
}
