package arrayList;
import java.util.*;

public class Demo1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	//	ArrayList<String> list2 = new ArrayList<String>();
	//	ArrayList<Boolean> list3 = new ArrayList<Boolean>();
		
		// Add elements
		list.add(0);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//get element
		int element = list.get(0);
		System.out.println(element);
		
		//add element in between
		list.add(1, 5);
		System.out.println(list);
		
		//to set or replace element
		list.set(0, 8);
		System.out.println(list);
		
		//to delete/ remove elemet
		list.remove(3);
		System.out.println(list);
		
		//to get the size of arraylist
		int size = list.size();
		System.out.println(size);
		
		//loops
		for (int i=0; i<list.size(); i++) {
			System.out.print(i+ ",");
		}
		System.out.println();
		
		//sort 
		Collections.sort(list);
		System.out.println(list);
		
	}
	

}
