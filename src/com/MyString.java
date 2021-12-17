package com;

public class MyString {

	public static void main(String[] args) {
		
		MyString s = new MyString();
		System.out.println(s);
		
		String s1 = new String("Delhi");
		s1.length();
		
		String s2 = s1+"Delhi is India";
		System.out.println(s2);
		
		

		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("abcdefghijkl");
		System.out.println(sb1.capacity());
		
//		StringBuffer sb2 = new StringBuffer();
//		System.out.println(sb2.capacity());
//		
//		System.out.println(sb2.length());
		sb1.delete(1, 4);
		System.out.println(sb1);
		sb1.replace(0, 2, "mumbai");
		System.out.println(sb1);
		

	}

}
