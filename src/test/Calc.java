package test;

import java.text.NumberFormat;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a=14.99f;
		float b=104.99f;
		NumberFormat formatter = NumberFormat.getInstance();
		String output = formatter.format(a+b);
		System.out.println(output);
	}

}
