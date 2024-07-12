package shashankkumartesting;

public class Vowel_Count_From_String {
	
	public static void main(String[] args) {
		String s = "Bangalore";
		int vowel =0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch=='i' || ch =='o' || ch =='u') {
				vowel++;
			}
		}
		
		System.out.println(vowel);
	}

}
