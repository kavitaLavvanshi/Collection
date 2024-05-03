package Collection;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
	  Stack<String> s = new Stack<>();
	  s.push("ankit");
	  s.push("deepak");
	  s.pop();
	  s.push("sarika");
	  s.push("sneha");
	  s.pop();
	  Iterator<String>itr=s.iterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
		  
	  }
	

	}

}
