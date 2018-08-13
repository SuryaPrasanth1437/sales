package oops;

import java.util.Scanner;

public class Salestax 
{
	double s,st,sc,ut;
	public static void main(String[] args)
	{
		Salestax s1=new Salestax();
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the sales");
		s1.s=s2.nextDouble();
		s1.st=s1.s*5/100;
		s1.sc=s1.s*5/100;
		s1.ut=s1.s+s1.st+s1.sc;
		System.out.println("the sales amount"+s1.s);
		System.out.println("sale tax is"+s1.st);
		System.out.println("surge charge is"+s1.sc);
		System.out.println("net amount is"+s1.ut);
		s2.close();
	}

}
