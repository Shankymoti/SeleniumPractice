package shashankkumartesting;

public class Replace_String {
	public static void main(String[] args) {
		String s = "I am Selenium";
		//putput : m ui nelesmai
		s= s.toLowerCase();
		char ch[]=s.toCharArray();
		
		int start =0;
		int end = ch.length-1;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[start] >= 'a' && ch[start]<= 'z') {
				//System.out.println("In first if block");
				if(ch[end] >= 'a' && ch[end] <= 'z') {
					//System.out.println("In second if block");
					if(start<end) {
						//System.out.println("In third if block");
						char temp = ch[start];
						ch[start] =ch[end];
						ch[end] = temp;
						start++;
						end--;
					}
				}
				else {
					end--;
				}
			}
			else {
				start++;
			}
		}
		
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
