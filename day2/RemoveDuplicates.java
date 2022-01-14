package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> textSet = new LinkedHashSet<String>();
		for(int i=0;i<split.length;i++) {
			textSet.add(split[i]);
		}
		System.out.println(textSet);
//		List<String> textlist = new ArrayList<String>(textSet);
//		System.out.println(textlist);

	}

}
