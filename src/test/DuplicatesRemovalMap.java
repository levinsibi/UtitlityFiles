package test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
public class DuplicatesRemovalMap {
	public static void main(String[] argv) {
		int[]a= {2,3,4,5,56};
		System.out.println(a.length);
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
		
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		
		for(Integer i:list1)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		for(Map.Entry<Integer, Integer>m1:map.entrySet())
		{
			if(m1.getValue()>1)
			{
				System.out.println(m1.getKey()+" "+m1.getValue());
			}
		}
	}
}