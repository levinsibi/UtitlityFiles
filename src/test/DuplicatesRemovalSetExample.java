package test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
public class DuplicatesRemovalSetExample {
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
		list1.add(100);
		TreeSet<Integer>set = new TreeSet<Integer>();
		TreeSet<Integer>set2 = new TreeSet<Integer>();
		
		for(Integer i:list1)
		{
			if(set.add(i)!=true)
			{
				System.out.println(i+" is duplicate");
				
			}
			else
				set2.add(i);
		}
		//System.out.println(set2);
		
		for(Integer i:set2)
		{
			System.out.println(i);
		}
	}
}