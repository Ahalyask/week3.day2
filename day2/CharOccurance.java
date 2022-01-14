package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String text = "wlecome to java";
		char c = 'a';
		int count =0;
		char[] textarray = text.toCharArray();
		for(int i=0; i<textarray.length-1;i++) {
			if(c == textarray[i]) {
				count=count+1;
			}
		}
		System.out.println("count of occurence of char "+c+" in text is "+count);
	}

}
