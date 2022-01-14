package week3.day2;

public class FindTypes {
	
	public static void main(String[] args) {
		String text = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] textarray = text.toCharArray();
		for(int i=0; i<textarray.length-1;i++) {
		if(Character.isLetter(textarray[i]) == true) {   
			letter = letter+1;
		}
		else if(Character.isSpaceChar(textarray[i]) == true) {
			space = space+1;
		}
		else if(Character.isDigit(textarray[i]) == true) {
			num= num+1;
		}else {
			specialChar = specialChar+1;
		}
		}
		System.out.println("number of letters "+letter);
		System.out.println("number of space "+space);
		System.out.println("number of digit "+num);
		System.out.println("number of special character "+specialChar);
		
	}


}
