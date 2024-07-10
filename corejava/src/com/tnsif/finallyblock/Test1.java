package com.tnsif.finallyblock;

public class Test1 {
	public static void main(String[] args) {
		int a=8,b=0,c;
		try {
			c=a/b;
			System.out.println("c="+c);
		}
		catch(ArithmeticException e) {
			System.out.println("exception");
		}
		finally {
			System.out.println("hello");
		}
	}

}
