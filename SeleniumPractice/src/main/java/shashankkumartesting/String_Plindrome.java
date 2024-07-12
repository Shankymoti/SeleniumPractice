package shashankkumartesting;

import java.util.Scanner;

public class String_Plindrome {

	public static void main(String[] args) {
		String s= "malayalam";
		String temp = s;
		String rev = "";
		
		for(int i=s.length()-1; i<=0; i--) {
			rev =rev +s.charAt(i);
		}
		
		if(temp.equals(temp)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindropme");
		}

	
	// By using Scanner Class
	
	Scanner sc= new Scanner(System.in);
	
	//System.out.print("Enter String");
	
	String s1 = sc.next();
	String rev2 = "";
	
	
	for(int i=s1.length()-1; i>=0; i--) {
		rev2 = rev2 + s1.charAt(i);
	}
	
	if(rev2.equals(s1)) {
		System.out.println("String is palindrome");
}else {
	System.out.println("String is not plindrome");
	}
	
}}
