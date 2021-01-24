package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class ArrayListCustomSort  implements Comparator<Students> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(105, "Sonoo", 23);
		Students s2 = new Students(102, "Ravi", 21);
		Students s3 = new Students(103, "Hanumat", 25);
		Students s4 = new Students(113, "Hanumat", 25);
		Students s5 = new Students(103, "Hallu", 23);
		Students s6 = new Students(123, "athi", 21);
		// creating arraylist
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		// Getting Iterator
		Collections.sort(al, new ArrayListCustomSort());
		Iterator itr = al.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Students st = (Students) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return (o1.rollno<o2.rollno?-1:o1.rollno>o2.rollno?1:0);
	}

}


class Students{  
	  int rollno;  
	  String name;  
	  int age;  
	  Students(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  