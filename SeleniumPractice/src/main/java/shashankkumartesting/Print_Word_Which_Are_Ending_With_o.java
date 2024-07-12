package shashankkumartesting;

public class Print_Word_Which_Are_Ending_With_o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello who are you";
		
		String arr[]= s.split(" ");
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			if(str.charAt(str.length()-1)=='o') {
				System.out.println(str);
			}
		}

	}

}
