package basicprograms;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
//		ArrayList<Integer> list=new ArrayList<Integer>();
		//object using polymorphism 
		List<Integer> list=new ArrayList<>();
		
		list.add(34);
		list.add(56);
		list.add(45);
		list.add(34);
		System.out.println(list);
		System.out.println(list.size());
		list.add(77);
		list.add(99);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		System.out.println(list.size());
		//use for loop
		System.out.println("arrayList using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		//using for each loop
		System.out.println("\narrayList using for each loop");
		for(Integer in:list)
		{
			System.out.print(in+" ");
		}
		//using while loop
//		System.out.println("\nWhile loop arraylist");
//		int c=0;
//		while(c<list.size())
//		{
//			System.out.print(list.get(c)+" ");
//			c++;
//		}
//		System.out.println();
//		Iterator itr=list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next()+" ");
//		}
		//sort arraylist in ascending ordeer
		Collections.sort(list);
		System.out.println("after sorting: ");
		System.out.println(list);
		//sort arraylist in descending order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("\nAfter sorting in descending order: ");
		System.out.println(list);
		list.add(2, 100);
		System.out.println(list);
		
		//copy all elements to another arraylist
		ArrayList<Integer> list2=new ArrayList<>();
		list2.addAll(list);
		System.out.println("\ncopied list: "+list2);
	}

}
