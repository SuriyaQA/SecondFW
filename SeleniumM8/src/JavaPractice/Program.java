package JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();
		
		obj.add("Selenium");
		obj.add(10);
		obj.add(true);
		obj.add(20.5);
		obj.add('s');
		
		System.out.println(obj);
		
		obj.add("Java");
		obj.add("Python");
		
		System.out.println(obj);
		
		ArrayList<String> obj2 = new ArrayList<String>();
		
		obj2.add("sql");
		obj2.add("Api");
	
		System.out.println(obj2);
		
		obj.remove("Java");
		obj.remove(4);
		
		System.out.println(obj);
		obj.remove(1);
		
		System.out.println(obj);
		
		obj2.addAll(obj);
		
		System.out.println(obj2);
		
		obj2.removeAll(obj);
		
		System.out.println(obj2);
		
		ArrayList obj3 = new ArrayList();
		
		obj3.add("revanth");
		obj3.add("Vignesh");
		
		obj3.addAll(obj2);
		obj3.addAll(obj);
		
		System.out.println(obj3);
		
		obj3.retainAll(obj2);
		
		System.out.println(obj3);
		
		obj3.addFirst("Manual Testing");
		
		System.out.println(obj3);
		
		obj3.add(2,"devops");
		
		System.out.println(obj3);
		
		System.out.println(obj2.contains("devops"));
	
		obj3.addAll(obj2);
		
		System.out.println(obj3.containsAll(obj));
		
		System.out.println(obj3);
		
		
		System.out.println(obj3.size());
		
		obj3.clear();
		
		System.out.println(obj3);
		
		System.out.println(obj3.isEmpty());
		
		
		System.out.println(obj);
		System.out.println(obj.get(2));
		
		System.out.println(obj.getFirst());

		System.out.println(obj.getLast());
		
		System.out.println(obj);
		
		for(Object o:obj) {
			System.out.println(o);
		}
		
		System.out.println(obj2);
		
		for(String s:obj2) {
			System.out.println(s);
		}
		
	    Iterator itr = obj.iterator();
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    HashSet hs = new  HashSet();
	    
	hs.add(1);
	hs.add(6);
	hs.add(5);
	hs.add(2);
	hs.add(4);
	   
	    
	    System.out.println(hs);
	}
}
