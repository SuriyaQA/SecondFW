package JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Program1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("java");
		al.add("java");
		al.add(20.5);
		al.add('s');
		al.add(true);
		
  System.out.println(al);
		
    HashSet hs = new HashSet();
    
    hs.add("java");
    hs.add("Java");
    hs.add(20.5);
    hs.add('s');
    
    
    System.out.println(hs);
    
	}
}
