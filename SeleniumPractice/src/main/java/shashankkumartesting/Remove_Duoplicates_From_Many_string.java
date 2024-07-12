package shashankkumartesting;

public class Remove_Duoplicates_From_Many_string {
	
	public static void main(String[] args) {
		String s[]= {"bangalore","hydrabad","chennai","mumbai"};
		
		for(int i=0; i<s.length; i++) {
			String s2 = s[i];
			String str = "";
			
			for(int j=0; j<s2.length(); j++) {
				if(str.indexOf(s2.charAt(j))==-1) {
					str = str+s2.charAt(j);
				}
			}
			System.out.println(str);
		}
		
		
	}

}
