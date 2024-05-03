package Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
        v.add("kavita");
        v.add("bhanu");
        v.add("pooja");
        v.add("leena");
        v.add("reena");
        Iterator<String>itr = v.iterator();
        while(itr.hasNext()) {
        	
        	System.out.println(itr.next());
        }
        
	}

}
