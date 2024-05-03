package Collection;
import java.util.*;

public class ArrayListUsingForeachloop {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("bhanu");//Adding object in arraylist    
		  list.add("monu");    
		  list.add("sonu");    
		  list.add("ranu");    
		  //Traversing list through for-each loop  
		  for(String name:list)    
		    System.out.println(name);    
		  
		 }  	

	}


