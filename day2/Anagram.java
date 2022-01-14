package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "poss"; 
		
		if(text1.length() ==text2.length()) {
			char[] text1array = text1.toCharArray();
			char[] text2array = text2.toCharArray();
			Arrays.sort(text1array);
			Arrays.sort(text2array);
			System.out.println(text1array);
			System.out.println(text2array);
			if(text1array.equals(text2array)) {
				System.out.println(text1+" is anagram of "+text2);
			}else {
				System.out.println(text1+" is not anagram of "+text2);
			}
		}else {
			System.out.println(text1+" "+ text2+" text is not same");
		}

	}

}
