package Collection;
import java.util.*;

public class SortArrayList {

	public static void main(String[] args) {
		 List<String> list1=new ArrayList<String>();  
		  list1.add("kavi");  
		  list1.add("navi");  
		  list1.add("Baa");  
		  list1.add("Gayu");  
		  //Sorting the list  
		  Collections.sort(list1);  
		  for(String name:list1)  
		    System.out.println(name);  
		      
		 System.out.println("Sorting numbers...");  
		  //Creating a list of numbers  
		  List<Integer> list2=new ArrayList<Integer>();  
		  list2.add(61);  
		  list2.add(81);  
		  list2.add(91);  
		  list2.add(7);  
		  //Sorting the list  
		  Collections.sort(list2);    
		  for(Integer number:list2)  
		    System.out.println(number); 

	}

}
