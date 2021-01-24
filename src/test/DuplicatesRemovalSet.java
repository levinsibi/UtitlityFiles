package test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
public class DuplicatesRemovalSet {
	public static void main(String[] argv) {
		List<Integer>list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(400);
		list1.add(500);
		list1.add(600);
		list1.add(600);
		list1.add(700);
		list1.add(400);
		list1.add(500);
		TreeSet<Integer>set = new TreeSet<Integer>(list1);
		System.out.println(set);
		List<Integer>list2 = new ArrayList<Integer>(set);
		System.out.println("List after removing duplicate elements:");
		for (Integer ob: list2)
			System.out.println(ob);
		for (Integer ob: set)
			System.out.println(ob);
	}
}