package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;


public class TreeSetCustomSortString  implements Comparator<StudentsNew> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsNew s1 = new StudentsNew(105, "Sonoo", 23);
		StudentsNew s2 = new StudentsNew(102, "Ravi", 21);
		StudentsNew s3 = new StudentsNew(103, "Hanumat", 25);
		StudentsNew s4 = new StudentsNew(106, "Hanumat", 25);
		StudentsNew s5 = new StudentsNew(106, "Hanumat", 25);
		StudentsNew s6 = new StudentsNew(123, "Athi", 29);
		// creating arraylist
		TreeSet<StudentsNew> hs = new TreeSet<StudentsNew>(new TreeSetCustomSortString());
		hs.add(s1);// adding Student class object
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		
		for(StudentsNew s:hs) {
			System.out.println(s.age +" "+s.name+" "+s.rollno);
		}
	}

	@Override
	public int compare(StudentsNew o1, StudentsNew o2) {
		// TODO Auto-generated method stub
		System.out.println(o1.name);
		return o1.name.compareTo(o2.name);
	}

	
	

}


class StudentsNew{  
	  int rollno;  
	  String name;  
	  int age;  
	  StudentsNew(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  