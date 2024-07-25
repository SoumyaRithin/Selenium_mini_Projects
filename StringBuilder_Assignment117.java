package sele_launch;

public class StringBuilder_Assignment117 {
	
	public static void main(String[] args) {
		
	
	StringBuilder s1= new StringBuilder("Automation");//mutable
	System.out.println(s1);
	 s1=s1.append(" Testing");
	 System.out.println(s1);
	s1.insert(0, "selenium ");
	
	 System.out.println(s1);
	s1.replace(0, 8, "replace");
	System.out.println(s1);
	s1.delete(0, 8);
	System.out.println(s1);
	s1.reverse();
	System.out.println(s1);
	s1.reverse();
	int a1=s1.capacity();
	System.out.println(a1);
	char s2=s1.charAt(8);
	System.out.println(s2);
	
	int a2=s1.length();
	System.out.println(a2);
	String s3=s1.substring(11);
	System.out.println(s3);
	
	String s4=s1.substring(0,2);
	System.out.println(s4);
}}
