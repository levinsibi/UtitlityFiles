package test;

import java.text.DecimalFormat;

public class ConversionChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df=new DecimalFormat("0.00");
		
		System.out.println(Integer.parseInt("5"));
		System.out.println(String.valueOf(10));
		System.out.println(Math.round(5.878f));
		System.out.println(df.format(27.5489));
		System.out.println(df.format(27));
		
		String k=df.format(27);
		System.out.println(k);
		
		float f1=(float)(15*10)/(3*3);
		System.out.println(f1);
		
		float f2=Float.parseFloat(df.format(f1));
		System.out.println("new f "+f2);
		System.out.println(df.format(f1));
		
		double d=(double)15;
		System.out.println(d);
	}

}
