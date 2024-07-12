package shashankkumartesting;

import java.util.LinkedHashSet;

public class Count_Occurance_Of_Duplicate_word {
	
	public static void main(String[] arg) {
		String str = "I am am from i banglore";
		str = str.toLowerCase();
		
		String arr[] = str.split(" ");
		
		
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
			
		}
		
		for(String stri : set) {
			int count = 0;
			
			for(int i = 0; i< arr.length; i++) {
				
				if(stri.equals(arr[i]))
				{
					count++;
					
				}
			}
			if(count > 1) {
				System.out.println(count +"   "+stri +"  "+set);
			}
		}
		
		
		// Second Approach  to Print duplicate words
		
		String str1 = "I am am from i banglore";
		
		str1 = str1.toLowerCase();
		
		String arr2[] = str.split(" ");
		
		int count;
		
		for(int i = 0; i< arr2.length; i++) {
			count =0;
			
			for(int j=i+1; j<arr2.length; j++) {
				if(arr[i].equals(arr[j])) {
					count++;
					arr2[j] = "0";
				}
			}
			if(count>0 && arr[i] != "0") {
				System.out.println(arr[i]+"   "+count);
			}
		}
 	}

}
