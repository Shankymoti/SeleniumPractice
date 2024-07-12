package shashankkumartesting;

public class Reverse_String_The_Same_Position {
	
	public static void main(String[] args) {
		String s= "Banglore is famous for traffic jam";
		
		//output=erolgnaB si suomaf rof ciffart maj 
		
		//String rev ="";
		String str[] = s.split(" ");
		String rev = "";
		for(int i=0; i<str.length; i++) {
			String s2 = str[i];
			//System.out.println(s2);
			
		for(int j=s2.length()-1; j>=0; j--) {
			rev =rev+s2.charAt(j);
		}
		rev= rev +" ";
		}
		
		System.out.println(rev);
	}

}
