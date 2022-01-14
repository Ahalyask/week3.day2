package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] testsplit = test.split(" ");
		for(int i=0; i<=testsplit.length-1;i++) {
			if(i%2 != 0) {
				char[] charArray = testsplit[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
				}		System.out.print(" ");			
			}else {
				char[] charArray = testsplit[i].toCharArray();
				for(int j=0;j<=charArray.length-1;j++) {
					System.out.print(charArray[j]);							
		}System.out.print(" ");
		
			}
	}

}}
