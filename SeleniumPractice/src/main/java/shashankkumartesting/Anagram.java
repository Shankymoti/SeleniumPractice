package shashankkumartesting;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1= "Care";
	String s2 = "Race";
	
	s1 = s1.toLowerCase();
	s2 = s2.toLowerCase();
	
	if(s1.length() != s2.length()) {
		System.out.println("String are not anagram");
		
	}else {
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		 if(Arrays.equals(ch1, ch2)) {
			 System.out.println("String are anagram");
		 }
		 else {
			 
			 System.out.println("String are not anagram");
		 }
	}
}
}
