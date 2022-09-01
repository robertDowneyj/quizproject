package com.output;

public class SwapString {
	
//	write code to swap 2 string without using third variable
	public static void main(String[] args) {
		String s1="nikita";
		String s2="ashok";
		
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("s1>>"+s1);
		System.out.println("s2>>"+s2);
		
	}
}
