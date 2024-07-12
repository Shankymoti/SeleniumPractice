package shashankkumartesting;

public class RemoveSpaceBtwWords {
public static void main(String[] args) {
	String s = "I love Banglore";
	System.out.println(s.replace(" ", ""));
	// Second Approach
	String s1 = "I love Banglore";
	String str[] = s1.split(" ");
	for(int i=0; i<str.length; i++) {
		System.out.print(str[i]);
	}
}
}
