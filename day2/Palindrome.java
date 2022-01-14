package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String s ="madam";
		String rev = "";
		int lengthOfs = s.length();
		
		for(int i=lengthOfs-1; i>=0 ;i--) {
			char charAt = s.charAt(i);
			rev = rev +charAt;			
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println(s+" is Palindrom");
		}else {
			System.out.println(s+ " is not Palondrome");
		}
		

	}

}
