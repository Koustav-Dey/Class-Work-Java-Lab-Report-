package basicprograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//Stack<String> stack=new Stack<>();
		LinkedList<String> names=new LinkedList<>();
		names.add("monojit");
		names.add("subhankar");
		names.add("priya");
		names.add("riya");
		names.add("ibtesam");
		//stack.pop();
		//System.out.println(stack);
		for(String str:names)
		{
			System.out.println(str);
		}
		System.out.println("===============================");
		Iterator itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		names.addFirst("First");
		names.addLast("last");
		names.add(2, "shrabani");
		System.out.println(names);
		names.removeLast();
		names.removeFirst();
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		names.remove("priya");
		System.out.println(names);
		
		ListIterator listitr=names.listIterator();
		System.out.println("Forward direction: ");
		while(listitr.hasNext())
		{
			System.out.println(listitr.next());
		}
		System.out.println("backward direction: ");
		while(listitr.hasPrevious())
		{
			System.out.println(listitr.previous());
		}
		System.out.println("++++++++++++++++++++++++");
		Iterator it=names.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		if(names.contains("riya"))
		{
			System.out.println("data present");
		}
		else
			System.out.println("data not present");
		names.push("kundan");
		System.out.println(names);
		names.pop();
		System.out.println(names);
		names.poll();
		System.out.println(names);
		
	}

}