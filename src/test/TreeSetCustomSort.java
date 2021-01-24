package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;


public class TreeSetCustomSort  implements Comparator<Students1> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students1 s1 = new Students1(105, "Sonoo", 23);
		Students1 s2 = new Students1(102, "Ravi", 21);
		Students1 s3 = new Students1(103, "Hanumat", 25);
		Students1 s4 = new Students1(106, "Hanumat", 25);
		Students1 s5 = new Students1(106, "Hanumat", 25);
		Students1 s6 = new Students1(123, "athi", 29);
		// creating arraylist
		TreeSet<Students1> hs = new TreeSet<Students1>(new TreeSetCustomSort());
		hs.add(s1);// adding Student class object
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		
		for(Students1 s:hs) {
			System.out.println(s.age +" "+s.name+" "+s.rollno);
		}
	}

	@Override
	public int compare(Students1 o1, Students1 o2) {
		// TODO Auto-generated method stub
		return o1.rollno-o2.rollno;
	}

	
	

}


class Students1{  
	  int rollno;  
	  String name;  
	  int age;  
	  Students1(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  