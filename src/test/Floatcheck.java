package test;

import java.text.NumberFormat;

public class Floatcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NumberFormat formatter = NumberFormat.getInstance();
		
		float f=(float) 0.00;
		
		String output = formatter.format(f);
		System.out.println(output);
		String res=String.format("%.2f",f);
		System.out.println(res);
	}

}
