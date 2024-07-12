package shashankkumartesting;

public class Count_Of_Vowel_In_Given_String_Array {

	public static void main(String[] args) {
	
		
		String [] s= {"bangalore","hydrabad","chennai","mumbai"};
		
		int count;
		
		for(int i = 0; i<s.length; i++) {
			String s2 = s[i];
			String str = "";
			count =0;
			for(int j=0; j<s2.length(); j++) {
				
				char ch = s2.charAt(j);
				if(str.indexOf(ch) == -1) {
					if(ch == 'a' || ch == 'e' || ch=='i' || ch == 'o' || ch =='u') {
						str = str + ch;
						count ++;
					}
				}
				
			}
			System.out.println(str+"     "+count);
			
		}

	}

}
